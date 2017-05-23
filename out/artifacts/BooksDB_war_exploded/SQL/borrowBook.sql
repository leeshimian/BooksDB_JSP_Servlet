--借书存储过程
CREATE procedure usp_BorrowBook
	@bkID char(9),
	@rdID char(9)
as
	begin
		--判断书是否在馆
		declare @bkState bit
		select @bkState = bkState from Book where bkID = @bkID
		if @bkState = 0 or @bkState is null
		begin
			raiserror('该图书不在馆',10,1)
			return
		end
		--判断读者借书数量是否达到了上限
		declare @rdBorrowQty int,@canLendQty int
		select @rdBorrowQty = rdBorrowQty from Reader
		select @canLendQty=canLendQty from ReaderType 
		where rdType in (select rdType from Reader where rdID = @rdID)
		if @rdBorrowQty>=@canLendQty
		begin
			raiserror('借书以达上限',10,1)
			return
		end
		--借书过程
		--a.将图书在馆状态填为1
		update Book
		set bkState = 0
		where bkID = @bkID
		--b.将读者已借书数量加1
		update Reader set rdBorrowQty = rdBorrowQty+ 1 where rdID = @rdID
		--c.向Borrow表添加借书信息
		declare @canLendDay int
		select @canLendDay = canLendDay from ReaderType 
		where rDType in (select rDType from Reader where rdID = @rdID)

		insert into Borrow values (@rdID,@bkID,GETDATE(),DATEADD(DD,@canLendDay,GETDATE()),null)
	end

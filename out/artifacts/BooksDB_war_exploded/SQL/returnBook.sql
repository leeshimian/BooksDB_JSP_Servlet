--还书存储过程
CREATE procedure usp_ReturnBook
	@bkID char(9),
	@rdID char(9)
as
	--1.从Borrow表查找记录，看此人是否有借书记录，并且DateLendAct为null
	if not exists (select * from Borrow where bkID = @bkID and rdID = @rdID)
	begin
		raiserror('没有此人借书记录',10,1)
		return
	end
	declare @DateLendAct Datetime
	select @DateLendAct = DateLendAct from Borrow where bkID = @bkID and rdID = @rdID
	if @DateLendAct is not null
	begin
		raiserror('没有此人借书记录',10,1)
		return
	end
	--2.还书
	--a.将Borrow表里面的DateLendAct补充完整
	update Borrow set DateLendAct = GETDATE()
	where bkID = @bkID and rdID = @rdID
	--b.将该学生的rdBorrowQty减少1
	update Reader set rdBorrowQty = rdBorrowQty - 1
	where rdID = @rdID
	--c.将图书馆的在馆状态设置成1
	update Book set bkState = 1
	where bkID = @bkID

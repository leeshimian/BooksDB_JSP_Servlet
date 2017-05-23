--触发器  当删除的图书状态为0的时候，不能删除
CREATE TRIGGER deleteBook ON Book
FOR DELETE
AS
DECLARE @bkState int
SET @bkState = (SELECT bkState FROM deleted)
IF (@bkState = 0)
BEGIN
	ROLLBACK
END
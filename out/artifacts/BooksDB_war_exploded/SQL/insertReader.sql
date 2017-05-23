--向读者表插入读者信息时，类型不能超过读者类型表中的类型大小
CREATE TRIGGER insert_reader ON Reader
FOR INSERT,UPDATE
AS
declare @rdType INT
declare @rdType_1 INT
SET @rdType = (SELECT rdType FROM inserted)
SET @rdType_1 = (SELECT rdType FROM ReaderType)
if(@rdType >@rdType_1)
	BEGIN
		ROLLBACK
	END

CREATE DATABASE BooksDB
GO
USE BooksDB
GO

--创建读者类别表 ReaderType
CREATE TABLE ReaderType(
	rdType        INT PRIMARY KEY,    --读者类别号
	rdTypeName    VARCHAR(20),         --读者类别名称
	canLendQty    INT,                 --可借书数量
	canLendDay    INT	                 --可借书天数
)
GO

--创建读者表 Reader
CREATE TABLE Reader(
	rdID         CHAR(9) PRIMARY KEY,                 --读者编号
	rdType       INT REFERENCES ReaderType(rdType),   --读者类别
	rdName       VARCHAR(20),                          --读者姓名
	rdDept       VARCHAR(40),                          --读者单位
	rdQQ         VARCHAR(13),                          --读者QQ
	rdBorrowQty  INT  DEFAULT 0 CHECK(rdBorrowQty BETWEEN 0 AND 10)  --已借书数量
)
GO

--创建图书表 Book
CREATE TABLE Book(
	bkID         CHAR(9)  PRIMARY KEY,   --书号
	bkName       VARCHAR(50),             --书名
	bkAuthor     VARCHAR(50),             --作者
	bkPress      VARCHAR(50),             --出版社
	bkPrice      DECIMAL(5,2),            --单价
	bkState      INT DEFAULT 1            --是否在馆，1：在馆， 0：不在馆
)
GO

--借阅表
CREATE TABLE Borrow(
	rdID           CHAR(9),         --读者编号
	bkID           CHAR(9),         --书号
	DateBorrow     DateTime,        --借书日期
	DateLendPlan   DateTime,        --应还日期
	DateLendAct    DateTime,        --实际还书日期
	PRIMARY KEY(rdID, bkID)
)

GO

--管理员表
CREATE TABLE usertable(
  username    char(10),
  password    char(10)
)
GO

--向usertable表插入数据
INSERT into usertable values('root', 'root');

--向ReaderType表中插入测试数据
insert into ReaderType   values(1, '教师', 10, 60);
insert into ReaderType 	values(2, '本科生', 5, 30);
insert into ReaderType  values(3, '硕士研究生', 6, 40);
insert into ReaderType 	values(4, '博士研究生', 8, 50);

--向Reader表中插入测试数据
insert into Reader values('rd2017001', 1, '王桃群', '计算机科学学院', '3635751',     0)
insert into Reader values('rd2017002', 2, '孙小美', '英语学院', '11223344',  0)
insert into Reader values('rd2017003', 3, '连晓燕', '管理学院', '55996633',  0)
insert into Reader values('rd2017004', 4, '许苗', '物理学院', '88552277',  0)

--向Book表中插入测试数据
insert into Book values('bk2017001', '数据库原理及应用', '王丽艳', '机械工业出版社', 33.00, 1)
insert into Book values('bk2017002', '高等数学', '同济大学数学系', '高等教育出版社', 32.00, 1)
insert into Book values('bk2017003', '当代教育心理学', '陈琦', '北京师范大学出版社', 37.20, 1)
insert into Book values('bk2017004', '古代汉语', '王力', '中华书局', 20.40, 1)


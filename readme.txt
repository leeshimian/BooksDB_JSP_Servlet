名称：   图书管理系统
时间：   2017年5月
作者：   李诗勉
数据库： SQL Server2008R2
IDE：    IntelliJ IDEA 2017.1.3
JDK:     JDK1.8.0_112
TOMCAT:  tomcat7.0.69

所有文件均为UTF-8格式，可能会遇到GBK格式的编辑器打开含有中文的文件乱码
比如用SQL Server直接打开SQL文件会乱码，建议先用记事本打开，然后复制内容到SQL Server

网站登录账号：root
网站登录密码：root

数据库登录账号：sa
数据库登录密码：root

本程序数据库中没有单独的id字段，程序的查找是依据各“ *ID ”
故修改表内容的时候不要修改各“ *ID ”

本网站目前使用JSP+JavaBean实现

/src  java源代码
/web  网页源代码
/out  部署目录

src/com/books/conn      数据库链接
src/com/books/model     实体类，定义基本属性
src/com/books/service   数据库操作
src/com/books/servlet   servlet

/web/SQL/BooksDB.sql         创建数据库
/web/SQL/borrowBook.sql      存储过程：借书
/web/SQL/returnBook.sql      存储过程：还书
/web/SQL/deleteBook.sql      触发器：禁止删除State等于0的记录
/web/SQL/insertReader.sql    触发器：禁止插入rdType大于4的读者

/web/WEB-INF/classes    编译后的classes文件

/web/WEB-INF/lib        库文件

/web/add*.jsp           增
/web/delete*.jsp        删
/web/modify*.jsp        改
/web/display*.jsp       查
/web/borrow*.jsp        借书
/web/return*.jsp        还书
/web/index.jsp          登陆
/web/validate.jsp       处理登陆
/web/main*.jsp          主界面
/web/top.jsp            界面顶部
/web/bottom.jsp         界面底部

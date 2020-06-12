## 码匠社区

## 资料
[Spring 文档](https://spring.io/guides)

[Spring Web](https://spring.io/guides/gs/serving-web-content/)

[es](https://elasticsearch.cn/explore)

[Bootstrap](https://v3.bootcss.com/getting-started/)

[Github OAuth(授权)](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)

[Spring内置数据库](https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/htmlsingle/#boot-features-embedded-database-support)

## 工具
[Git](https://git-scm.com/download)

[Visual Paradigm](https://www.visual-paradigm.com)


## Cookie Session
Cookie:相当于银行卡，里面的name相当于卡号，value相当于卡号里对应的唯一标识

Sessio:相当于银行账户

浏览器:相当于你自己

服务器:相当于银行

## 脚本
```sql
create table USER
(
	ID INT auto_increment,
	ACCOUNT_ID VARCHAR(100),
	NAME VARCHAR(50),
	TOKEN CHAR(36),
	GMT_CREATE BIGINT,
	GMT_MODIFIED BIGINT,
	primary key (ID)
);
```
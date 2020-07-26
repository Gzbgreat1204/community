## 码匠社区

## 在线演示地址
[www.gzbgreat.co](http://http://106.75.79.218)

## 功能列表
开源论坛、问答系统，现有功能提问、回复、通知、最新、最热、消除零回复功能。功能持续更新中…… 

## 技术栈
| **技术栈** | **官网文档** |
| :-----| :----- |
| Spring Boot | http://projects.spring.io/spring-boot/#quick-start |
| MyBatis | https://mybatis.org/mybatis-3/zh/index.html | 
| MyBatis Generator | http://mybatis.org/generator/ |
| H2 | http://www.h2database.com/html/main.html |
| Flyway | https://flywaydb.org/getstarted/firststeps/maven |
| Bootstrap | https://v3.bootcss.com/getting-started/ |
| Github OAuth | https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/ |
| UFile | https://github.com/ucloud/ufile-sdk-java |

## 本地运行手册
1.安装必备工具： JDK，Maven

2.克隆代码到本地
```bash
    git clone https://github.com/codedrinker/community.git
```
3.运行打包命令
```bash
    mvn package
```
4.运行项目
```bash
    java -jar target/community-0.0.1-SNAPSHOT.jar
```
5.访问项目
```bash
    http://localhost:8887
```
## Cookie Session
Cookie:相当于银行卡，里面的name相当于卡号，value相当于卡号里对应的唯一标识

Sessio:相当于银行账户

浏览器:相当于你自己

服务器:相当于银行

## 脚本
### 未使用flyway之前的数据库脚本
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
### 常用命令
```bash
    git clone https://github.com/Gzbgreat1204/community.git
    git pull
    mvn clean compile flyway:repair
    mvn clean compile flyway:migrate
    mvn package
    java -jar -Dspring.profiles.active=production target/community-0.0.1-SNAPSHOT.jar
    vim src/main/resources/application-production.properties
    mvn flyway:migrate
    mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate
```
## 扩展资料
[Spring 文档](https://spring.io/guides)

[Spring Web](https://spring.io/guides/gs/serving-web-content/)

[es](https://elasticsearch.cn/explore)

[Bootstrap](https://v3.bootcss.com/getting-started/)

[Github deploy key](https://developer.github.com/v3/guides/managing-deploy-keys/#deploy-keys) 

[Github OAuth(授权)](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)

[Spring内置数据库](https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/htmlsingle/#boot-features-embedded-database-support)

[菜鸟教程](https://www.runoob.com/mysql/mysql-insert-query.html) 

[Spring MVC](https://docs.spring.io/spring/docs/5.0.3.RELEASE/spring-framework-reference/web.html#mvc-handlermapping-interceptor)

[Markdown 插件](http://editor.md.ipandao.com/)

[UFfile SDK](https://github.com/ucloud/ufile-sdk-java)

[Git](https://git-scm.com/download)

[Visual Paradigm](https://www.visual-paradigm.com)

[Flyway](https://flywaydb.org/getstarted/firststeps/maven)

[Lombok](https://projectlombok.org/)

[Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html#setting-attribute-values)

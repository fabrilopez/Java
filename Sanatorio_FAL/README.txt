For this simple project I use MySql 5.5, the database name is "db_mvcproject", the user and password for this database is "mvcproject".
The Web Server I use for this project is Tomcat 6.


This is the sql script for create de Table that I use in this project:
 CREATE TABLE user (
 user_id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
 username VARCHAR(50) NOT NULL,
 password VARCHAR(50) NOT NULL,
 email VARCHAR(50) NOT NULL,
 name VARCHAR(50) NOT NULL,
 surname VARCHAR(50) NOT NULL,
 added_date DATETIME NOT NULL);
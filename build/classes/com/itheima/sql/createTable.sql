CREATE TABLE teacher
(
	tid INT(10) PRIMARY KEY AUTO_INCREMENT,
	tname VARCHAR(20),
	tusername VARCHAR(20),
	tpassword VARCHAR(15)

);
CREATE TABLE student 
(
	sid INT(6) PRIMARY KEY AUTO_INCREMENT,
	sname VARCHAR(20),
	sex INT(1),#0����δ֪��1�����У�2����Ů
	sage INT(3),
	steacherid INT (10)
);
INSERT INTO teacher (tname,tusername,tpassword) VALUES('С��','username','123456');
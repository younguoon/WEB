--------------------------------------------------------
--  ������ ������ - ȭ����-8��-23-2016   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table MYEMP
--------------------------------------------------------

  CREATE TABLE "MYEMP" 
   (	"ID" VARCHAR2(20), 
	"PASS" VARCHAR2(20), 
	"ADDR" VARCHAR2(20), 
	"SAL" NUMBER, 
	"GRADE" VARCHAR2(20), 
	"DEPTNO" VARCHAR2(20), 
	"NAME" VARCHAR2(20)
   )
REM INSERTING into MYEMP
SET DEFINE OFF;
Insert into MYEMP (ID,PASS,ADDR,SAL,GRADE,DEPTNO,NAME) values ('kim','1234','����',1000,'B','001','�����');
Insert into MYEMP (ID,PASS,ADDR,SAL,GRADE,DEPTNO,NAME) values ('jang','1234','����',1000,'10','002','�嵿��');
Insert into MYEMP (ID,PASS,ADDR,SAL,GRADE,DEPTNO,NAME) values ('young','1235','����',1001,'A','4','����');
Insert into MYEMP (ID,PASS,ADDR,SAL,GRADE,DEPTNO,NAME) values ('byun','1236','����',1002,'A','5','������');
Insert into MYEMP (ID,PASS,ADDR,SAL,GRADE,DEPTNO,NAME) values ('lee','1237','����',1003,'A','6','�̹μ�');

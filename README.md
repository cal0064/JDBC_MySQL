# Welcome to the JDBC_MySQL wiki!
This document has 2 parts to it , creating a Database / User from scratch via MySQL and then connecting to it via Java using out JDBC thin Client .  The code also shows some ways to best handle JDBC connections - creation , execution and proper Closing .
## BackEnd 
Open MySQL Work Bench
(You can easily download a Windows Community installer from https://www.mysql.com/ - need a Oracle account )
Home Screen --> Server Administrator --> DOUBLE CLICK LocalMySQL Server Icon 
Under SECURITY , Click User annd password only -Add Account- Keep the rest as default .

In the Home Screen under SQL Development , Click New Connection
On the Popup 
Connection Name - ANy Name 
Host Name - Keep Default - make a note
Port - Keep Default - make a note - usually 3306 for MySqL DB
User - the new username u created 
password - Click on Store in Value Button - give the password you Created .
Default Schema - MySql Default is test - pre Populated . If you have created a DB already - you can give that . For this example i have created a Schema called world , and made that my users (cal0064)`s default Schema. Somewhere to log on to when you open the DB connection .
Test Connection 

Your account should be now associated with your Schema directly , with standard access .  You might want to create a table like the following 

`create table Employee(`
`id int,`
`name varchar(30)`
`);`
and insert some values

`insert into Employee values`
`(`
`10511110965, 'Kaustav Chatterjee'`
`)`
`commit`

## Front End 

In your Eclipse please use the packt/Spring/JDBC/model and run EmployeeDataMainFile to see results .

Please download class12 Jar file (attached in code and add as an external jar in your eclipse project(
You need to update DB_URL in EmployeeDaoImpl Class .

Thank You !

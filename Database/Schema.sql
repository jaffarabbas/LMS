--Remove -- to create database LMS

--create database LMS
--go

use LMS
go

--Table for Book class
create table Book
(
[Name] varchar(30) not null,
Author varchar(30) not null,
ISBN char(13) primary key,
[Status] varchar(20),
quantity int not null	
)
go

--Table for book record
create table BookRecord
(
id int primary key identity(1,1),
isuser varchar(30),
book char(13),
issueDate datetime not null,
returnDate datetime,
dueDate datetime not null,
)
go

--Table for User
create table [User]
(
username varchar(30) primary key,
[password] varchar(30),
[Name] varchar(30),
Gender varchar(6),
Age int,
)
go

--Table for Librarian
--Modify this for any extra attribute of Librarian, delete in case of no new attribute
create table Librarian
(
username varchar(30)
)
go

--Table for Borrower
--Modify this for any extra attribute of Borrower, delete in case of no new attribute
create table Borrower
(
username varchar(30)
)
go

--Table for clerk
--Modify this for any extra attribute of clerk, delete in case of no new attribute
create table Clerk
(
username varchar(30)
)
go



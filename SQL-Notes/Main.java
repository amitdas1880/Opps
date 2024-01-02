
1.Create Table :- 
  create table customers (
  customer_id number,
  first_name varchar,
  last_name varchar,
  age number,
  country varchar,
  DOB date
  )
  
2.Insert table :-
  insert into customers(customer_id,first_name,last_name,age,country,DOB)values(1,'Amit','Das',27,'India','17-01-1995')

3.view the column detail according to requirment :- 
  select first_name,age,country from customers ;
  
4.if we need to see all the column of the table :-
  select * from customers ;
  
5. Delete all the data of the table but table is still existing :- 
   Truncate table customers ;
   
6.Delete the table :- 
  Drop table customers ;
  
WHERE CLAUSE :- 
Note : Where clause is not only use to filter the information according to the requirment ,But also it is used to
       update, delete the required information.
       
7.Filter the information according to the requirment : - 
  select * from customers where first_name ='Amit';
  select * from customers where age = 27;
  select * from customers where age >= 22;
  select * from customers where age != 22;
  
Operator :- 
8.in : - in operator help to filter the more the one condition in a given table.
  select * from customers where last_name in ('Doe','Luna','tiwari');
 
8.1.not in : - in operator help to filter the more the one condition in a given table.
    select * from customers where last_name not in ('Doe','Luna','tiwari');

  
9.Like :- Like operator is used in WHERE CLAUSE to search for a the specific pattern in a column.
    select * from customers where first_name like 'a%'	        //Finds any values that start with "a"
    select * from customers where first_name like '%a'	        //Finds any values that end with "a"
    select * from customers where first_name like '%or%'	    //Finds any values that have "or" in any position        // (output :- sh'ar'ma, Reinh'ar'dt).
    select * from customers where first_name like '_r%'	        //Finds any values that have "r" in the second position //if last name is 'Sharma' (Three underscore( '___' ) is used only for 'sha')
    select * from customers where first_name like 'a_%'	        //Finds any values that start with "a" and are at least 2 characters in length
    select * from customers where first_name like 'a__%'	    //Finds any values that start with "a" and are at least 3 characters in length 
    select * from customers where first_name like 'a%o'	        //Finds any values that start with "a" and ends with "o"

9.1.Not Like :- 
    select * from customers where first_name not like 'a%'	        
    select * from customers where first_name not like '%a'	        
    select * from customers where first_name not like '%or%'	   
    select * from customers where first_name not like '_r%'	       
    select * from customers where first_name not like 'a_%'	      
    select * from customers where first_name not like 'a__%'	  
    select * from customers where first_name not like 'a%o'	      

10.Between :- 
    Eg: Find out the detail of those customers whose age is between 25 to 31.
      select * from customers where age between 25 and 31;
                        //OR
      select * from customers where age >=25 and age <=31;
      select * from customers where Dob  between #07-10-2020# and #17-01-2023#;
      select * from customers where first_name  between 'Amit' and 'John';

10.1.Not Between :- 
    Eg: Find out the detail of those customers whose age is not between 25 to 31.
      select * from customers where age not between 25 and 31;
      select * from customers where first_name not between 'Amit' and 'John';

                  

11.condition (and, or) :-
      select * from customers where first_name ='Amit' or last_name ='Das' ;
      select * from customers where age >=25 and age <=31;
      select * from customers where first_name ='Amit' and last_name ='Das' and age = 27 ;
    
    Use of both condition "AND , OR".
      select * from customers where first_name ='Amit' and last_name ='Das' or age =32 ;
      
12.Null :- 
      select * from customers where age is null;
                //OR
      select * from customers where age = null;
      
(Aggregate function :- (Count(),Distinct(),Max(),Min(),Avg(),Sum()))    
13.Count() :- it is used to find out the total number of rows present in the table.
      select count(*) from customers;
      
    Eg: count how many customers whose age is more then 30.
      select count(*) from customers where age  >= 30;
      
14.Distinct() :- // intput age (12,20,22,25,22,12,30,31,25,32,33,35,24)
   select distinct(age) from customers where age  >= 30;     //output(30,32,33,35)
   select distinct(age) from customers;                     //output(12,20,22,25,30,31,32,33,25,24)
   
15.Max() :- 
   select max(age) from customers;
   select max(age) from customers where age >31;
   select max(age) from customers where country ='India'; //(find out the max age of the customer live in india )
 
16.Min() :-
   select min(age) from customers;
   select min(age) from customers where age >31;
   
17.Avg() :- 
   select avg(age) from customers;
   select avg(age) from customers where age >30;

18.Sum() :- 
   select sum(age) from customers;
   select sum(age) from customers where age >30;
   
19.Round() :- 
   select round(avg(age)) from customers;
   select round(avg(age)) from customers where age >30;

20.Ceil() :- 
   select ceil(avg(age)) from customers ;               // if avg age is 28.5 OR 28.6 then ceil value = 29. 
   select ceil(avg(age)) from customers where age >30;

21.Floor() :- 
   select Floor(avg(age)) from customers ;               // if avg age is 28.5 OR 28.6 then floor value = 28. 
   select Floor(avg(age)) from customers where age >30;
 
22.Group By :- 
   Eg:- How to get number of each customer from each country.
   select count(customer_id),country from customers group by country ;

23.Having Clause :- 
   Eg:- How to get number of each customer from each country more then equal to two.
   select count(customer_id),country from customers group by country having count(country)>=2;

24.Order by :- Order by keyword is used to sort the records in to ascending and decending order. 
               By default it sort ascending order.
    Ascending order ->
    select * from customers order by country ;
    select * from customers order by country, city ;
    
    Decending order ->
    select * from customers order by customerID DESC ;
    
    Sort both Ascending and Decending Order ->
    select * from customers order by country ASC, customerID DESC ;

25.Limit :-
   Eg : show the records of 10 customers.
   select * from customers limit 10;
   
26.union :- The union operator is used to combine two or more table. 
          i.Every selected table which i want to union, must have the same number of columns.
         ii.Every columns must have similar number of data types.
        iii.The columns in the selected table must be in same order.
    
    SELECT City FROM Customers UNION SELECT City FROM Suppliers ORDER BY City;
Note:- union given only unique value. its not give duplicate value.

27.Update :- The update statement is used to modify the existing records in the table.
   Syntax :- 
   UPDATE Customers
   SET ContactName='Amit', Country='INDIA',CustomerName ='Amit kumar das',City='Jamshedpur'
   WHERE CustomerID=1;

28.Delete : - Delete statement is used to delete existing record (Rows) from the table.
   Syntax :-
   Delete From Customers where customerID =1;
   
Alter Table   
29.RENAME :- (Column Name)
   Syntax :-
   ALTER TABLE table_name 
   RENAME COLUMN old_column_name TO new_column_name ;

30.ADD COLUMN :- 
   Syntax:- 
   ALTER TABLE table_name
   ADD COLUMN column_name data_type;
   
31.DELETE COLUMN :- 
   Syntax :- 
   ALTER TABLE table_name
   DROP COLUMN column_name;
   
Join :-
32.Inner Join :- 
   Syntax:- 
    SELECT Orders.OrderID, customers.CustomerName, Orders.OrderDate
    FROM Orders INNER JOIN Customers
    ON Orders.CustomerID=Customers.CustomerID;

33.Left Inner Join :- 
   Syntax:
   SELECT customers.CustomerName, Orders.OrderID
   FROM Customers
   LEFT JOIN Orders
   ON Customers.CustomerID=Orders.CustomerID
   
34.Right Inner Join :- 
   Systax:
   SELECT Orders.OrderID, customers.First_Name, customers.Last_Name
   FROM Customers
   RIGHT JOIN Orders
   ON Customers.CustomerID=Orders.CustomerID
   
35.FULL OUTER Inner Join :- 
   Syntax:
   SELECT customers.CustomerName, Orders.OrderID
   FROM Customers
   FULL OUTER JOIN Orders
   ON Customers.CustomerID=Orders.CustomerID


Subquery :- 









  


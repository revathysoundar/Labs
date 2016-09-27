-- #1 Select all rows from Customers table

SELECT * FROM northwind.customers;

-- #2 Distinct countries from Customers table

Select DISTINCT country_region from customers ;

-- #3 Select all rows from Customers Table where last_name starts with 'B'

SELECT * from customers where last_name LIKe 'B%';

-- #4 Get first 10 records from Orders table

Select * from orders LIMIT 10;

-- #5 Get customers who live in postal codes 1010,3012,12209

select * from customers where zip_postal_code IN(1010,3012,12209,05023, 99999);

--#6 Getorders where ShipRegion is not equal to null

Select * from orders where ship_country_region is NOT NULL;

-- #7 Get customers ordered by the country, then by the city

select * from customers order by country_region, city;

-- #8 Add a new customer to the customer table

Insert into customers(id, company, last_name, first_name, email_address, job_title)
values (30,' Company Z', 'Raja', 'Revathy', 'reva@gmail.com', 'Developer');

-- #9 update zipcode in orders table

update orders set ship_zip_postal_code = 97201 where ship_city = 'Portland';

-- #10 delete from order-details table

delete from order_details where quantity = 1;

-- #11 Select avg, max, min for quantity

select avg(quantity), max(quantity), min(quantity) from order_details;

-- #12 group by order id

select order_id, avg(quantity), max(quantity), min(quantity) from order_details group by order_id;

-- #13 CustomerId that placed order

select customer_id from orders where id = 65;

-- #14 Inner join, Left join, right join

select * from orders o INNER JOIN customers c on o.id = c.id;

select * from orders o RIGHT JOIN customers c on o.id = c.id;

select * from orders o LEFT JOIN customers c on o.id = c.id;

-- #15 first_name is null

select first_name from employees where notes is NULL;

-- #16 join

select ship_city from orders o  Inner join customers c on c.first_name = 'Francisco'; 


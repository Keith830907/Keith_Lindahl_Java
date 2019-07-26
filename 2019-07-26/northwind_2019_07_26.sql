use northwind;
-- What are the categories of products in the database?
use northwind;
 select category from products;
-- What products are made by Dell?
select * from products
where product_code = 'P3';
-- List all the orders shipped to Pennsylvania.
select * from orders
where ship_state = 'Pennsylvania';
-- List the first name and last name of all employees with last names that start with w
select first_name, last_name
FROM employees
where last_name like 'w%';
-- List all customers from zipcodes that start with 55
select * from customers
where postal_code between 55000 and 55999;
-- List all customers from zipcodes that end with 0
select * from customers
where postal_code like '____0';
-- List the first name, last name, and email for all customers with a .org email address
select first_name, last_name, email from customers
where email LIKE '%org%';
-- List the first name, last name, and phone number for all customers from the 202 area code
select first_name, last_name, phone from customers
where phone LIKE '%202%';
-- List the order id for each order placed by George Wilson
select id from orders 
where ship_name = 'George Wilson';
-- List all the products and quantities associated with order 4003
select * from products, order_details, orders, employees, customers
where order_id like '%4003%';

SELECT orders.ship_name FROM orders
    inner join employees ON orders.employee_id = employees.id
where employees.first_name = 'Keith' and employees.last_name = 'Lawrence'
    and orders.order_status = 'Complete';
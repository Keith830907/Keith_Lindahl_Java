use northwind;

select * from customers;

select product_code, category from products;

select * from employees;
use northwind;
select * from products where category = 'camera';

use northwind;
select * from orders
where shipping_fee between 6 and 8;


select * from orders
where ship_country = 'Brazil';

select * from orders
where ship_name = 'Alice Warren' or ship_name = 'Wanda Hill' ;

select * from orders
where ship_name = 'Wanda Hill';

select * from customers 
where state in('Ohio', 'Iowa', 'Texas')
order by state;



select * from customers
where city like('o%');

select * from employees
where first_name like 'j%'
and last_name like 'b%';

-- insert into employees a new employee
insert into employees (id, first_name, last_name) values (998, 'Andrew' , 'Harris');


-- grabs cities where name begins with S any letter for the _, and n as the third letter;
select * from orders
where ship_city like 'S_n%';

-- Alphabetical order
select first_name, last_name
FROM employees
order by last_name asc, first_name asc;

-- inner join example
select * from employees
where first_name = 'Keith' and last_name = 'Lawrence';

-- Let's get the names of the people that all the completed orders for Keith Lawrence were shipped to
-- important to understand
SELECT orders.ship_name FROM orders
    inner join employees ON orders.employee_id = employees.id
where employees.first_name = 'Keith' and employees.last_name = 'Lawrence'
    and orders.order_status = 'Complete';
    
-- Let's get the order numbers all of the orders for all of the employees
-- left outer join to display more and used more often then right outer join and shows null 
SELECT employees.first_name, employees.last_name, orders.id 
FROM employees
    left outer join orders on orders.employee_id = employees.id;
    
-- right outer join used less and leaves null out
    SELECT employees.first_name, employees.last_name, orders.id 
FROM employees
    right outer join orders on orders.employee_id = employees.id;
    





    

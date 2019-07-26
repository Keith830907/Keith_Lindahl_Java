use car_lot;

-- Add the following cars to inventory:
-- 2012 Red Honda Accord
INSERT INTO car_lot.car (id, make, model, model_year, color) 
VALUES (3, 'Honda', 'Accord', '2012', 'Red');
-- 2017 Black Chevy Impala
INSERT INTO car_lot.car (id, make, model, model_year, color) 
VALUES (4, 'Chevy', 'Impala', '2017', 'Black');
-- 2019 Siver Ford F-150
INSERT INTO car_lot.car (id, make, model, model_year, color) 
VALUES (5, 'Ford', 'F-150', '2019', 'Silver');
-- 2020 White Subaru Outback
INSERT INTO car_lot.car (id, make, model, model_year, color) 
VALUES (6, 'Subaru', 'Outback', '2020', 'White');
-- 2015 Silver Ford Mustang
INSERT INTO car_lot.car (id, make, model, model_year, color) 
VALUES (7, 'Ford', 'Mustang', '2015', 'Silver');
-- 2018 Blue Honda Ridgeline
INSERT INTO car_lot.car (id, make, model, model_year, color) 
VALUES (8, 'Honda', 'Ridgeline', '2018', 'Blue');
-- 2017 Gray Chevy Silverado
INSERT INTO car_lot.car (id, make, model, model_year, color) 
VALUES (9, 'Chevy', 'Silverado', '2017', 'Gray');


-- Make the following updates to the database:
-- Change all Hondas to Black
update car set color = 'Black'
where make = 'Honda';
-- Change 'Chevy' to 'Chevrolet'
update car set make = 'Chevrolet'
where make = 'Chevy';
-- Change all 2020 model years to 2019
update car set model_year = '2019'
where model_year = '2020';
-- Delete the following:
-- Delete all blue inventory
delete from car
where color = 'Blue';
-- Delete all Fords
delete from car
where make = 'Ford';
-- Delete all cars from 2012 and 2017
delete from car
where model_year between 2012 and 2017;
use car_lot;

-- Insert values for all columns
INSERT INTO car_lot.car (id, make, model, model_year, color) 
VALUES (22, 'Honda', 'Civic', '2020', 'blue');

-- Insert values for everything except model_year
INSERT INTO car_lot.car (id, make, model, color) 
VALUES (25, 'BMW', 'Z3', 'black');
use car;
select * from car_lot;
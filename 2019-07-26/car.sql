SELECT * FROM car_lot.car;

select * from car;

update car set model_year = 2012
where id = 25;

delete from car
where id = 25;

--- Insert values for everything except model_year
INSERT INTO car_lot.car (id, make, model, color) 
VALUES (25, 'BMW', 'Z3', 'black');


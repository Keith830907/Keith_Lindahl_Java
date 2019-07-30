package com.company.carlot.dao;

import com.company.carlot.model.Car;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CarLotJdbcTemplateImplTest {

    @Autowired
    protected CarLotDao dao;

    @Before
    public void setUp() throws Exception {
        // clean out the test db
        List<Car> mList = dao.getAllCars();

        mList.stream()
                .forEach(car -> dao.deleteCar(car.getId()));
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addGetDeleteCar() {

        Car car = new Car();
        car.setMake("Honda");
        car.setModel("Odyssey");
        car.setYear("2019");
        car.setColor("black");

        car = dao.addCar(car);

        Car car2 = dao.getCar(car.getId());

        assertEquals(car, car2);

        dao.deleteCar(car.getId());

        car2 = dao.getCar(car.getId());

        assertNull(car2);
    }

    @Test
    public void getAllCars() {

        Car car = new Car();
        car.setMake("Honda");
        car.setModel("CB300");
        car.setYear("2019");
        car.setColor("red");

        dao.addCar(car);

        car = new Car();
        car.setMake("Suzuki");
        car.setModel("DR650");
        car.setYear("2012");
        car.setColor("gray");

        dao.addCar(car);

        List<Car> carList = dao.getAllCars();

        assertEquals(carList.size(), 2);
    }

    @Test
    public void getCarsByMake() {
        Car car = new Car();
        car.setMake("Honda");
        car.setModel("Pilot");
        car.setYear("2019");
        car.setColor("red");

        dao.addCar(car);

        car = new Car();
        car.setMake("Suzuki");
        car.setModel("Samurai");
        car.setYear("2012");
        car.setColor("gray");

        dao.addCar(car);

        car = new Car();
        car.setMake("Suzuki");
        car.setModel("Swift");
        car.setYear("2016");
        car.setColor("black");

        dao.addCar(car);

        List<Car> cList = dao.getCarsByMake("Suzuki");
        assertEquals(cList.size(), 2);

        cList = dao.getCarsByMake("Honda");
        assertEquals(cList.size(), 1);

        cList = dao.getCarsByMake("Ford");
        assertEquals(cList.size(), 0);

    }

    @Test
    public void getCarsByColor() {
        Car car = new Car();
        car.setMake("Honda");
        car.setModel("Pilot");
        car.setYear("2019");
        car.setColor("red");

        dao.addCar(car);

        car = new Car();
        car.setMake("Suzuki");
        car.setModel("Samurai");
        car.setYear("2012");
        car.setColor("red");

        dao.addCar(car);

        car = new Car();
        car.setMake("Suzuki");
        car.setModel("Swift");
        car.setYear("2016");
        car.setColor("black");

        dao.addCar(car);

        List<Car> cList = dao.getCarsByColor("red");
        assertEquals(cList.size(), 2);

        cList = dao.getCarsByColor("black");
        assertEquals(cList.size(), 1);

        cList = dao.getCarsByColor("grey");
        assertEquals(cList.size(), 0);

    }


    @Test
    public void updateCar() {

        Car car = new Car();
        car.setMake("Honda");
        car.setModel("Odyssey");
        car.setYear("2019");
        car.setColor("black");

        car = dao.addCar(car);

        car.setMake("UPDATED");
        car.setModel("NEW MODEL");
        car.setYear("1111");
        car.setColor("NEW COLOR");

        dao.updateCar(car);

        Car car2 = dao.getCar(car.getId());

        assertEquals(car2, car);
    }
}


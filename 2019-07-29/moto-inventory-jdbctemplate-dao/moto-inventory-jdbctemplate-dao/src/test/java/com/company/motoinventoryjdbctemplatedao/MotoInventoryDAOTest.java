package com.company.motoinventoryjdbctemplatedao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MotoInventoryDAOTest {

    @Autowired
    protected MotoInventoryDAO dao;


    @Before//runs before every test
    public void setUp() throws Exception {
        //clean out the test db
        List<Motorcycle> motorcycleList = dao.getAllMotorcycles();

        motorcycleList.stream()
                .forEach(motorcycle -> dao.deleteMotorcycle(motorcycle.getId()));
    }
    @After
    public void tearDown() throws Exception{

    }

    @Test
    public void addGetDeleteMotorcycle(){
        //AAA - Arrange, Act, Assert
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.setMake("Honda");
        motorcycle.setModel("Tijuana");
        motorcycle.setVin("12345");
        motorcycle.setYear("2020");
        motorcycle.setColor("red");

        motorcycle = dao.createMotorcycle(motorcycle);

        Motorcycle motorcycle2 = dao.getMotorcycle(motorcycle.getId());

        assertEquals(motorcycle, motorcycle2);

        dao.deleteMotorcycle(motorcycle.getId());

        motorcycle2 = dao.getMotorcycle(motorcycle.getId());

        assertNull(motorcycle2);

    }
//    Motorcycle getMotorcycle(int id);
//    List<Motorcycle> getAllMotorcycles();
//    Motorcycle createMotorcycle(Motorcycle motorcycle);
//    void updateMotorcycle(Motorcycle motorcycle);
//    void deleteMotorcycle(int id);
//    List<Motorcycle> getByMake(String make);

    @Test
    public void getAllMotorcyclesShouldReturnSeveralMotorcycles(){
        //Arrange
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.setMake("Honda");
        motorcycle.setModel("Tijuana");
        motorcycle.setVin("12345");
        motorcycle.setYear("2020");
        motorcycle.setColor("red");
        dao.createMotorcycle(motorcycle);

        Motorcycle motorcycle2 = new Motorcycle();
        motorcycle2.setMake("Honda");
        motorcycle2.setModel("CBR");
        motorcycle2.setVin("54321");
        motorcycle2.setYear("2017");
        motorcycle2.setColor("blue");
        dao.createMotorcycle(motorcycle2);

        Motorcycle motorcycle3 = new Motorcycle();
        motorcycle3.setMake("Honda");
        motorcycle3.setModel("CVN");
        motorcycle3.setVin("45678");
        motorcycle3.setYear("2023");
        motorcycle3.setColor("rose gold");
        dao.createMotorcycle(motorcycle3);

        Motorcycle motorcycle4 = new Motorcycle();
        motorcycle4.setMake("Ducati");
        motorcycle4.setModel("Superbike");
        motorcycle4.setVin("48729");
        motorcycle4.setYear("2020");
        motorcycle4.setColor("red");
        dao.createMotorcycle(motorcycle4);

        //act
        List<Motorcycle> motorcycleList = dao.getAllMotorcycles();
        List<Motorcycle> theThingThatIGOt = dao.getAllMotorcycles();
        int theThingIExpect;
        //assert
        assertEquals(4, motorcycleList.size());


    }

    @Test
    public void getMotorcyclesByMake() {

        Motorcycle moto = new Motorcycle();
        moto.setVin("22222");
        moto.setMake("Honda");
        moto.setModel("CB300");
        moto.setYear("2019");
        moto.setColor("red");

        dao.createMotorcycle(moto);

        moto = new Motorcycle();
        moto.setVin("33333");
        moto.setMake("Suzuki");
        moto.setModel("DR650");
        moto.setYear("2012");
        moto.setColor("gray");

        dao.createMotorcycle(moto);

        moto = new Motorcycle();
        moto.setVin("44444");
        moto.setMake("Suzuki");
        moto.setModel("DRZ 400");
        moto.setYear("2016");
        moto.setColor("black");

        dao.createMotorcycle(moto);

        List<Motorcycle> mList = dao.getByMake("Suzuki");
        assertEquals(mList.size(), 2);

        mList = dao.getByMake("Honda");
        assertEquals(mList.size(), 1);

        mList = dao.getByMake("Ducati");
        assertEquals(mList.size(), 0);

    }


    @Test
    public void updateMotorcycleShouldUpdateAMotorcycle(){
        //Arrange
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.setMake("Honda");
        motorcycle.setModel("Tijuana");
        motorcycle.setVin("12345");
        motorcycle.setYear("2020");
        motorcycle.setColor("red");
        motorcycle = dao.createMotorcycle(motorcycle);

        motorcycle.setYear("2019");
        motorcycle.setColor("pink");

        //act
        dao.updateMotorcycle(motorcycle);
        Motorcycle theThingIGot  = dao.getMotorcycle(motorcycle.getId());
        assertEquals(motorcycle,theThingIGot);
    }

    @Test
    public void getMotorcycle() {

    }
}
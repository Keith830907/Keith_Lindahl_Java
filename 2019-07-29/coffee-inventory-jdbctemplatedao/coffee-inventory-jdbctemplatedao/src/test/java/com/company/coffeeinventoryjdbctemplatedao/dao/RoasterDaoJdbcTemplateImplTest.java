package com.company.coffeeinventoryjdbctemplatedao.dao;

import com.company.coffeeinventoryjdbctemplatedao.model.Coffee;
import com.company.coffeeinventoryjdbctemplatedao.model.Roaster;
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
public class RoasterDaoJdbcTemplateImplTest {

    @Autowired
    protected CoffeeDao coffeeDao;
    @Autowired
    protected RoasterDao roasterDao;

    @Before
    public void setUp() throws Exception {
        // clean out the test db
        List<Coffee> cList = coffeeDao.getAllCoffees();

        cList.stream()
                .forEach(coffee -> coffeeDao.deleteCoffee(coffee.getCoffee_id()));

        List<Roaster> rList = roasterDao.getAllRoasters();

        rList.stream()
                .forEach(roaster -> roasterDao.deleteRoaster(roaster.getRoaster_id()));
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addGetDeleteRoaster() {

        Roaster roaster = new Roaster();
        roaster.setName("PERC");
        roaster.setStreet("Broad St");
        roaster.setCity("Savannah");
        roaster.setState("GA");
        roaster.setPostal_code("31401");
        roaster.setPhone("912-555-5555");
        roaster.setEmail("totallyrealemail@perc.com");
        roaster.setNote("Delicious coffee.");

        roaster = roasterDao.addRoaster(roaster);

        Roaster roaster2 = roasterDao.getRoaster(roaster.getRoaster_id());

        assertEquals(roaster, roaster2);

        roasterDao.deleteRoaster(roaster.getRoaster_id());

        roaster2 = roasterDao.getRoaster(roaster.getRoaster_id());

        assertNull(roaster2);
    }

    @Test
    public void getAllRoasters() {

        Roaster roaster = new Roaster();
        roaster.setName("PERC");
        roaster.setStreet("Broad St");
        roaster.setCity("Savannah");
        roaster.setState("GA");
        roaster.setPostal_code("31401");
        roaster.setPhone("912-555-5555");
        roaster.setEmail("totallyrealemail@perc.com");
        roaster.setNote("Delicious coffee.");

        roasterDao.addRoaster(roaster);

        roaster = new Roaster();
        roaster.setName("Savannah Coffee Roasters");
        roaster.setStreet("Liberty St");
        roaster.setCity("Savannah");
        roaster.setState("GA");
        roaster.setPostal_code("31401");
        roaster.setPhone("912-555-0001");
        roaster.setEmail("alsolegitemail@scr.com");
        roaster.setNote("Pretty cool hangout spot. Decent coffee.");

        roasterDao.addRoaster(roaster);

        List<Roaster> roasterList = roasterDao.getAllRoasters();

        assertEquals(roasterList.size(), 2);
    }


    @Test
    public void updateRoaster() {

        Roaster roaster = new Roaster();
        roaster.setName("PERC");
        roaster.setStreet("Broad St");
        roaster.setCity("Savannah");
        roaster.setState("GA");
        roaster.setPostal_code("31401");
        roaster.setPhone("912-555-5555");
        roaster.setEmail("totallyrealemail@perc.com");
        roaster.setNote("Delicious coffee.");

        roaster = roasterDao.addRoaster(roaster);

        roaster.setName("UPDATED");
        roaster.setStreet("NEW STREET");
        roaster.setCity("ST LOUIS");
        roaster.setState("MO");

        roasterDao.updateRoaster(roaster);

        Roaster roaster2 = roasterDao.getRoaster(roaster.getRoaster_id());

        assertEquals(roaster2, roaster);
    }
}


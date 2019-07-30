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
public class CoffeeDaoJdbcTemplateImplTest {

    @Autowired
    protected CoffeeDao CoffeeDao;
    @Autowired
    protected RoasterDao RoasterDao;

    @Before
    public void setUp() throws Exception {
        // clean out the test db
        List<Coffee> cList = CoffeeDao.getAllCoffees();

        cList.stream()
                .forEach(coffee -> CoffeeDao.deleteCoffee(coffee.getCoffee_id()));

        List<Roaster> rList = RoasterDao.getAllRoasters();

        rList.stream()
                .forEach(roaster -> RoasterDao.deleteRoaster(roaster.getRoaster_id()));
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addGetDeleteCoffee() {

        Roaster roaster = new Roaster();
        roaster.setName("PERC");
        roaster.setStreet("Broad St");
        roaster.setCity("Savannah");
        roaster.setState("GA");
        roaster.setPostal_code("31401");
        roaster.setPhone("912-555-5555");
        roaster.setEmail("totallyrealemail@perc.com");
        roaster.setNote("Delicious coffee.");

        roaster = RoasterDao.addRoaster(roaster);

        Coffee coffee = new Coffee();
        coffee.setRoaster_id(roaster.getRoaster_id());
        coffee.setName("Juggernaut");
        coffee.setCount(73);
        coffee.setUnit_price(12.99);
        coffee.setDescription("Bold and full flavored, this coffee will start your day right.");
        coffee.setType("Espresso");

        coffee = CoffeeDao.addCoffee(coffee);

        Coffee coffee2 = CoffeeDao.getCoffee(coffee.getCoffee_id());

        assertEquals(coffee, coffee2);

        CoffeeDao.deleteCoffee(coffee.getCoffee_id());

        coffee2 = CoffeeDao.getCoffee(coffee.getCoffee_id());

        assertNull(coffee2);
    }

    @Test
    public void getAllCoffees() {

        Roaster roaster = new Roaster();
        roaster.setName("PERC");
        roaster.setStreet("Broad St");
        roaster.setCity("Savannah");
        roaster.setState("GA");
        roaster.setPostal_code("31401");
        roaster.setPhone("912-555-5555");
        roaster.setEmail("totallyrealemail@perc.com");
        roaster.setNote("Delicious coffee.");

        RoasterDao.addRoaster(roaster);

        Coffee coffee = new Coffee();
        coffee.setRoaster_id(roaster.getRoaster_id());
        coffee.setName("Juggernaut");
        coffee.setCount(73);
        coffee.setUnit_price(12.99);
        coffee.setDescription("Bold and full flavored, this coffee will start your day right.");
        coffee.setType("Espresso");

        CoffeeDao.addCoffee(coffee);

        coffee = new Coffee();
        coffee.setRoaster_id(roaster.getRoaster_id());
        coffee.setName("PERC UP");
        coffee.setCount(42);
        coffee.setUnit_price(11.49);
        coffee.setDescription("Sweet and Balanced.");
        coffee.setType("Espresso");

        CoffeeDao.addCoffee(coffee);

        List<Coffee> coffeeList = CoffeeDao.getAllCoffees();

        assertEquals(coffeeList.size(), 2);
    }


    @Test
    public void updateCoffee() {

        Roaster roaster = new Roaster();
        roaster.setName("PERC");
        roaster.setStreet("Broad St");
        roaster.setCity("Savannah");
        roaster.setState("GA");
        roaster.setPostal_code("31401");
        roaster.setPhone("912-555-5555");
        roaster.setEmail("totallyrealemail@perc.com");
        roaster.setNote("Delicious coffee.");

        RoasterDao.addRoaster(roaster);

        Coffee coffee = new Coffee();
        coffee.setRoaster_id(roaster.getRoaster_id());
        coffee.setName("Juggernaut");
        coffee.setCount(73);
        coffee.setUnit_price(12.99);
        coffee.setDescription("Bold and full flavored, this coffee will start your day right.");
        coffee.setType("Espresso");

        coffee = CoffeeDao.addCoffee(coffee);

        coffee.setName("UPDATED");
        coffee.setCount(65);
        coffee.setUnit_price(13.29);

        CoffeeDao.updateCoffee(coffee);

        Coffee coffee2 = CoffeeDao.getCoffee(coffee.getCoffee_id());

        assertEquals(coffee2, coffee);
    }

    @Test
    public void getCoffeeByRoaster() {

        Roaster roaster = new Roaster();
        roaster.setName("PERC");
        roaster.setStreet("Broad St");
        roaster.setCity("Savannah");
        roaster.setState("GA");
        roaster.setPostal_code("31401");
        roaster.setPhone("912-555-5555");
        roaster.setEmail("totallyrealemail@perc.com");
        roaster.setNote("Delicious coffee.");

        roaster = RoasterDao.addRoaster(roaster);

        Roaster roaster2 = new Roaster();
        roaster2.setName("Savannah Coffee Roasters");
        roaster2.setStreet("Liberty St");
        roaster2.setCity("Savannah");
        roaster2.setState("GA");
        roaster2.setPostal_code("31401");
        roaster2.setPhone("912-555-0001");
        roaster2.setEmail("alsolegitemail@scr.com");
        roaster2.setNote("Pretty cool hangout spot. Decent coffee.");

        roaster2 = RoasterDao.addRoaster(roaster2);

        Roaster roaster3 = new Roaster();
        roaster3.setName("New Kid on the Block");
        roaster3.setStreet("Broughton St");
        roaster3.setCity("Savannah");
        roaster3.setState("GA");
        roaster3.setPostal_code("31401");
        roaster3.setPhone("912-555-1122");
        roaster3.setEmail("abunchofhits@nkotb.com");
        roaster3.setNote("Hangin' Tough.");

        roaster3 = RoasterDao.addRoaster(roaster3);

        Coffee coffee = new Coffee();
        coffee.setRoaster_id(roaster.getRoaster_id());
        coffee.setName("Juggernaut");
        coffee.setCount(73);
        coffee.setUnit_price(12.99);
        coffee.setDescription("Bold and full flavored, this coffee will start your day right.");
        coffee.setType("Espresso");

        CoffeeDao.addCoffee(coffee);

        coffee = new Coffee();
        coffee.setRoaster_id(roaster.getRoaster_id());
        coffee.setName("PERC UP");
        coffee.setCount(42);
        coffee.setUnit_price(11.49);
        coffee.setDescription("Sweet and Balanced.");
        coffee.setType("Espresso");

        CoffeeDao.addCoffee(coffee);

        coffee = new Coffee();
        coffee.setRoaster_id(roaster2.getRoaster_id());
        coffee.setName("Captain Foggy");
        coffee.setCount(33);
        coffee.setUnit_price(12.49);
        coffee.setDescription("Light and crisp.");
        coffee.setType("Sumatra");

        CoffeeDao.addCoffee(coffee);

        List<Coffee> cList = CoffeeDao.getCoffeesByRoaster(roaster.getRoaster_id());
        assertEquals(2, cList.size());

        List<Coffee> cList2 = CoffeeDao.getCoffeesByRoaster(roaster2.getRoaster_id());
        assertEquals(1, cList2.size());

        List<Coffee> cList3 = CoffeeDao.getCoffeesByRoaster(roaster3.getRoaster_id());
        assertEquals(0, cList3.size());

    }

    @Test
    public void getCoffeeByType() {

        Roaster roaster = new Roaster();
        roaster.setName("PERC");
        roaster.setStreet("Broad St");
        roaster.setCity("Savannah");
        roaster.setState("GA");
        roaster.setPostal_code("31401");
        roaster.setPhone("912-555-5555");
        roaster.setEmail("totallyrealemail@perc.com");
        roaster.setNote("Delicious coffee.");

        roaster = RoasterDao.addRoaster(roaster);

        Coffee coffee = new Coffee();
        coffee.setRoaster_id(roaster.getRoaster_id());
        coffee.setName("Juggernaut");
        coffee.setCount(73);
        coffee.setUnit_price(12.99);
        coffee.setDescription("Bold and full flavored, this coffee will start your day right.");
        coffee.setType("Espresso");

        CoffeeDao.addCoffee(coffee);

        coffee = new Coffee();
        coffee.setRoaster_id(roaster.getRoaster_id());
        coffee.setName("PERC UP");
        coffee.setCount(42);
        coffee.setUnit_price(11.49);
        coffee.setDescription("Sweet and Balanced.");
        coffee.setType("Espresso");

        CoffeeDao.addCoffee(coffee);

        coffee = new Coffee();
        coffee.setRoaster_id(roaster.getRoaster_id());
        coffee.setName("Captain Foggy");
        coffee.setCount(33);
        coffee.setUnit_price(12.49);
        coffee.setDescription("Light and crisp.");
        coffee.setType("Sumatra");

        CoffeeDao.addCoffee(coffee);

        List<Coffee> cList = CoffeeDao.getCoffeesByType("Espresso");
        assertEquals(2, cList.size());

        List<Coffee> cList2 = CoffeeDao.getCoffeesByType("Sumatra");
        assertEquals(1, cList2.size());

        List<Coffee> cList3 = CoffeeDao.getCoffeesByType("Kona");
        assertEquals(0, cList3.size());

    }
}


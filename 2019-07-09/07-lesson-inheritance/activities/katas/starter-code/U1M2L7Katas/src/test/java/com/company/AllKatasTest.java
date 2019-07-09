package com.company;

//import com.company.interfaces.Vehicle;
import org.junit.Test;

import static org.junit.Assert.*;

public class AllKatasTest {

      private Accord accord = new Accord();


      @Test
      public void testInheritance() {

          String failMessage = "Expected com.company.Accord to inherit from com.company.Car and com.company.Sedan";
          assertTrue(failMessage, accord instanceof Vehicle);
          assertTrue(failMessage, accord instanceof Car);
          assertTrue(failMessage, accord instanceof Sedan);
          assertTrue(failMessage, accord instanceof Accord);
      }

      @Test
      public void testComposition() throws Exception {

          accord.setEngine(new Engine());
          accord.setTransmission(new Transmission());

          String failMessage = "Expected getEngine to return an com.company.Engine class";
          assertTrue(failMessage, accord.getEngine() instanceof Engine);

          failMessage = "Expected getTransmission to return an com.company.Engine class";
          assertTrue(failMessage, accord.getTransmission() instanceof Transmission);
      }

      @Test
      public void testMethods() throws Exception {

          Class acc = Accord.class;
          String failMessage = "Expected com.company.Accord to have drive method which takes an integer parameter";
          assertNotNull(failMessage, acc.getMethod("drive", int.class));
          failMessage = "Expected com.company.Accord to have displayMilesTraveled method";
          assertNotNull(failMessage, acc.getMethod("displayMilesTraveled"));

      }
}

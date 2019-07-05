package com.company;
import com.company.interfaces.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class AllKatasTest {

     private Shape square = new Square();
     private Shape circle = new Circle();
     private Shape triangle = new Triangle();
     private Clock analogClock = new AnalogClock();
     private Alarm buzzer = new Buzzer();
     private DigitalClock digitalClock = new DigitalClock();

     @Test
     public void testShapes() {

         String failMessage = "Expected to implement the Shape interface";
         assertTrue(failMessage, circle instanceof Shape);
         assertTrue(failMessage, square instanceof Shape);
         assertTrue(failMessage, triangle instanceof Shape);
     }

     @Test
     public void testAnalogClock() throws Exception {

         String failMessage = "Expected AnalogClock to implement the Clock interface";
         assertTrue(failMessage, analogClock instanceof Clock);

         Class analogClock = AnalogClock.class;
         failMessage = "Expected AnalogClock to have diplayTime method";
         assertNotNull(failMessage, analogClock.getMethod("displayTime"));
         failMessage = "Expected AnalogClock to have timer method with two integer parameters";
         assertNotNull(failMessage, analogClock.getMethod("timer", new Class[] {int.class, int.class}));
     }

     @Test
     public void testBuzzer() throws Exception {

         String failMessage = "Expected Buzzer to implement the Alarm interface";
         assertTrue(failMessage, buzzer instanceof Alarm);

         Class buzzer = Buzzer.class;
         failMessage = "Expected Buzzer to implement the Alarm interface";
         assertNotNull(failMessage, buzzer.getMethod("sound"));
     }

     @Test
     public void testDigitalClock() throws Exception {

         String failMessage = "Expected AnalogClock to implement the Clock interface";
         assertTrue(failMessage, digitalClock instanceof Clock);
         failMessage = "Expected Buzzer to implement the Alarm interface";
         assertTrue(failMessage, digitalClock instanceof Alarm);

         Class digitalClock = DigitalClock.class;
         failMessage = "Expected AnalogClock to have diplayTime method";
         assertNotNull(failMessage, digitalClock.getMethod("displayTime"));
         failMessage = "Expected AnalogClock to have timer method with two integer parameters";
         assertNotNull(failMessage, digitalClock.getMethod("timer", new Class[] {int.class, int.class}));
         failMessage = "Expected DigitalClock to implement the Alarm interface";
         assertNotNull(failMessage, digitalClock.getMethod("sound"));
     }
}

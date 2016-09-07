package edu.gatech.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MyCustomStringTest {

    private MyCustomStringInterface mycustomstring;

    @Before
    public void setUp() {
        mycustomstring = new MyCustomString();
    }

    @After
    public void tearDown() {
        mycustomstring = null;
    }

    @Test
    public void testCountNumbers1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals(7, mycustomstring.countNumbers());
    }

    @Test
    public void testCountNumbers2() {
        fail("Not yet implemented");
    }

    @Test
    public void testCountNumbers3() {
        fail("Not yet implemented");
    }

    @Test
    public void testCountNumbers4() {
        fail("Not yet implemented");
    }

    @Test
    public void testCountNumbers5() {
        fail("Not yet implemented");
    }

    @Test
    public void testCountNumbers6() {
        fail("Not yet implemented");
    }



}

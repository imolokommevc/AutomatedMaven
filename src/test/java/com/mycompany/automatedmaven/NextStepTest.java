package com.mycompany.automatedmaven;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author imolokomme
 */
public class NextStepTest {
    
    NextStep obj = new NextStep();
    
    @Test
    public void testTestPassed() {
        assertEquals("Test passed", obj.testPassed());
    }

    @Test
    public void testIsOdd() {
        assertTrue(obj.isOdd(5));
    }

    @Test
    public void testProd2nums() {
        assertEquals(16, obj.prod2nums(4, 4));
    }
    
}

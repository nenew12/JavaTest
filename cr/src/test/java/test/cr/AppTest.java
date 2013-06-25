package test.cr;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{

    @Test    
    public void testAddOneAndTwo() {
    	
    	int firstInt = 1;
    	int sendInt = 2;
    	
    	int expected = 3;
    	
    	int actual = new App().cal(firstInt, sendInt);
    	
    	Assert.assertEquals(expected, actual);
    	
    }
    
    @Test    
    public void testAddOneAndThree() {
    	
    	int firstInt = 1;
    	int sendInt = 3;
    	
    	int expected = 4;
    	
    	int actual = new App().cal(firstInt, sendInt);
    	
    	Assert.assertEquals(expected, actual);
    	
    }    
}

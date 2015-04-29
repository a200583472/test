package shiyan2;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CalcTest {
	 private static Calc calc=new Calc();

	    
	    @Before
	    public void setUp() throws Exception {
	        calc.clear();
	    }

	    @After
	    public void tearDown() throws Exception {
	    }

	    @Test(timeout=1000)
	    public void testAdd() {
	        calc.add(2);
	        calc.add(3);
	        assertEquals(5, calc.getResult());
	    }

	    @Test
	    public void testSubstract() {
	        calc.add(10);
	        calc.substract(2);
	        assertEquals(8,calc.getResult());
	    }

	    @Ignore("Multiply() Not yet implemented")  
	    @Test
	    public void testMultiply() {
	        
	    }

	    @Test(expected =ArithmeticException.class)
	    public void testDivide() {
	        calc.add(8);
	        calc.divide(0);
	        assertEquals(4,calc.getResult());
	    }
	}
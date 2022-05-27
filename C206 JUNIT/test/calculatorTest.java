import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: MIRZA
 * Student ID: {type your id here}
 * Class: {type your class here}
 * Date/Time created: Friday 27-05-2022 11:32
 */

/**
 * @author MIRZA
 *
 */
public class calculatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	
	
	
	
	
	

	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testSubtract() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual2 = cal.subtract(a, b); 
			 
		int expected2 = 3087;
		assertEquals (expected2, actual2);

	}
	
	@Test
	public void testMultiply() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual3 = cal.multiply(a, b); 
			 
		int expected3 = 5332114;
		assertEquals (expected3, actual3);

	}

	@Test
	public void testDivide() {
		int a = 10;
		int b = 2;
			
		Calculator cal = new Calculator();
		int actual4 = cal.divide(a, b); 
			 
		int expected4 = 5;
		assertEquals (expected4, actual4);

	}
}

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class LargestDigitTest {


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void positiveTestCase() {
		LargestDigit objTest=new LargestDigit();
		assertEquals("",2,objTest.largestdigit(2));
		//fail("Not yet implemented");
	}
	
	@Test
	public void testCaseForZero() {
		LargestDigit objTest=new LargestDigit();
		assertEquals("", 0, objTest.largestdigit(000000));
		//fail("Not yet implemented");
	}
	
	@Test
	public void NegativeNumberTestCase() {
		LargestDigit objTest=new LargestDigit();
		assertEquals("", 8, objTest.largestdigit(-5787464));
		//fail("Not yet implemented");
	}

}

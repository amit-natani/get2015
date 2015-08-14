import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RemainderRecursionTest {

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
	public void positiveTestCase() 
	{
		RemainderClass remainderTestObject = new RemainderClass();
		assertEquals("", 1, remainderTestObject.rem(100, 3));
		//fail("Not yet implemented");
		
	}
	
	@Test
	public void negativeTestCase() 
	{
		RemainderClass remainderTestObject = new RemainderClass();
		assertEquals("", -1, remainderTestObject.rem(2, 0));
		//fail("Not yet implemented");
		
	}
}

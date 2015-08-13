import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class LinearSearchTest {

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
	public void negativeTestCase() {
		LinearSearch objTest=new LinearSearch();
		assertEquals("", -1, objTest.linearSearch(new int[]{2,5,8,9,10,77,55}, 88));
		//fail("Not yet implemented");
	}
	
	@Test
	public void tpositiveTestCase() {
		LinearSearch objTest=new LinearSearch();
		assertEquals("", 5, objTest.linearSearch(new int[]{2,5,8,9,10,77,55,11}, 77));
		//fail("Not yet implemented");
	}
	
	@Test
	public void nullArraytestCase() {
		
		LinearSearch objTest=new LinearSearch();
		assertEquals("",-1, objTest.linearSearch(new int[]{}, 77));
		//fail("Not yet implemented");
	}
	

}

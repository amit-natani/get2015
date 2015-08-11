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
	public void test1() {
		LinearSearch objTest=new LinearSearch();
		assertEquals("", -1, objTest.linearSearch(new int[]{2,5,8,9,10,77,55}, 88));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test2() {
		LinearSearch objTest=new LinearSearch();
		assertEquals("", 5, objTest.linearSearch(new int[]{2,5,8,9,10,77,55,11}, 77));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test3() {
		
		LinearSearch objTest=new LinearSearch();
		assertEquals("",-2, objTest.linearSearch(new int[]{}, 77));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test4() {
		LinearSearch objTest=new LinearSearch();
		assertEquals("", -1, objTest.linearSearch(new int[]{4,7,9,45,67,78,89}, 56));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test5() {
		LinearSearch objTest=new LinearSearch();
		assertEquals("", 2, objTest.linearSearch(new int[]{12,34,56,64,73,87,91}, 56));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test6() {
		
		LinearSearch objTest=new LinearSearch();
		assertEquals("",3, objTest.linearSearch(new int[]{4,5,6,7,8}, 7));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test7() {
		LinearSearch objTest=new LinearSearch();
		assertEquals("", 0, objTest.linearSearch(new int[]{-34,-52,-54,-72,-83}, -34));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test8() {
		LinearSearch objTest=new LinearSearch();
		assertEquals("", -1, objTest.linearSearch(new int[]{-34,-52,-54,-72,-83}, 34));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test9() {
		
		LinearSearch objTest=new LinearSearch();
		assertEquals("",-1, objTest.linearSearch(new int[]{2,8,9,45,62,78}, 77));
		//fail("Not yet implemented");
	}
	

}

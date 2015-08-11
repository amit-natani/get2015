import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class BinarySearchTest {

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
		
		BinarySearch objTest=new BinarySearch();
		assertEquals("",-1, objTest.binarySearch(new int[]{2,5,8,9,10,55,77}, 88, 0, 6));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test2() {
		
		BinarySearch objTest=new BinarySearch();
		assertEquals("",6, objTest.binarySearch(new int[]{2,5,8,9,10,55,77}, 77, 0, 6));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test3() {
		
		BinarySearch objTest=new BinarySearch();
		assertEquals("",-2, objTest.binarySearch(new int[]{}, 77, 0, 0));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test4() {
		BinarySearch objTest=new BinarySearch();
		assertEquals("", -1, objTest.binarySearch(new int[]{4,7,9,45,67,78,89}, 56, 0, 6));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test5() {
		BinarySearch objTest=new BinarySearch();
		assertEquals("", 2, objTest.binarySearch(new int[]{12,34,56,64,73,87,91}, 56, 0, 6));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test6() {
		
		BinarySearch objTest=new BinarySearch();
		assertEquals("",3, objTest.binarySearch(new int[]{4,5,6,7,8}, 7, 0, 4));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test7() {
		BinarySearch objTest=new BinarySearch();
		assertEquals("", 4, objTest.binarySearch(new int[]{-83,-72,-54,-52,-34}, -34, 0, 4));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test8() {
		BinarySearch objTest=new BinarySearch();
		assertEquals("", -1, objTest.binarySearch(new int[]{-83,-72,-54,-52,-34}, 34, 0, 4));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test9() {
		
		BinarySearch objTest=new BinarySearch();
		assertEquals("",-1, objTest.binarySearch(new int[]{2,8,9,45,62,78}, 77, 0, 5));
		//fail("Not yet implemented");
	}
}

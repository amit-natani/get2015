import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class GCDRecursionTest {

	
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
		GCDRecursion objTest=new GCDRecursion();
		assertEquals("", 2, objTest.gcd(2, 2));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test2() {
		GCDRecursion objTest=new GCDRecursion();
		assertEquals("", 6, objTest.gcd(12, 18));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test3() {
		GCDRecursion objTest=new GCDRecursion();
		assertEquals("", 1, objTest.gcd(100, 3));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test4() {
		GCDRecursion objTest=new GCDRecursion();
		assertEquals("", 1, objTest.gcd(7, 5));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test5() {
		GCDRecursion objTest=new GCDRecursion();
		assertEquals("", 2, objTest.gcd(12, 14));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test6() {
		GCDRecursion objTest=new GCDRecursion();
		assertEquals("", 1, objTest.gcd(45, 56));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test7() {
		GCDRecursion objTest=new GCDRecursion();
		assertEquals("", 1, objTest.gcd(43, 23));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test8() {
		GCDRecursion objTest=new GCDRecursion();
		assertEquals("", 6, objTest.gcd(78, 24));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test9() {
		GCDRecursion objTest=new GCDRecursion();
		assertEquals("", 14, objTest.gcd(56, 42));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test10() {
		GCDRecursion objTest=new GCDRecursion();
		assertEquals("", 1, objTest.gcd(98, 3));
		//fail("Not yet implemented");
	}
}

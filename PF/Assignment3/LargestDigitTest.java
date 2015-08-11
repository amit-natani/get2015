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
	public void test1() {
		LargestDigit objTest=new LargestDigit();
		assertEquals("",2,objTest.largestdigit(2));
		//fail("Not yet implemented");
	}
	

	@Test
	public void test2() {
		LargestDigit objTest=new LargestDigit();
		assertEquals("",9,objTest.largestdigit(1257369));
		//fail("Not yet implemented");
	}
	

	@Test
	public void test3() {
		LargestDigit objTest=new LargestDigit();
		assertEquals("", 4, objTest.largestdigit(444));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test4() {
		LargestDigit objTest=new LargestDigit();
		assertEquals("", 0, objTest.largestdigit(000000));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test5() {
		LargestDigit objTest=new LargestDigit();
		assertEquals("", 5, objTest.largestdigit(2450014));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test6() {
		LargestDigit objTest=new LargestDigit();
		assertEquals("", 1, objTest.largestdigit(1000));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test7() {
		LargestDigit objTest=new LargestDigit();
		assertEquals("", 6, objTest.largestdigit(-5604554));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test8() {
		LargestDigit objTest=new LargestDigit();
		assertEquals("", 7, objTest.largestdigit(-74526));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test9() {
		LargestDigit objTest=new LargestDigit();
		assertEquals("", 9, objTest.largestdigit(8976545));
		//fail("Not yet implemented");
	}
	
	@Test
	public void test10() {
		LargestDigit objTest=new LargestDigit();
		assertEquals("", 8, objTest.largestdigit(-5787464));
		//fail("Not yet implemented");
	}

}

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
	public void test1() // first test case
	{
		RemainderRecursion objTest = new RemainderRecursion();
		assertEquals("", 1, objTest.rem(100, 3));
		//fail("Not yet implemented");
		
	}
	
	@Test
	public void test2() // second test case
	{
		RemainderRecursion objTest = new RemainderRecursion();
		assertEquals("", 0, objTest.rem(2, 1));
		//fail("Not yet implemented");
		
	}
	
	@Test
	public void test3() // third test case
	{
		RemainderRecursion objTest = new RemainderRecursion();
		assertEquals("", -1, objTest.rem(2, 0));
		//fail("Not yet implemented");
		
	}
	
	@Test
	public void test4() // fourth test case
	{
		RemainderRecursion objTest = new RemainderRecursion();
		assertEquals("", 0, objTest.rem(0, 5));
		//fail("Not yet implemented");
		
	}

	@Test
	public void test5() // fifth test case
	{
		RemainderRecursion objTest = new RemainderRecursion();
		assertEquals("", 1, objTest.rem(45, 4));
		//fail("Not yet implemented");
		
	}

	@Test
	public void test6() // sixth test case
	{
		RemainderRecursion objTest = new RemainderRecursion();
		assertEquals("", 4, objTest.rem(67, 9));
		//fail("Not yet implemented");
		
	}

	@Test
	public void test7() // seventh test case
	{
		RemainderRecursion objTest = new RemainderRecursion();
		assertEquals("", -1, objTest.rem(0, 0));
		//fail("Not yet implemented");
		
	}

	@Test
	public void test8() // eighth test case
	{
		RemainderRecursion objTest = new RemainderRecursion();
		assertEquals("", 5, objTest.rem(89, 7));
		//fail("Not yet implemented");
		
	}

	@Test
	public void test9() // ninth test case
	{
		RemainderRecursion objTest = new RemainderRecursion();
		assertEquals("", 0, objTest.rem(34, 2));
		//fail("Not yet implemented");
		
	}

	@Test
	public void test10() // tenth test case
	{
		RemainderRecursion objTest = new RemainderRecursion();
		assertEquals("", 1, objTest.rem(1, 2));
		//fail("Not yet implemented");
		
	}


}

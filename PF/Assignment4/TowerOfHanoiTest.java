import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.*;

/**
 * 
 */

/**
 * @author Amit
 *
 */
public class TowerOfHanoiTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

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

	
	/* test for 3 disks */
	@Test
	public void test() {	
		TowerOfHanoi testObject1 = new TowerOfHanoi();
		List<String> actual = new ArrayList<String>();
		String expected[]={"Move Disk   1   A->B", "Move Disk   2   A->C", "Move Disk   1   B->C", "Move Disk   3   A->B", "Move Disk   1   C->A", "Move Disk   2   C->B", "Move Disk   1   A->B"};
		testObject1.towerOfHanoi("A", "B", "C", 3, actual);
		int i=0;
		for(String resultString : actual)
		{
			assertEquals("", expected[i], resultString);
			i++;
		}
		//fail("Not yet implemented");
	}
	
	
	/* test for 1 disk */
	@Test
	public void test2() {
		
		TowerOfHanoi testObject2 = new TowerOfHanoi();
		List<String> actual = new ArrayList<String>();
		String expected[]={"Move Disk   1   A->B"};
		testObject2.towerOfHanoi("A", "B", "C", 1, actual);
		int i=0;
		for(String resultString:actual)
		{
			assertEquals("", expected[i], resultString);
			i++;
		}
		//fail("Not yet implemented");
	}
	
	
	/* test for 2 disk */
	@Test
	public void test3() {
		
		TowerOfHanoi testObject3 = new TowerOfHanoi();
		List<String> actual = new ArrayList<String>();
		String expected[]={"Move Disk   1   A->C", "Move Disk   2   A->B", "Move Disk   1   C->B"};
		testObject3.towerOfHanoi("A", "B", "C", 2, actual);
		int i=0;
		for(String resultString : actual)
		{
			assertEquals("", expected[i], resultString);
			i++;
		}
		//fail("Not yet implemented");
	}

}

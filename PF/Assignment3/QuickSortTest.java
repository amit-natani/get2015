import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 */
	
/**
 * @author Amit
 *
 */
public class QuickSortTest {

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

	@Test
	public void testWorstCase() {
		
		QuickSort quickSortTest=new QuickSort();
		assertArrayEquals(new int[]{1,2,3,4,5,6,7,8}, quickSortTest.recQuickSort(new int[]{8,7,6,5,4,3,2,1}, 0, 7));
		//fail("Not yet implemented");
	}
	
	@Test
	public void testBestCase() {
		
		QuickSort quickSortTest=new QuickSort();
		assertArrayEquals(new int[]{1,2,3,4,5,6,7,8}, quickSortTest.recQuickSort(new int[]{1,2,3,4,5,6,7,8}, 0, 7));

	}
	
	@Test
	public void testAverageCase() {
		
		QuickSort quickSortTest=new QuickSort();
		assertArrayEquals(new int[]{1,2,3,4,5,6,7,8}, quickSortTest.recQuickSort(new int[]{5,4,3,2,6,7,8,1}, 0, 7));
;
	}
	
	@Test
	public void testForEmptyArray() {
		
		QuickSort quickSortTest=new QuickSort();
		assertArrayEquals(new int[]{}, quickSortTest.recQuickSort(new int[]{}, -1, -1));

	}
	
	@Test
	public void testWithNegativeNumbers() {
		
		QuickSort quickSortTest=new QuickSort();
		assertArrayEquals(new int[]{-8,-5,-5,1,7}, quickSortTest.recQuickSort(new int[]{-5,-5,1,-8,7}, 0, 4));

	}

}

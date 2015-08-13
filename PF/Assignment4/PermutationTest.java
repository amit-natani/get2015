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
public class PermutationTest {

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
	
	
	
	/* test case with 3 character String as input */
	@Test
	public void testWithThreeCharacterString() {
		
		Permutation permutationTestObj = new Permutation();
		String expectedPermutations[] = {"abc","acb","bac","bca","cab","cba"};
		List<String> PermutationList;
		PermutationList=permutationTestObj.permute("abc");
		int i=0;
		for(String stringPermutation : PermutationList)
		{
			assertEquals("", expectedPermutations[i], stringPermutation);
			i++;
		}
	}
	
	
	/* test case with 2 character String as input */
	@Test
	public void testWithTwoCharacterString() {
		
		Permutation permutationTestObj = new Permutation();
		String expectedPermutations[] = {"ab","ba"};
		List<String> PermutationList;
		PermutationList=permutationTestObj.permute("ab");
		int i=0;
		for(String stringPermutation: PermutationList)
		{
			assertEquals("", expectedPermutations[i], stringPermutation);
			i++;
		}

	}
	
	
	/* test case of String with repeated characters as input */
	@Test
	public void testWithRepeatedCharacterString() {
		
		Permutation testObject3 = new Permutation();
		String expectedPermutations[] = {"abb","bab","bba"};
		List<String> PermutationList;
		PermutationList=testObject3.permute("abb");
		int i=0;
		for(String stringPermutation : PermutationList)
		{
			assertEquals("", expectedPermutations[i], stringPermutation);
			i++;
		}

	}

}

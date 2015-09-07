
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Amit
 *
 */
public class Concordance {
	
	/** characterSet is set of characters of given string */
	private Set<Character> characterSet = new HashSet<Character>();
	
	/** concordanceMap is a hashmap which maps the character with 
	 * the string representation of its indices in the string */
	static public Map<Character, String> concordanceMap = new HashMap<Character, String>();
	
	
	/** Method to read the characters one by one from the string
	 * and then stores them in a set and in hashmap 
	 * @param string : input string
	 */
	private void readCharacters(String string) {
		
		/* input string is converted into a character array */
		char[] charArray = string.toCharArray();
		
		/* character array is traversed using for each loop
		 * and charaters are added to characterSet (Repeated characters
		 * will not be stored)
		 */
		for(char c : charArray)
			characterSet.add(c);
		
		/* setIterator will be used to iterate throught the set characterSet */
		Iterator<Character> setIterator = characterSet.iterator();
		while(setIterator.hasNext()) {
			concordanceMap.put((char)setIterator.next(), "");
		}
	}
	
	
	/** Method to find concordance of characters in a string
	 * 
	 * @param string : input String
	 */
	public void findConcordance(String string) {
		
		/* Internally calling readCharacters() */
		readCharacters(string);
		Iterator<Character> setIterator = characterSet.iterator();
		
		/* One by one each element of set is iterated
		 * and its occurence in string is found and stored in the map 
		 * according to the key that is theat character */
		while(setIterator.hasNext()) {
			
			int count = 0;
			
			/* temp will hold current character from set */
			char temp = (char)setIterator.next();
			
			/* index is the index of the character */
			int index = string.indexOf(temp);
			concordanceMap.put(temp, "[");
			while(index >= 0) {
				if(count > 0)
					concordanceMap.put(temp, concordanceMap.get(temp)+",");
				concordanceMap.put(temp, ""+concordanceMap.get(temp)+index);
				index = string.indexOf(temp, index+1);
				count++;
			}
			concordanceMap.put(temp, concordanceMap.get(temp)+"]");
		}
	}
}

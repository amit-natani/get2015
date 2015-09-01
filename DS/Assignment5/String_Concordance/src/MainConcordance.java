
import java.util.Map;

/**
 * @author Amit
 *
 */
public class MainConcordance {

	public static void main(String args[]) {
		try
		{
			/* Initialization */
			String inputString = "";
			Concordance concordanceObj = new Concordance();
			
			/* Iterating args[] of string */
			for(String s : args) {
				inputString += s;
			}
			
			concordanceObj.findConcordance(inputString);
			
			/* Iterating Map using Map.Entry */
			for(Map.Entry<Character, String> entry : Concordance.concordanceMap.entrySet()) {
				System.out.println(entry.getKey()+": "+entry.getValue());
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
	
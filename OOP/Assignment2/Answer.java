
/**
 * @author Amit
 *
 */
public class Answer 
{
	int single[]=new int[10];
	int multiple[][] = new int[10][];
	String feedback[]= new String[10];
	 
	/* this method stores answer of single choice questions */
	void singleAnsSet(int number,int participantNoCount)
	{
		single[participantNoCount]=number;
	}
	
	/* this method stores answer of multiple select questions */
	void multipleAnsSet(int[] improvements, int participantNoCount, int countInput)
	{
		multiple[participantNoCount] = new int[countInput];
		for(int i = 0; i < countInput; i++)
		{
			multiple[participantNoCount][i] = improvements[i];
		}
	}
	
	/* this method stores feedback question */
	void feedbackSet(String answer,int participantNoCount)
	{
		feedback[participantNoCount]=answer;
	}
	
	/* this method returns answer option no of single choice questions */
	int singleAnsGet(int participantNoCount)
	{
		return single[participantNoCount];
	}
	
	/* this method returns answer of multiple select questions */
	String multipleAnsGet(int participantNoCount)
	{
		String improvementString = "";
		for(int i = 0; i < multiple[participantNoCount].length; i++)
		{
			if(multiple[participantNoCount][i] == 1)
				improvementString = improvementString + "Service Quality\n";
			else if(multiple[participantNoCount][i] == 2)
				improvementString = improvementString + "Communication\n";
			else if(multiple[participantNoCount][i] == 3)
				improvementString = improvementString + "Delivery Process\n";
		}
		return improvementString;
	}
	
	/* this method returns answer of feedback question */
	String feedbackGet(int participantNoCount)
	{
		return feedback[participantNoCount];
	}
}

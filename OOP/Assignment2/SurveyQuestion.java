
/**
 * @author Amit
 *
 */
public class SurveyQuestion implements Question {
	 /* method to return single select question */
	public String singleSelect(boolean flag)
	{
		if(flag == false)
			return "Overall rating of student:(Only single selection is allowed)\n 1. Excellent\n 2. Good \n 3. Fair \n 4. Dull\n";
		else
			return "Overall rating of student: ";
	}
	
	 /* method to return multiple select question */
	public String multipleSelect(boolean flag)
	{
		if(flag == false)
			return "Area of improvement: (You can select multiple)\n 1. Service quality\n 2. Communication\n 3. Delivery Process\n(Press 0 if completed)\n";
		else
			return "Area of improvement:";
	}
	
	 /* method to return feedback question */
	public String feedback(boolean flag)
	{
		if(flag == false)
			return "Submit Feedback\n";
		else
			return "Feedback:";
	}
}

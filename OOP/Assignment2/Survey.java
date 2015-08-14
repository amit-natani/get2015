
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * 
 */

/**
 * @author Amit
 *
 */
public class Survey {

	static int AreaOfImprovements = 3;
	public static void main(String args[])
	{	
		/* initialization */
		Scanner scan = null;
		BufferedReader bufferedReaderObj = null;
		try
		{
			/* Initialization */
			scan=new Scanner(System.in);
			bufferedReaderObj = new BufferedReader(new InputStreamReader(System.in));
			SurveyQuestion surveyQuestionObj= new SurveyQuestion();
			Answer AnswerObj= new Answer();
			int ch=1,count=0,i,result;
			double totalA=0.0,totalB=0.0,totalC=0.0,totalD=0.0;
			char choice;
			String answer="";
			int[] improvements = new int[AreaOfImprovements];
			int countInput = 0;
			do
			{
				countInput = 0;
				
				/* choice menu will be printed */ 
				
				System.out.println("Menu");
				System.out.println("1.Take survey");
				System.out.println("2.View Statistics");
				System.out.println("3.View people and answers");
				System.out.println("Enter your choice");
				ch=scan.nextInt();						// choice of user is taken as input
				 /* switch case to perform action according to choice */
				switch(ch)
				{
					/* if choice is 1 */
					case 1:
						count=count+1;
						System.out.println(surveyQuestionObj.singleSelect(false));	// retrieving first question
						result=scan.nextInt();									
						if(result!=1 && result!=2 && result!=3 && result!=4)
						{
							System.out.println("Please enter from available options");
							result=scan.nextInt();
						}
						AnswerObj.singleAnsSet(result,count); 		// storing answer of first question
						System.out.println(surveyQuestionObj.multipleSelect(false));	// retrieving second question
						int counter = 0;
						int improvementArea = scan.nextInt();
						while(improvementArea != 0)
						{
							improvements[counter] = improvementArea;
							countInput++;
							if(countInput == 3)
								break;
							counter++;
							improvementArea = scan.nextInt();
						}
						
						AnswerObj.multipleAnsSet(improvements, count, countInput); 	// storing answer of second question
						System.out.println(surveyQuestionObj.feedback(false));		// retrieving third question
						answer= bufferedReaderObj.readLine();;						
						AnswerObj.feedbackSet(answer,count);						// storing answer of third question
						break;
					
						/* if choice is 2 */
					case 2:
						for(i=1;i<=count;i++)
						{
							result=AnswerObj.singleAnsGet(i);	// retrieving answer of first question
							if(result==1)
								totalA+=1.0;
							
							if(result==2)
								totalB+=1.0;
							
							if(result==3)
								totalC+=1.0;
							
							if(result==4)
								totalD+=1.0;
						}
						/* total percentage of answers */
						System.out.println("Total percentage of 1: "+ totalA/count*100);
						System.out.println("Total percentage of 2: "+ totalB/count*100);
						System.out.println("Total percentage of 3: "+ totalC/count*100);
						System.out.println("Total percentage of 4: "+ totalD/count*100);
						break;
						
						/* if choice is 3 */
					case 3:
						
						for(i=1;i<=count;i++)
						{
							System.out.println("\nParticipant " +i+"\n");
							System.out.print(surveyQuestionObj.singleSelect(true));
							result=AnswerObj.singleAnsGet(i);	// retrieving answer of first question
							System.out.println(result+"\n");
							System.out.println(surveyQuestionObj.multipleSelect(true));
							answer=AnswerObj.multipleAnsGet(i);	// retrieving answer of second question
							System.out.println(answer);
							System.out.println(surveyQuestionObj.feedback(true));
							answer=AnswerObj.feedbackGet(i);	// retrieving answer of third question
							System.out.println(answer);
						}
						break;
					default:
						System.out.println("Enter number in tha range 1 to 3\n");
				}
				System.out.println("\nDo you want to continue(y/n)");
				choice=scan.next().charAt(0);
				
			}while(choice=='y');
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			scan.close();
			return;
		}
		finally
		{
			try
			{
				scan.close();
				bufferedReaderObj.close();
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
	}

}

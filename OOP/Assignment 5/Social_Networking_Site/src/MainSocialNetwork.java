import java.util.Scanner;


public class MainSocialNetwork {
		public static void main(String args[])
		{
			Scanner scan = null;
			try
			{
				scan = new Scanner(System.in);
				int result, input; 
				SocialNetwork socialNetworkObj = new SocialNetwork();
				socialNetworkObj.readPersonInfo();
				socialNetworkObj.readOrganisationInfo();
				for(Person e: SocialNetwork.personSet)
				{
					result = socialNetworkObj.addNode(e);
				}
				for(Organisation e: SocialNetwork.organisationSet)
				{
					result = socialNetworkObj.addNode(e);
				}
				SocialNetworkMenu socialNetworkMenuObj = new SocialNetworkMenu();
				
				/* Person Object creation */
				Person person1 = null;
				Person person2 = null;
				do
				{
					socialNetworkMenuObj.showMenu();
					input = scan.nextInt();
					switch(input)
					{
						/* Displaying social network */
						case 1:
							Printer.displaySocialNetwork();
							break;
						
						/* Displaying records */
						case 2:
							Printer.displayRecords();
							break;
						
						/* Adding a node */
						case 3:
							person1 = new Person("eng.amitnatani1993@gmail.com","Amit Natani", "8559818925","JVM","SBTC");
							result = socialNetworkObj.addNode(person1);
							break;
						
						/* adding an edge */
						case 4:
							person2 = new Person("amitnatani@gmail.com","Amit Sharma", "9587935478","AVM","MIET");
							result = socialNetworkObj.addNode(person2);
							result = socialNetworkObj.addEdge(person1, person2);
							if(result == 1)
							{
								System.out.println("Edge Successfully Added");
							}
							else if(result == -1)
							{
								System.out.println("Edge Addition Failed");
							}
							break;
							
						/* removing a node */
						case 5:
							socialNetworkObj.removeNode(person1);
							break;
							
						/* displaying based on search */
						case 6:
							Printer.searchDisplay(socialNetworkObj, "Amit Natani");
							break;
							
						/* removing an edge between two nodes */
						case 7:
							socialNetworkObj.removeEdge(person1, person2);
							
						/* Exit */
						case 8:
							System.exit(0);
							
						default:
							System.out.println("Enter Right choice");
							input = scan.nextInt();
					}
				}while(true);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Graph {

	public static Set<Entity> nodeSet = new HashSet<Entity>();
	/** Method to add a node in graph 
	 * @param node
	 * @return 1 if the node is added successfully
	 *		   and -1 if the node is not added successfully
	 */
	int addNode(Node node)
	{
		try
		{
			Entity entity = (Entity)node;
			Iterator<Entity> iteratorNodeSet = nodeSet.iterator(); 
			while(iteratorNodeSet.hasNext())
			{
				if(iteratorNodeSet.next().getEmailId().equals(entity.getEmailId()))
				{
					return -1;
				}
			}
			if(entity instanceof Person)
				SocialNetwork.personSet.add((Person)entity);
			else
				SocialNetwork.organisationSet.add((Organisation)entity);
			nodeSet.add(entity);
			return 1;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return 0;
		}
	}
	
	/** Method to remove a node from the network 
	 * @param nodeToRemove
	 */
	void removeNode(Node nodeToRemove)
	{
		try
		{
			Entity entityToRemove = (Entity)nodeToRemove;
			Iterator<Entity> iteratorNodeSet = nodeSet.iterator();
			while(iteratorNodeSet.hasNext())
			{
				Entity entity = iteratorNodeSet.next();
				if(entity.getEmailId().equals(entityToRemove.getEmailId())) {
					
					removeFriends(entityToRemove);
					nodeSet.remove(entityToRemove);
					if(entityToRemove instanceof Person)
						SocialNetwork.personSet.remove((Person)entityToRemove);
					else
						SocialNetwork.organisationSet.remove((Organisation)entityToRemove);
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	/** Method to search a node in the network by its name
	 * @param name
	 * @return Set of Entities find with the name 
	 */
	Set<Entity> searchByName(String name)
	{
		Iterator<Entity> iteratorNodeSet = nodeSet.iterator();
		Set<Entity> entitySetSearch = new HashSet<Entity>();
		while(iteratorNodeSet.hasNext())
		{
			
			Entity entity = iteratorNodeSet.next();
			if(entity.getName() == name)
			{
				entitySetSearch.add(entity);
			}
		}
		return entitySetSearch;
	}
	
	/** Method to add an edge between two nodes
	 * @param node1
	 * @param node2
	 * @return 1 if edge is added successfully or return -1 if the edge cannot be added
	 * 			(whether the node is not available in the network or edge already exists between them)
	 */
	int addEdge(Node node1, Node node2)
	{
		try
		{
			Entity entity1 = (Entity)node1;
			Entity entity2 = (Entity)node2;
			boolean flag1 = false;
			boolean flag2 = false;
			boolean flag3 = false;
			Iterator<Entity> iteratorNodeSet = nodeSet.iterator();
			
			while(iteratorNodeSet.hasNext())
			{
				
				Entity entityTemp = iteratorNodeSet.next();
				if(entityTemp.getEmailId().equals(entity1.getEmailId()))
				{
					
					flag1 = true;
				}
				if(entityTemp.getEmailId().equals(entity2.getEmailId()))
				{
					
					flag2 = true;
				}
			}
			if(flag1 && flag2)
			{
				Iterator<Entity> itr = entity1.setFriends.iterator();
				while(itr.hasNext())
				{
					if(itr.next().getEmailId().equals(entity2.getEmailId()))
					{
						flag3 = true;
					}
				}
				if(flag3 == true)
					return -1;
				else
				{
					entity1.setFriends.add(entity2);
					entity2.setFriends.add(entity1);
					return 1;
				}
			}
			else
			{
				return -1;
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return 0;
		}
	}
	
	/** Method to remove an existing edge between two nodes
	 * @param node1
	 * @param node2
	 */
	void removeEdge(Node node1, Node node2)
	{
		try
		{
			Entity entity1 = (Entity)node1;
			Entity entity2 = (Entity)node2;
			Iterator<Entity> iteratorFriends = entity1.setFriends.iterator();
			while(iteratorFriends.hasNext())
			{
				if(iteratorFriends.next().getEmailId().equals(entity2.getEmailId()))
				{
					entity1.setFriends.remove(entity2);
				}
			}
			iteratorFriends = entity2.setFriends.iterator();
			while(iteratorFriends.hasNext())
			{
				if(iteratorFriends.next().getEmailId().equals(entity1.getEmailId()))
				{
					entity2.setFriends.remove(entity1);
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	/** Method to remove an entity from friend list of all other entities
	 * if the entity is removed from the network
	 * @param entity that is removed from the network
	 */
	void removeFriends(Entity entity)
	{
		try
		{
			Iterator<Entity> iteratorNodeSet = nodeSet.iterator();
			
			while(iteratorNodeSet.hasNext())
			{
				Entity entityTemp = iteratorNodeSet.next();
				Iterator<Entity> itrFriends = entityTemp.setFriends.iterator();
				while(itrFriends.hasNext())
				{
					
					if(itrFriends.next().getEmailId().equals(entity.getEmailId()))
					{
						entityTemp.setFriends.remove(entity);
					}
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	

}

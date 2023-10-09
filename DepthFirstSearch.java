/**
 * 
 * @author Nathan Johnson, RVera
 * Depth first search class, traverses 
 * tree by recursion. 
 *
 */
public class DepthFirstSearch {

    Node root;
    
    public DepthFirstSearch()
    {               
                System.out.println("Call DFS with root node to do a Depth First Search.");
    }//end constructor
    
    /**
     * Depth first search of tree 
     * @param node, root of tree being traversed
     * printing data of each node from the left side to the right side. 
     */
    public void DFS(Node node)        {
    	
    	if (node == null) {
    		return;
    	}
    	
    	System.out.println(node.getData());
    	DFS(node.getlChild());
    	DFS(node.getrChild());
    	
    }//end DFS
	
}//end class

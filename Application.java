
public class Application {

		public static void main(String[] args)
		{
			//System.out.println("Creating a tree of height "+ args[0]+".");
			Tree aTree=new Tree();//Creates a tree with root
			Node root=aTree.generatePracticeTree(5);
			DepthFirstSearch aSearch=new DepthFirstSearch();
			
			//Testing DFS of Node object named root.
			aSearch.DFS(root);
			
			//Testing nodeCount of root.
			System.out.println("The number of nodes traversed: " + root.nodeCount());
			
			//Testing tree height of root. 
			System.out.println("Height of tree is: " + aTree.getHeight(root));

	}//end main

}//end class

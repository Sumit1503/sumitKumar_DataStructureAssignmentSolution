package in.datastructure.assignment.services;

import in.datastructure.assignment.models.Node;

public class BSTtoSkewedServices {
	
	public Node rightRoot = null;
	
	// this method converts BST into right skewed tree
	public Node BSTSkewed(Node root)
	{
		
		if(root == null) {
			return rightRoot;
		}else {
			BSTSkewed(root.left);
			// calling method to add nodes to right skewed tree
			rightRoot = createSkewedTree(rightRoot, root);
			BSTSkewed(root.right);

		}	
		return rightRoot;
	}

	// this method creates and add nodes to right skewed tree
	public Node createSkewedTree(Node rightRoot, Node root) {
		Node n = new Node(root.value);
		if(rightRoot == null) {
			return n;
		}else {
			rightRoot.right = createSkewedTree(rightRoot.right, root);
		}
		return rightRoot;

	}
	
	// method traverses the right skewed tree
	public void traverseRightSkewed(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.value + " ");
        traverseRightSkewed(root.right);       
    }


}

package in.datastructure.assignment.main;

import in.datastructure.assignment.models.Node;
import in.datastructure.assignment.services.BSTtoSkewedServices;

public class BSTtoSkewedMain {
	
	public static void main(String[] args)
	{
		
		BSTtoSkewedServices obj = new BSTtoSkewedServices();
		
		// hardcoding the complete BST
		Node root = new Node(50);
		root.left = new Node(30);
		root.right = new Node(60);
		root.left.left = new Node(10);
		root.left.right = new Node(40);
		root.right.left = new Node(57);
		root.right.right = new Node(65);
		
		// calling method which converts BST to right skewed tree
		Node rightRoot = new Node(0);
		rightRoot = obj.BSTSkewed(root);
		
		// calling method to traverse right skewed tree	
		obj.traverseRightSkewed(rightRoot);
		
	}

}

package week6;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTree tree = new MyTree("Make Money Fast!");
		MyNode root = tree.root();
		//v1 v2 v3
		tree.addChild(root, "1. Motivation");
		tree.addChild(root, "2. Methods");
		tree.addChild(root, "3.References");
		//v1 의 child
		tree.addChild(root.getChildren().get(0), "1.1 Greed");
		tree.addChild(root.getChildren().get(0), "1.2 Avidity");
		//v2 의 child
		tree.addChild(root.getChildren().get(1), "2.1 Stock Fraud");
		tree.addChild(root.getChildren().get(1), "2.2 Ponzi Scheme");
		tree.addChild(root.getChildren().get(1), "2.3 Bank Robbery");
		
		preOrder(root, 0);
	
		
	}
	
	public static void preOrder(MyNode node, int depth) {
		int tempdepth= depth; //for indentation
		while(tempdepth !=0) {
			System.out.print(" ");
			tempdepth--;
		} //for indentation
		System.out.println(node.getElement());
		for(MyNode child : node.getChildren()) {
			preOrder(child, depth+1);
		}
	}
	

}

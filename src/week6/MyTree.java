package week6;

import java.util.ArrayList;

public class MyTree {

	protected MyNode root;
	protected int n;
	
	public MyTree() {
		// TODO Auto-generated constructor stub
		root = null;
	}

	public MyTree(Object e) {
		super();
		this.root = new MyNode(e);
		n = 1;
	}

	public int size() {
		return n;
	}
	
	public MyNode root() {
		return root;
	}
	
	public ArrayList<MyNode> children(MyNode v){
		return v.getChildren();
	}
	
	public boolean isExternal (MyNode v){
		if(v.getChildren().size() == 0 ) return true;
		else return false;
	}
	
	public MyNode addRoot(Object e) {
		MyNode temp = root;
		root = new MyNode(e);
		root.setChildren(temp.getChildren());
		return temp;
	}
	
	public MyNode addNode(Object e) {
		MyNode node = new MyNode(e);
		node.setParent(root);
		root.getChildren().add(node);
		n++;
		return node;
	}
	
	public MyNode addChild(MyNode v, Object e) {
		MyNode node = new MyNode(e);
		node.setParent(v);
		v.getChildren().add(node);
		n++;
		return node;
	}
	
	public MyNode addChild(MyNode v, int i, Object e) {
		MyNode node = new MyNode(e);
		node.setParent(v);
		v.getChildren().add(i,node);
		n++;
		return node;
	}
	
	public MyNode setChild(MyNode v, int i, Object e) {
		MyNode node = new MyNode(e);
		node.setParent(v);
		MyNode returnNode = v.getChildren().get(i);
		v.getChildren().set(i,node);
		return returnNode;
	}
	
	public MyNode removeChild(MyNode v, int i) {
		
		MyNode removeNode = v.getChildren().get(i);
		removeNode.setParent(null);
		v.getChildren().remove(i);
		n--;
		return removeNode;
	}
}

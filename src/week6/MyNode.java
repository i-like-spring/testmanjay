package week6;

import java.util.ArrayList;

public class MyNode {

	private Object element; //for generic
	private MyNode parent;
	private ArrayList<MyNode> children;
	
	public MyNode() {
		element = null;
		parent = null;
		children = null;
	}
	public MyNode(Object e){
		element = e;
		//parent
		children = new ArrayList<MyNode>();
	}
	
	public Object getElement() {
		return element;
	}
	public void setElement(Object element) {
		this.element = element;
	}
	public MyNode getParent() {
		return parent;
	}
	public void setParent(MyNode parent) {
		this.parent = parent;
	}
	public ArrayList<MyNode> getChildren() {
		return children;
	}
	public void setChildren(ArrayList<MyNode> children) {
		this.children = children;
	}

	public int degree() { 
		return children.size();
	}
	
	
	
}

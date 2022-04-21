package week6;

public class MyBinTree extends MyTree {

	public MyBinTree() {
		// TODO Auto-generated constructor stub
	}

	public MyBinTree(Object e) {
		super();
		this.root = new MyBinNode(e);
		n = 1;
	}
	
	public boolean isEmpty() {
		return (this.n == 0) ? true:false;
	}
	public boolean isRoot(MyBinNode v) {
		return this.root == v ? true:false;
	}
	
	public boolean isInternal(MyBinNode v) {
		return v.getChildren().size() != 0 ? true:false;
	}
	
	public boolean isExternal(MyBinNode v) {
		return v.getChildren().size() == 0 ? true:false;
		//need to change
	}
	
	public MyBinNode root() {
		return (MyBinNode)this.root;
	}
	
	public MyBinNode parent(MyBinNode v) {
		return (MyBinNode)v.getParent();
	}
	
	public MyBinNode left(MyBinNode v) {
		return v.left();
	}
	public MyBinNode right(MyBinNode v) {
		return v.right();
	}
	public boolean hasLeft(MyBinNode v) {
		return v.left() != null ? true : false;
	}
	public boolean hasRight(MyBinNode v) {
		return v.right() != null ? true : false;
	}
	public MyBinNode addRoot(Object e) {
		MyNode temp = root;
		root = new MyNode(e);
		root.setChildren(temp.getChildren());
		return (MyBinNode)temp; //downcasting
	}
	public MyBinNode addNode(Object e) {
		if(root.getChildren().get(0) == null) { //left
			MyBinNode node = new MyBinNode(e);
			node.setParent(root);
			root.getChildren().set(0,node);
			n++;
			return node;
		}
		else if(root.getChildren().get(1) == null){
			MyBinNode node = new MyBinNode(e);
			node.setParent(root);
			root.getChildren().set(1,node);
			n++;
			return node;
		}else {
			return null;
		}
	}
	public MyBinNode insertLeft(MyBinNode v, Object e) {
		MyBinNode node = new MyBinNode(e);
		v.setLeft(node);
		n++;
		return node;
	}
	public MyBinNode insertRight(MyBinNode v, Object e) {
		MyBinNode node = new MyBinNode(e);
		v.setRight(node);
		n++;
		return node;
	}
	//replace
	
	//remove
	
	//attach throw execption  -> 주의사항 upattach하고 size를 갱신해야함
	
}

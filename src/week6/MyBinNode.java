package week6;

public class MyBinNode extends MyNode {
	
	public MyBinNode(){
		super();
	}
	
	public MyBinNode(Object e){
		super(e);
		this.getChildren().add(null); //left
		this.getChildren().add(null); //right
	}
	
	public MyBinNode left() {
		
		return (MyBinNode)this.getChildren().get(0);
	}
	
	public MyBinNode right() {
		return (MyBinNode)this.getChildren().get(1);
	}
	
	public void setLeft(MyBinNode v) {
		this.getChildren().set(0, v);
	}

	public void setRight(MyBinNode v) {
		this.getChildren().set(1, v);
	}
}

package week6;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTree tree = new MyTree("cs16/");
		MyNode root = tree.root();

		//v1 v2 v3
		tree.addChild(root, "homeworks/");
		tree.addChild(root, "programs/");
		tree.addChild(root, "todo.txt(1)");
		//v1 의 child
		tree.addChild(root.getChildren().get(0), "h1c.doc(3)");
		tree.addChild(root.getChildren().get(0), "h1nc.doc(2)");
		//v2 의 child
		tree.addChild(root.getChildren().get(1), "DDR.java(10)");
		tree.addChild(root.getChildren().get(1), "Stokcs.java(25)");
		tree.addChild(root.getChildren().get(1), "Robot.java(20)");

		postOrder(tree, root);
	}

	public static int postOrder(MyTree tree, MyNode node) {
		if(tree.isExternal(node)) {
			String str = (String)node.getElement();
			String[] arr = str.split("\\(|\\)");
			/* for(int i=0; i<arr.length; i++) System.out.println(arr[i]); */
			return Integer.parseInt(arr[1]);
		}
		int sum = 0 ;
		for(MyNode child : node.getChildren()) {
			sum += postOrder(tree, child);
		}
		System.out.println((String)node.getElement() + "= "+sum +"KB");
		return sum;
	}

}

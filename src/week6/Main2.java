package week6;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyBinTree binaryTree = new MyBinTree('+');
		MyBinNode root = binaryTree.root();
		// left subtree
		MyBinNode m1 = new MyBinNode('*');
		MyBinNode m1_left = new MyBinNode(2);
		MyBinNode m1_right = new MyBinNode('-');
		m1_right.setLeft(new MyBinNode(3));
		m1_right.setRight(new MyBinNode(1));
		m1.setLeft(m1_left);
		m1.setRight(m1_right);
		// right subtree
		MyBinNode m2 = new MyBinNode('*');
		MyBinNode m2_left = new MyBinNode(3);
		MyBinNode m2_right = new MyBinNode(2);
		m2.setLeft(m2_left);
		m2.setRight(m2_right);

		root.setLeft(m1);
		root.setRight(m2);

		printExpr(root);
		int cal = evalExpr(root);
		System.out.println("="+cal);

	}

	public static void printExpr(MyBinNode v) {
		if (v.left() != null) {
			System.out.print("(");
			printExpr(v.left());
		}
		System.out.print(v.getElement());
		if (v.right() != null) {
			printExpr(v.right());
			System.out.print(")");
		}
	}
	
	public static int evalExpr(MyBinNode v) {
		if (v.left() == null && v.right() == null) {
			// external
			return (int) v.getElement();
		} else {
			int left = evalExpr(v.left());
			int right = evalExpr(v.right());
			switch ((char) v.getElement()) {
			case '*':
				return left * right;
			case '/':
				return left / right;
			case '+':
				return left + right;
			case '-':
				return left - right;
			default:
				return 0; //empty case
			}
		}
	}

}

package collection.program10;

class Node {
	int data;
	public Node left;
	public Node right;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class Program10 {
	
	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		}
		if (data < root.data) {
			root.left = insert(root.left, data);
		}
		if (data > root.data) {
			root.right = insert(root.right, data);
		}
		return root;
	}
	
	public static void inOrder(Node root) {
		if (root == null)
			return;
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 2, 5, 4, 4 };
		int n = arr.length;

		Node root = null;
		for (int i = 0; i < n; i++) {
			root = insert(root, arr[i]);
		}

		inOrder(root);
	}

}

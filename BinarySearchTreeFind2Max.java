
public class BinarySearchTreeFind2Max {
	
	public BinarySearchTreeFind2Max() {}
	
	private Node root;
	
	private class Node{
	
		public Node() {}
		
		public Node(int key) {
			this.key = key;
			left = null;
			right = null;
		}
		
		private int key;
		private Node left;
		private Node right;
	}
	
	public void put(int key) {
		root = put(key,root);
	} 
	
	private Node put(int key, Node root) {
		

		if(root == null) return new Node(key);
		

		if(key > root.key) root.right = put(key, root.right);
		if(key < root.key) root.left = put(key, root.left);

		return root;
		
	}
	
	private static int[] findTwoLargestIntegers(Node n) {
		
		if(n == null) return null;
		
		int[] twoMax = new int[2];
		Node max = n;
		

		while(max.right != null) {
			
			if(max.right.right == null && max.right.left == null) {
				twoMax[0] = max.right.key;
				twoMax[1] = max.key;
				return twoMax;
			}
		max = max.right;	
		}
			

		twoMax[0] = max.key;
		
		if(max.left != null) {
			max = max.left;
			
			while(max.right!=null){
				max = max.right;
			}				
		twoMax[1] = max.key;
	}
		

	return twoMax;
		
	}

	public void findTwoLargestIntegers() {
		
		int[] results = findTwoLargestIntegers(root);
		
		if(results != null) {
			if(results.length == 2) System.err.println("I due massimi trovati sono: "+results[0]+" e "+results[1]+".\n");
			else System.err.println("L'albero inserito non � valido!");
		}
	}
	
	public static void main(String[] args) {
		
		BinarySearchTreeFind2Max BST = new BinarySearchTreeFind2Max();
		BST.put(15);
		BST.put(10);
		BST.put(24);
		BST.put(8);
		BST.put(12);
		BST.put(16);
		BST.put(25);
		
		BST.findTwoLargestIntegers();
		
	}
	
	
}

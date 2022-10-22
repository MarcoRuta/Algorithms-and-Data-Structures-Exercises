import java.util.HashSet;
import java.util.Set;

public class BinarySearchTreeFind2Sum {
	
	public BinarySearchTreeFind2Sum() {}
	

	private static Node root;

	private Set<Integer> s;

	private class Node{
		
		public Node(int key) {
			this.key = key;
			this.left = null;
			this.right = null;
			}
		
		private int key;
		private Node left;
		private Node right;
		
	}
		
	public void put(int key) {
		root = put(key,root);
	}
	
	private Node put(int key,Node n) {
		
		if (n == null) return new Node(key);
		
		if (key > n.key) n.right = put(key, n.right);
		
		if (key < n.key) n.left = put(key, n.left);
		
		return n;
		
	}
	
	public void findTwoSum(int x) { 
		
	    this.s = new HashSet<Integer>();
		findTwoSum(x,root);
	}
	
	private void findTwoSum(int x, Node n){

		if(s.contains(x-n.key)) {
			System.out.println("Ho trovato una coppia! \n"+n.key+" + "+(x-n.key)+" = "+x);
			return;
		}
		else {
			s.add(n.key);

			if(n.right != null)
				findTwoSum(x,n.right);
			if(n.left != null)
				findTwoSum(x,n.left);

		}

		return;
	}
	
public static void main(String[] args) {
		
		BinarySearchTreeFind2Sum BST = new BinarySearchTreeFind2Sum();
		BST.put(27);
		BST.put(14);
		BST.put(35);
		BST.put(-5);
		BST.put(19);
		BST.put(31);
		BST.put(42);
		
		BST.findTwoSum(9);
		
	}
	
	

	
}

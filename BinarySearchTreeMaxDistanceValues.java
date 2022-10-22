
public class BinarySearchTreeMaxDistanceValues {
	
	private Node root;
	
	public BinarySearchTreeMaxDistanceValues(){};
	
	public void put(int key) {
		root = put(key,root);
	}
	
	public void maxDistance() {
		
		int[] maxMin = new int[2];
		
		if(root == null) System.out.println("Non è stato inserito un BST valido");
		
		maxMin[0] = getMaxValue(root);
		maxMin[1] = getMinValue(root);
		
	if(maxMin!=null) System.out.println("La coppia con differenza massima è : ("+maxMin[0]+";"+maxMin[1]+") con differenza pari a: "+(maxMin[0]-maxMin[1]));
	}
	
	private Node put(int key, Node n) {
		
		if(n == null) return new Node(key);
		
		if(key > n.key) n.right = put(key, n.right);
		if(key < n.key) n.left = put(key, n.left);
		
	return n;
		
	}
		
	private int getMaxValue(Node n) {
			
		while(n.right != null) {
			n = n.right;
		}
		
		return n.key;
		}
	
	private int getMinValue(Node n) {
		
		while(n.left != null) {
			n = n.left;
		}
		
		return n.key;
		}
		
	private class Node{
		
	public Node(int key) {
		this.key = key;
		this.left = null;
		this.right = null;
		}
		
	int key;
	Node left;
	Node right;
	}

	public static void main(String[] args) {
		
		BinarySearchTreeMaxDistanceValues BST = new BinarySearchTreeMaxDistanceValues();
		BST.put(27);
		BST.put(14);
		BST.put(35);
		BST.put(19);
		BST.put(31);
		BST.put(42);
		
		BST.maxDistance();
		
	}

}

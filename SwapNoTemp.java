public class SwapNoTemp {
	
	public static void swap(Integer x, Integer y) {
		
		System.out.println(x + " " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println(x + " " + y);
	
	}
	
	public static void main(String[] args) {
		SwapVar.swap(2,3);
	}

}

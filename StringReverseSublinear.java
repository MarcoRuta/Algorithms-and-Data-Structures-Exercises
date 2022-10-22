public class StringReverseSublinear {
	

	public static String reverse(String str) {
		
		char[] strChar = str.toCharArray();

		reverse(strChar, 0, str.length()-1);
		
		return new String(strChar);

	}
	
	public static void reverse(char[] s, int i, int j) {
		
		if(i < j) {
		
			swap(s, i, j);
			reverse(s, i + 1, j - 1);
		}
	}
	
	private static void swap(char[] a, int i, int j) {
		char ch = a[i];
		a[i] = a[j];
		a[j] = ch;
	}
	
	
	public static void main(String[] args) {
		
		String str = "trytoreverseme";

		System.out.println(StringReverse.reverse(str));
	}

}

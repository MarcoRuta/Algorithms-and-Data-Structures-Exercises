
public class PalindromSublinear {
	
	public static boolean palindrom(String str) {
		
		if(str.length() < 2) {
			return true;
		}

		char[] string = str.toCharArray();
		
		int n = str.length()-1;

		for(int i = 0; i <= n/2; i++) {
			if(string[i]!=string[n-i])
					return false;	
		}
		
		return true;
	}

	
	public static void main(String[] args) {
		System.out.println(Palindrom.palindrom("itopinonavevanonipoti"));
		System.out.println(Palindrom.palindrom("io"));
	}

}

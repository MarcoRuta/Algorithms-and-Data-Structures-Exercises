import java.util.HashMap;

public class FindSumInArrayLessThanNN {
	
	public static void findCouple(int[] a, int x) {
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i = 0; i<a.length; i++) {
			
				if(map.containsKey(x - a[i])){
					System.out.println("Gli elementi in posizione :"+i+" e "+map.get(x-a[i])+" sommati danno "+x+"\n");
					return;
				}
			map.put(a[i], i);
				
		}
		System.out.println("Non sono presenti elementi tali che la somma dia "+x+"\n");
		
	}
	
	
	

	public static void main(String[] args) {
		
		int[] a = {1,3,7,11,-5,9,4}; // ha doppie per x = 6,4,7 ... non ha coppie per x = -2, 114...
		int x = 6;
		
		Es9.findCouple(a, x);
		
		x = 114;
		
		Es9.findCouple(a, x);
		
		
	}
	
	
}

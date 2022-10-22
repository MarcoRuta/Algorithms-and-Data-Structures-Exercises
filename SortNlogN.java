public class SortNlogN {
	
	public static void sort(int[] array, int k) {
		
		int counter[] = new int[k+1]; 
		
		for(int i : array) { 
			counter[i]++; 
		}
		
		int n = 0;
		for(int i = 0; i < counter.length; i++) {
			while(counter[i] > 0) {
				array[n++] = i;
				counter[i]--;
			}
		}

	}
	
	public static void main(String[] args) {
		
		int[] array= {2,4,1,3,2};
		Sort.sort(array, 5);
		
		for(int i: array)
			System.out.print(i + " ");
	}

}

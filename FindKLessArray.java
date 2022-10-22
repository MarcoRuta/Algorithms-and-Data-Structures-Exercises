
public class FindKLessArray {
	
	public static int[] findKLessNumbers(int[] a, int x) {

		int[] results = new int[x];
		
		
		for (int i=0; i<x; i++) {
			
			int min = a[i];
			int minPos = i;
			
			for(int j = i+1; j<a.length; j++)
				if(a[j] < min) {
					min = a[j];
					minPos = j;
				}
		
			int t = a[i];
			a[i] = a[minPos];
			a[minPos] = t;
			
			results[i] = a[i];
		
		}	
		
		return results;
	}
	
	public static void main(String[] args) {
        int[] array = {7,4,6,9,3,1,15,8,11,5};
        int k = 3;
        int[] minimi = FindKLessArray.findKLessNumbers(array, k);

        System.out.println("K valori minimi: ");
        for(int i=0; i<minimi.length ;i++) 
            System.out.print(minimi[i]+" ");
    
	}
}
	


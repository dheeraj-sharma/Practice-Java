

public class MaxProductSubArray {

	static public int maxProductSubarray(int array [], int k){
		
		int maxProduct = 1;
		int prevProduct = 1;
		
		// take product of first k elements.
		 for (int i=0; i<k; i++)
			 maxProduct *= array[i];
		 
		 prevProduct = maxProduct;
		
		 // for next elements upto n - k
		for (int i = 1; i< array.length - k; i++) {
			int currentProduct = (prevProduct/array[i-1])*array[i+k-1];
			
			if(maxProduct < currentProduct){
				maxProduct = currentProduct;
			}
			
			prevProduct = currentProduct;
		}
		
		return maxProduct;
	}
	
	public static void main(String[] args) {
		 int arr1[] = {1, 5, 9, 8, 2, 4, 1, 8, 1, 2};
		 
		 System.out.println(maxProductSubarray(arr1, 6));
	}
}

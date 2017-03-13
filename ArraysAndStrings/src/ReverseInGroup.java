
/**
 * @author DheerajS
 *
 *Reverse an array in groups of given size
Given an array, reverse every sub-array formed by consecutive k elements.

Examples:

Input: 
arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]
k = 3
Output:  
[3, 2, 1, 6, 5, 4, 9, 8, 7]

Input: 
arr = [1, 2, 3, 4, 5, 6, 7, 8]
k = 5
Output:  
[5, 4, 3, 2, 1, 8, 7, 6]

Input: 
arr = [1, 2, 3, 4, 5, 6]
k = 1
Output:  
 */
public class ReverseInGroup {

	public static void reverseInGroup(int[] array, int k){
		for(int i=0; i < array.length; i+=k){
			
			int left = i;
			
			int right = Math.min(i+k-1, array.length-1);
					
			while(left < right){
				int temp = array[left];
				array[left] = array[right];
				array[right] = temp;
				left++; right--;
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
		
		int k = 2;
		
		reverseInGroup(arr, k);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

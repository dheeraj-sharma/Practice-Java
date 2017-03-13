import java.util.Arrays;


/**
 * @author DheerajS
 *
 *given an array {1,2,3,4,5} print all possible unique combinations .
 *
 *nCr
 *eg. 1,2,3,4,5,12,13,14,15,23,24,25,34,35,123,124,125,134,135,145,1234,1235,1245,1345,12345
 */
public class PrintAllUniqueCombinations {

	public static void printCombinations(int[] array, int r){
		
		for(int i=0;i<array.length;i++){
			for(int j = i;j<array.length;j++){
				
				int[] copyOfRange = Arrays.copyOfRange(array, i, j+1);
				for (int k : copyOfRange) {
					System.out.print(k+",");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int [] array = {1,2,3,4};
		
		printCombinations(array, 5);
	}
}

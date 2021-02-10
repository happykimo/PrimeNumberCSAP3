import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxNum = 1000000;						//max limit
		int[] nums = new int[maxNum];
		for(int i =0; i < nums.length;i++) {	//initialize the integer array
			nums[i]=i+1;
		}
		compute(nums); //compute the primes
		display(nums); //display the primes
	}
	
	/* Use the algorithm described in the lab description so that the array, nums, contains all the
	 * valid primes. All others should be -1. 
	 */
	public static void compute(int[]nums) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i=2;i<=nums.length;i++) {
			for(int j=2;i<=i;j++) {
				if(j==i) {
					result.add(i);
				}
				if(i%j==0) {
					break;
				}
			}
			
		}
	}
	/* 
	 * Complete the method below so that it prints all the prime numbers in the integer array nums
	 * Assume that the compute method has been called that sets the array to contain the prime numbers as 
	 * described in the lab document. 
	 */
	 public static void display(int[] list) {

	        for(int integer: list) {
	            System.out.println(integer + " ");
	        }

	    }

}
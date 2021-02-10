import java.util.*;

public class Driver {

	public static void main(String args[]) 
	{
		//Scanner input = new Scanner(System.in); 
		final int MAX = 100;
		boolean primes[];
		primes = new boolean[MAX];
		compute(primes);
		display(primes);
	}


	
	/* Use the algorithm described in the lab description so that the array, nums, contains all the
	 * valid primes. All others should be -1. 
	 */
	  
	public static void compute(boolean[] nums) {
		for(int i=2;i<=nums.length;i++) {
			for(int j=2;i<=i;j++) {
				if(j==i) {
					nums[i]=true;
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
	 public static void display(boolean[] list) {
		 
	        for(int i=0;i<list.length;i++) {
	        	if(list[i]==true) {
	        		System.out.println(i);
	        	}
	        }

	    }

}
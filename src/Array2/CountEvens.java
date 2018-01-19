package Array2;

public class CountEvens {

	public int countEvens(int[] nums) {
		  
		  int numEvens = 0;
		  
		  for(int i = 0; i < nums.length; i++) {
					if(nums[i]% 2 == 0) {
						numEvens++;
					}
		  }
		  return numEvens;
		}
}

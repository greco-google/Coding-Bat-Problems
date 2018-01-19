package Array2;

public class centeredAverage {

	public int centeredAverage(int[] nums) {
		  
	    int max = nums[0];
			int min = nums[0];
			int sum = 0;
	  
			for (int i = 0; i < (nums.length); i++) {
				//I had a line of code that was sum += sum + nums[0]; which was really
				//messing with my code. It took about 5 minutes to debug line by line
				//so that I could correct it. :(  But it is now fixed:)
				if(nums[i] > max) {
					max = nums[i];
				}
				if(nums[i] < min) {
					min = nums[i];
	      }
	    sum = sum + nums[i];
			}
	  return (sum - max - min)/(nums.length - 2);
	}
	  
	        //Teacher's answer
	// public int centeredAverage(int[] nums) {
	//   int small = nums[0];
	//   int big = nums[0];
	//   int total = 0;
	  
	//   for (int i=0; i<(nums.length); i++) {
//	     if (nums[i]<small){
//	       small=nums[i];
//	     }
//	     if (nums[i]>big){
//	       big=nums[i];
//	     }
//	     total=total+nums[i];
	//   }
	  
	//   return (total-big-small)/(nums.length-2);
	// }

	
}

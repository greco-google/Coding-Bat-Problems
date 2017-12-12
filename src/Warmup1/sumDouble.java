package Warmup1;

public class sumDouble {

	/*Given two int values, return their sum. Unless the two values 
	 * are the same, then return double their sum.


			sumDouble(1, 2) → 3
			sumDouble(3, 2) → 5
			sumDouble(2, 2) → 8*/
	
	public int sumDouble(int a, int b) {
		  
		  int totalSum = a + b;
		  
		  if(a == b) {
		    
		    totalSum = totalSum * 2;
		  }
		  
		 /* 
		    I tried to implement an else statement with a new varialble called total2, but
		    it didn't work. So I reverted back to the part that did. 
		    
		    else {
		    
		    return totalSum;
		    
		  } */
		 
		  return totalSum;
		  
		}

		//Teacher answer
		/*
		public int sumDouble(int a, int b) {

		if(a != b)
		return a + b;
		else
		return 2*(a + b);

		}


		*/
}

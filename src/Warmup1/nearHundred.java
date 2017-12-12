package Warmup1;

public class nearHundred {
	/*Given an int n, return true if it is within 10 of 
	 * 100 or 200. Note: Math.abs(num) computes the 
	 * absolute value of a number.


			nearHundred(93) → true
			nearHundred(90) → true
			nearHundred(89) → false*/
	
	public boolean nearHundred(int n) {
		  
		  if(Math.abs(n-100) <= 10)
		    return true;
		  if(Math.abs(n-200) <= 10)
		    return true;
		  else
		    return false;
		  //if(n >= 90 && n <= 110)
		  //multiple lines of code under the if else then you have to put the {}
		}
}

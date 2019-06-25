package Flowcontrol;

public class Sumofdig {
	 static int getSum(int n)
	 { 
	    int s;
		 for (s = 0; n > 0; s += n % 10, n /= 10); 
		 return s;
	 }
		 public static void main(String[] args) 
		    { 
		        int n = 1234; 
		  
		        System.out.println(getSum(n)); 
		    } 
		}

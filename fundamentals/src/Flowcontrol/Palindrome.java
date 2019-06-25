package Flowcontrol;

import java.util.Scanner;

public class Palindrome {
	private static Scanner s;

	public static void main(String[] args) {
		int n ;
		int rev=0;
		int r;
	    int m;
	    s = new Scanner(System.in);
        System.out.print("Enter any number:");
        n = s.nextInt();
	    m=n;
		while(n>0) {
		r=n%10;
		rev=rev*10+r;
		n=n/10;
		}
	    if(m==rev) {
	    	System.out.println("Palindrome");
	    }
	    else {
	    	System.out.println("Not a palindrome");
	    }
	}

}

package Flowcontrol;
import java.util.*;

public class Prime3 {
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		int n ;
		int p=0;
		System.out.println("Enter an integer");
        n = in.nextInt();
        System.out.println("You entered integer " + n);
        for(int i=1;i<=n;i++) {
			if(n%i == 0) {
				p++;
			}
		}
		if(n==1) {
			System.out.println("neither prime nor composite");
		}
		else if(n==0) {
			System.out.println("Neither prime nor composite");
		}
		else {
			if(p==2) {
				System.out.println("number is prime number");
			}
			else {
				System.out.println("not a prime number");
			}
        
		}
	}
}
package Flowcontrol;
import java.util.*;
public class Floyds {
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		int n ;
		System.out.println("Enter an integer");
        n = in.nextInt();
        System.out.println("You entered integer " + n);
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");	
				}
			System.out.println('\n');
		}
	}

}

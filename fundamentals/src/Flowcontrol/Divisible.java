package Flowcontrol;

import java.util.Scanner;

public class Divisible {
	private static Scanner s;

	public static void main(String[] args) {
		int a,b,c,i,f=0;
		s = new Scanner(System.in);
	        System.out.print("Enter  number1:");
	        a = s.nextInt();
	        System.out.print("Enter number2:");
	        b = s.nextInt();
	        System.out.print("Enter number3:");
	        c = s.nextInt();
	        for(i=1;i<1000;i++){
	            if(f==5)
	            break;
	            if(i%a==0&&i%b==0&&i%c==0){
	            System.out.println(i);
	            f++;
	            }
	        }
	}
}
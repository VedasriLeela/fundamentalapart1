package Flowcontrol;

public class Primenum {
	public static void main(String[] args) {
		int p=0;
		int num = Integer.parseInt(args[0]);
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				p++;
			}
		}
		if(num==1) {
			System.out.println("neither prime nor composite");
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
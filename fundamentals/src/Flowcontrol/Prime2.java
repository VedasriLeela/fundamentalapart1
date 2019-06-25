package Flowcontrol;

public class Prime2 {
	public static void main(String[] args) {
		int p=0;
		int n=57;
		for(int i=10;i<=n;i++) {
			if(n%i==0) {
				p++;
			}
		}
			if(p==2) {
				System.out.println("it is prime number");
			}
			else {
				System.out.println("it is not a prime number");
			}
	}

}

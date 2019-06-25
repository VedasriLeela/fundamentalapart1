package Flowcontrol;

public class Reverse {
	public static void main(String[] args) {
		int n =8765;
		int rev=0;
		int r;
		while(n>0) {
		r=n%10;
		rev=rev*10+r;
		n=n/10;
		}
		System.out.println(rev);
		
	}

}

package Flowcontrol;

public class Pnz {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		if(num==0)
		{
			System.out.println("Zero");
	}
		else if(num<0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("positive");
		}

	}
}
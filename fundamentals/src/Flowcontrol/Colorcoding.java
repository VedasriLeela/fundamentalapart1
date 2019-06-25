package Flowcontrol;

import java.util.Scanner;

public class Colorcoding {
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		char x = in.next().charAt(0);
		System.out.println("You entered char " + x);
		switch(x) {
		case('R'):
		{
			System.out.println("Color is red");
			break;
		}
		case('Y'):
		{
			System.out.println("Color is yellow");
			break;
		}
		case('B'):
		{
			System.out.println("Color is Blue");
			break;
		}
		case('G'):
		{
			System.out.println("Color is green");
			break;
		}
		case('O'):
		{
			System.out.println("Color is white");
			break;
		}
		case('W'):
		{
			System.out.println("Color is White");
			break;
		}
		default:
		{
			System.out.println("Invalid Case");
			break;
		}
		}
	}
}

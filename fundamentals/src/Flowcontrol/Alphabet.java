package Flowcontrol;
import java.util.*;

public class Alphabet {
	private static Scanner i;

	public static void main(String[] args) {
		i = new Scanner(System.in);
		char character = i.next().charAt(0);
	if((character>='A' && character<='Z')||(character>='a'&&character<='z')) {
		System.out.println("Alphabets");
	}
	else if(character>='0'&&character<='9') {
		System.out.println("Digits");
	}
	else  {
		System.out.println("Special Charecter");
	}
	}

}

package basics;

public class Addition {
	public static void main(String[] args) {
		int i= args.length;
		if(i>=2) {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			System.out.println(num1+num2);
		}
	}
}
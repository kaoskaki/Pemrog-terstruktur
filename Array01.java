import java.util.Scanner;
class Array01 {
	public static void main(String[] args) {
		int[] b = new int[100];
		int i=0,a=0;
		Scanner s = new Scanner(System.in);
		for(i=0;i<=4;i++) {
			System.out.print("Enter an integer number: ");
			b[i] = s.nextInt();
		}
		System.out.println("Result");
		for(i=0;i<=4;i++) {
			System.out.println("x["+i+"] = " + b[i]);
		}
	}
}
		

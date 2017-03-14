import java.util.Scanner;
class array02 {
	public static void main(String[] args) {
		int[] b = new int[100];
		int i=0;
		double rata=0,jumlah=0;
		Scanner s = new Scanner(System.in);
		for(i=0;i<=4;i++) {
			System.out.print("Enter an integer number: ");
			b[i] = s.nextInt();
			jumlah=jumlah+b[i];
		}
		rata=jumlah/5;
		System.out.println("Result");
		for(i=0;i<=4;i++) {
			System.out.println("x["+i+"] = " + b[i]);
		}
		System.out.println("Nilai rata-rata (Mean) = "+rata);
		
	}
}
		

		

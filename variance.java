import java.lang.Math;
import java.util.Scanner;
public class variance {
	public static void main(String[] args) {
		double[] x = new double[5];
		double[] y = new double[5];
		int i=0;
		double mean=0,varian=0,toty=0,rata=0;
		Scanner s = new Scanner(System.in);
		
		for(i=0;i<5;i++){
			System.out.print("Enter a number=");
			x[i]=s.nextInt();
			rata=rata+x[i];
		}
		mean=rata/x.length;
		for(i=0;i<5;i++){
			y[i] = Math.pow((x[i]-mean),2);
			toty=toty+y[i];
		}
		varian = toty / (x.length-1);
		System.out.println("Mean = "+mean);
		System.out.println("Variance = "+varian);
		System.out.println("SD = "+Math.sqrt(varian));
	}
}
		
		
		
		

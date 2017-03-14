import java.util.Scanner;
public class sumrowcol {
	public static void main(String[] args) {
		int[][] a = new int[3][5];
		int[] totkol = new int[5];
		int[] totbar = new int[3];
		int i,j;
		Scanner s = new Scanner(System.in);
		
		for(i=0;i<3;i++){
			for(j=0;j<5;j++){
				System.out.print("Input a["+i+"]["+j+"]= ");
				a[i][j]=s.nextInt();
			}
		}
		// menghitung total kolom
		for(j=0;j<5;j++){
			for(i=0;i<3;i++){
				totkol[j]=totkol[j]+a[i][j];
			}
		}
		// menghitung total baris
		for(i=0;i<3;i++){
			for(j=0;j<5;j++){
				totbar[i]=totbar[i]+a[i][j];
			}
		}
		// cetak data matrix
		for(i=0;i<3;i++){
			for(j=0;j<5;j++){
				System.out.print("\t"+a[i][j]);
			}
			System.out.println();
		}
		// cetak total kolom
		System.out.print("Total=");
		for(j=0;j<5;j++){
			System.out.print("\t"+totkol[j]);
		}
		//cetak total baris
		System.out.println("\nTotal baris");
		for(j=0;j<5;j++)
			System.out.println("Baris ke "+j+" = " + totbar[j]);
	}
}

/* 
 * Program ini dibuat untuk menyelesaikan persamaan linier 2 variable
 * y = x + 1.5x.
 * Dengan memanfaatkan array 2 dimensi, baris pertama digunakan untuk
 * menampung nilai x sedangkan baris kedua digunakan untuk menampung 
 * hasil perhitungan persamaan linier.
 * 
 */
public class linier {
	public static void main(String[] args) {
		double[][] a = new double[2][4];
		int i,y;
		
		for(y=0;y<4;y++) {
			a[0][y]=y+1;
			a[1][y]=3+(1.5*a[0][y]);
		}
		for(i=0;i<2;i++){
			for(y=0;y<4;y++){
				System.out.print(a[i][y]+"\t");
			}
			System.out.println();
		}
	}
}

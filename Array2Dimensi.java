class Array2Dimensi {
	public static void main (String[] args) {
		int i,j;
		int nilai [][] = {{7,70},{8,80},{9,90}};
		for (i=0; i<3; i++){
			for (j=0; j<2; j++)
			System.out.print(nilai[i][j]+" ");
			System.out.println();
		}
	}
}

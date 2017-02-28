package matr;

public class matr {

	public static void main(String[] args) {
		int n = 6;
		System.out.println("----MATR----");
		int [][] matr;
		matr = new int [n][n];
		for (int i=0; i<n; i++){
			for (int j=0; j<n; j++){
				matr[i][j] = (int) (Math.random()*99);
				if (matr[i][j]<10)
					System.out.print(" " + matr[i][j] + " ");
				else
					System.out.print(matr[i][j] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		System.out.println("----MART----");
		
		int [][] mart;
		mart = new int [n][n];
		for (int i=0; i<n; i++){
			for (int j=0; j<n; j++){
				mart[i][j] = (int) (Math.random()*99);
				if (mart[i][j]<10)
					System.out.print(" " + mart[i][j] + " ");
				else
					System.out.print(mart[i][j] + " ");
			}
		System.out.println("");
		}
	}
}

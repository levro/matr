package matr;

public class matr {

	public static void main(String[] args) {
		int n = 4;
		int m = 49;
		System.out.println("----MATR----");
		int [][] matr;
		matr = new int [n][n];
		for (int i=0; i<n; i++){
			for (int j=0; j<n; j++){
				matr[i][j] = (int) (Math.random()*m);
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
				mart[i][j] = (int) (Math.random()*m);
				if (mart[i][j]<10)
					System.out.print(" " + mart[i][j] + " ");
				else
					System.out.print(mart[i][j] + " ");
			}
		System.out.println("");
		}
		
		System.out.println("");
		System.out.println("----SUM-----");
		int [][] sum;
		sum = new int [n][n];
		for (int i=0; i<n; i++){
			for (int j=0; j<n; j++){
				sum[i][j] = matr[i][j] + mart[i][j];
				if (sum[i][j]<10)
					System.out.print(" " + sum[i][j] + " ");
				else
					System.out.print(sum[i][j] + " ");
			}
		System.out.println("");
		}
	
	}
}

package matr;

public class matr {

	public static void main(String[] args) {
		int [][] matr;
		matr = new int [6][6];
		for (int i=0; i<6; i++){
			for (int j=0; j<6; j++){
				matr[i][j] = (int) (Math.random()*99);
				if (matr[i][j]<10)
					System.out.print(" " + matr[i][j] + " ");
				else
					System.out.print(matr[i][j] + " ");
			}
			System.out.println("");
		}		
	}

}

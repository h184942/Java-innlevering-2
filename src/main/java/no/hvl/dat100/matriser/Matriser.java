package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int[] rad : matrise) {
			System.out.println();
			
			for (int verdi : rad) {
				System.out.println(verdi + " ");
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		
		String sMatrise = "";
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				sMatrise += matrise[i][j] + " ";
			}
			sMatrise += "\n";
		}
		return sMatrise;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] nyMatrise = new int[matrise.length][];
		
		for (int i = 0; i < matrise.length; i++) {
			nyMatrise[i] = new int[matrise[i].length];
			
			for (int j = 0; j < matrise[i].length; j++) {
				nyMatrise[i][j] = matrise[i][j] * tall;
			}
		}
		return nyMatrise;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		
		if (a.length != b.length) {
			return false;
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i].length != b[i].length) {
				return false;
			}
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != b[i][j]) {
					return false;
				}
			}
		}
		return true;
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		int[][] nyMatrise = new int[matrise[0].length][matrise.length];
	
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				nyMatrise[j][i] = matrise[i][j];
			}
		}
		return nyMatrise;                 
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		int m = a.length;
		int n = a[0].length;
		int p = b[0].length;
		
		int[][] nyMatrise = new int[m][p];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < p; j++) {
				for (int k = 0; k < n; k++) {
					nyMatrise[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return nyMatrise;
	}
}






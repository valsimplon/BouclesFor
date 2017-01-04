package co.simplon.boucles;

public class BouclesFor {
	public static final int MAX_SUPPORTED = 100;

	private Integer debut = null;
	private Integer fin = null;

	public BouclesFor() {

	}

	public BouclesFor(int debut, int fin) {
		this.debut = debut;
		this.fin = fin;
	
	}

	public int[] construireTableau() {
		if (debut == null || fin == null) {
			return construireTableauSansBornes();
		} else {
			return construireTableauAvecBornes();
		}
	}

	public int[] construireTableauInverse() {
		
		int[] tableau = new int[10];
		int j = 0;
		
		for (int i = fin; i>= debut; i--) {
			tableau[j] = i;
			j++;
		}
		return tableau;
	}

	public int[] construireTableauEntiersPairs() {
		
// tailleTableau = (this.fin - this.debut + 1) / 2;
		int[] tableau = new int[10];
		int j = 0;
		for (int i = debut; i <= fin; i++) {
			if (i % 2 == 0) {
				tableau[j] = i;
				j++;
			}
		}
		return tableau;
	}

	private int[] construireTableauAvecBornes() {

		/* final int tailleTableau = this.fin - this.debut + 1;
		 * int[] tableau = new int[tailleTableau];
		 * for (int index = 0; index < tailleTableau; index++) {
		 * 		tableau[index] = debut + index;
		 * }
		 */
		int[] tableau = new int[10];
		
		for (int i = debut; i <= fin; i++) {
			tableau[i-debut] = i;
		}
		return tableau;
	}

	private int[] construireTableauSansBornes() {
		
		int[] tableau = new int[MAX_SUPPORTED];
		
		return tableau;
	}

	public String[] suffixerTableau(String[] tableauEntree, String suffixe) {
		
		String[] tableauSortie = new String[4];
		
		for (int i = 0; i <= 3; i++) {
			tableauSortie[i] = tableauEntree[i] + suffixe;	
		}
		return tableauSortie;
	}

	public Integer[] applanirMatrice(Integer[][] matrice) {
		
		int i = 0;
		int j;
		int tailleTableau = 0;
		
		if (matrice.length != 0) {
			for (i = 0; i < matrice.length; i++)
				tailleTableau = tailleTableau + matrice[i].length;
		}
		
		Integer[]tableau = new Integer[tailleTableau];	
		i = 0;
		int k = 0;
		
		if (matrice.length != 0) {
			for (i = 0; i < matrice.length; i++) {
				j = 0;
				while (j < matrice[i].length) {
					tableau[k] = matrice[i][j];
					j++;
					k++;
				}
			}
		}
		
		return tableau;
	}

	public int[] construireTableauAvecWhile() {
		return null;
	}
	
	public int[] construireTableauEntiersPairsAvecWhile() {
		return null;
	}

}

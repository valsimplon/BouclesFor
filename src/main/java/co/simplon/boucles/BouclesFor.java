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
		
		String[] tableauSortie = new String[tableauEntree.length];
		int i = 0;
		
		for (String valeur : tableauEntree) {
			tableauSortie[i++] = valeur + suffixe;
		}
		
		return tableauSortie;
	}

	public Integer[] applanirMatrice(Integer[][] matrice) {
		
		int tailleTableau = 0;
		
		if (matrice.length != 0) {
			for (Integer[] tab : matrice)
				tailleTableau = tailleTableau + tab.length;
// 			tailleTableau += tab.length;
		}
		
		Integer[] tableau = new Integer[tailleTableau];	
		
		if (matrice.length != 0) {
			int i = 0;
			for (Integer[] tab : matrice) {
				for (Integer valeur : tab) {
					tableau[i++] = valeur;
				}
			}
		}
		
		return tableau;
	}

	public int[] construireTableauAvecWhile() {
		
		int tailleTableau = fin - debut + 1;
		int[] tableau = new int[tailleTableau];
		int i = 0;
		
		while (i< tailleTableau) {
			tableau[i] = ++i;
		}
		
		return tableau;
	}
	
	public int[] construireTableauEntiersPairsAvecWhile() {
		
		int tailleTableau = (fin - debut + 1) / 2;
		
		int[] tableau = new int[tailleTableau];
		
		int index = 0;
		int valeur = debut;
		if ((valeur) % 2 != 0)
			valeur++;
		
		while (index < tailleTableau) {
				tableau[index] = valeur;
				index++;
				valeur+=2;
		}
		
		return tableau;
	}

}

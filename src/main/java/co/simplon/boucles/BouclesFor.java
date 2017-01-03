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
		return null;
	}

	public Integer[] applanirMatrice(Integer[][] matrice) {
		return null;
	}

	public int[] construireTableauAvecWhile() {
		return null;
	}
	
	public int[] construireTableauEntiersPairsAvecWhile() {
		return null;
	}

}

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
		return null;
	}

	public int[] construireTableauEntiersPairs() {
		return null;
	}

	private int[] construireTableauAvecBornes() {
		return null;
	}

	private int[] construireTableauSansBornes() {
		return null;
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

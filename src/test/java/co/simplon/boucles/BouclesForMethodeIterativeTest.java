package co.simplon.boucles;

import static org.junit.Assert.*;

import org.junit.Test;

public class BouclesForMethodeIterativeTest {

	@Test
	public void le_tableau_contient_10_elements() {
		BouclesFor boucle = new BouclesFor(1, 10);
		
		int[] tableau = boucle.construireTableau();
		
		assertEquals(10, tableau.length);
	}

	@Test
	public void les_10_elements_du_tableau_sont_en_ordre_inverse() {
		BouclesFor boucle = new BouclesFor(1, 10);
		
		int[] tableau = boucle.construireTableauInverse();
		
		assertEquals(10, tableau.length);
		assertEquals(10, tableau[0]);
		assertEquals(1, tableau[9]);
	}
	
	@Test
	public void le_tableau_contient_les_10_premiers_entiers_pairs() {
		BouclesFor boucle = new BouclesFor(1, 20);
		
		int[] tableau = boucle.construireTableauEntiersPairs();
		
		assertEquals(10, tableau.length);
		assertEquals(2, tableau[0]);
		assertEquals(20, tableau[9]);
	}
	
	@Test
	public void boucle_for_infinie_interrompue() {
		BouclesFor boucle = new BouclesFor();
		
		int[] tableau = boucle.construireTableau();
		
		assertEquals(BouclesFor.MAX_SUPPORTED, tableau.length);
	}
}

package co.simplon.boucles;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BouclesForEquivalentWhileTest {

	@Test
	public void le_tableau_contient_10_elements() {
		BouclesFor boucle = new BouclesFor(1, 10);
		
		int[] tableau = boucle.construireTableauAvecWhile();
		
		assertEquals(10, tableau.length);
		assertEquals(1, tableau[0]);
		assertEquals(10, tableau[9]);
	}
	
	@Test
	public void le_tableau_contient_les_10_premiers_entiers_pairs() {
		BouclesFor boucle = new BouclesFor(1, 20);
		
		int[] tableau = boucle.construireTableauEntiersPairsAvecWhile();
		
		assertEquals(10, tableau.length);
		assertEquals(2, tableau[0]);
		assertEquals(20, tableau[9]);
	}
}

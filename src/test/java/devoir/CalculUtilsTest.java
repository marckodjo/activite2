package devoir;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class CalculUtilsTest {
	/**
	 * Test constructeur.
	 */

	  @Test
	  public void testConstructeur(){
		  CalculUtils s = CalculUtils.getMacalculutils();
		  System.out.println(s.getClass().getName());
	  }


	/**
	 * Méthode de test pour la somme.
	 */
	@Test
	public void testSomme() {
		final int valSomCompare = 5;
		final int valSomTest = 2;
		final int valSomTest1 = 3;
		assertEquals(valSomCompare, CalculUtils.somme(valSomTest, valSomTest1));
	}

	/**
	 * Méthode de test pour la division.
	 */
	@Test
	public void testDivision() {
		final int valTest = 8;
		final int valCompare = 4;
		assertEquals(valCompare, CalculUtils.division(valTest, 2));
	}

	/**
	 * Méthode de test pour la division.
	 */
	@Test
	public void testDivisionFail() {
		try {
			CalculUtils.division(2, 0);
			fail("l'exception pour la division par zero aurait d� �tre lev�e");
		} catch (IllegalArgumentException e) {
			//Rien � faire
		}
	}

	@Test
	public void testMaFonction1() {
		assertEquals(4, CalculUtils.maFonction(44, 11));
	}

	@Test
	public void testMaFonction2() {
		assertEquals(6, CalculUtils.maFonction(8, 6));
	}
}

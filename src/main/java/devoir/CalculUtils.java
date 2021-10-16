package devoir;



/**
 * @author MARCO
 *
 */
public final class CalculUtils {

	/**
	 * Constant static.
	 *
	 */
	public static final int VALCONTROLE = 10;

	/**
	 * La classe Calcul ne compte que des methodes.
	 * STATIC par consequent il s'agit
	 * d'une classe utilitaire et ne peut etre instancier.
	 *
	 */

	private CalculUtils() {	}

	/**
	 *
	 * Création d'une unique instance.
	 */
	private static final CalculUtils MaCalculUtils = new CalculUtils();

	/**
	 * @return MaCalculUtils
	 *
	 */
	public static CalculUtils getMacalculutils() {
		return MaCalculUtils;
	}

	/**
	 * Calcul la somme de deux nombres.
	 * @param valA
	 * @param valB
	 * @return valA + valB
	 *
	 */
	public static int somme(final int valA, final int valB) {
		return valA + valB;
	}

	/**
	 * @param valA
	 * @param valB
	 * @return valA / valB si b >= valControle
	 */
	public static int maFonction(final int valA, final int valB) {

		int result;
		if (valB >= VALCONTROLE) {
			result = valA / valB;
		} else {
			result = valB;
		}
		return result;
	}

	/**
	 * @param valA
	 * @param valB
	 * @return valA / valB si valB != 0
	 * @throw IllegalArgumentException si valB == 0
	 */
	public static int division(final int valA, final int valB) {
		if (valB == 0) {
			throw new IllegalArgumentException("valB ne"
					+ " doit pas etre 0");
		}
		return valA / valB;
	}
}


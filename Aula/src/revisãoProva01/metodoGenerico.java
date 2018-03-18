package revisãoProva01;

public class metodoGenerico {

	public static <G> void print(G entra[]) {
		for (G item : entra) {
			System.out.println(item + " ");
		}
		System.out.println();
	}
	
	public static <E extends Comparable<E>> E maior (E x, E y) {
		E max;
		if (x.compareTo(y) >= 0) {
			max =x;
		} else {
			max = y;
		}
		return max;
	}
}

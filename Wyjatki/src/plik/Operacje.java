package plik;

public class Operacje {
	static final int max = 10;

	void numer(int a) throws Wyjatki {

		String pokoje[] = new String[11];
		pokoje[0] = "Administracja";
		pokoje[1] = "Zajête";
		pokoje[2] = "Zajête";
		pokoje[3] = "Wolne";
		pokoje[4] = "Wolne";
		pokoje[5] = "Zajête";
		pokoje[6] = "Zajête";
		pokoje[7] = "Wolne";
		pokoje[8] = "Zajête";
		pokoje[9] = "Wolne";
		pokoje[10] = "Wolne";

		if (a > max) {
			throw new NumerPokoju("nie ma takiego pokoju");
		}
		if (a == 0) {
			throw new NumerPokoju("To jest pokój administracji");
		}
		if (pokoje[a] == "Zajête") {
			throw new ZajêtePokoje("Ten pokój jest zajêty");
		}
		System.out.println("ten pokój jest dostêpny");

	}
}

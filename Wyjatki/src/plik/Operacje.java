package plik;

public class Operacje {
	static final int max = 10;

	void numer(int a) throws Wyjatki {

		String pokoje[] = new String[11];
		pokoje[0] = "Administracja";
		pokoje[1] = "Zaj�te";
		pokoje[2] = "Zaj�te";
		pokoje[3] = "Wolne";
		pokoje[4] = "Wolne";
		pokoje[5] = "Zaj�te";
		pokoje[6] = "Zaj�te";
		pokoje[7] = "Wolne";
		pokoje[8] = "Zaj�te";
		pokoje[9] = "Wolne";
		pokoje[10] = "Wolne";

		if (a > max) {
			throw new NumerPokoju("nie ma takiego pokoju");
		}
		if (a == 0) {
			throw new NumerPokoju("To jest pok�j administracji");
		}
		if (pokoje[a] == "Zaj�te") {
			throw new Zaj�tePokoje("Ten pok�j jest zaj�ty");
		}
		System.out.println("ten pok�j jest dost�pny");

	}
}

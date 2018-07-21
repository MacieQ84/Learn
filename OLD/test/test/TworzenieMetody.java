package test;

public class TworzenieMetody {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String napis = "tereferekuku";
		System.out.println(wyswietlTekst(napis));
		metodaA();

		System.out.println("44");
		
		int cyfra = 5;
		System.out.println(mnozenie(cyfra));

	}

	//tworzenie metody zwracaj¹cej String i koniecznoœci¹ podania Stringa		
	public static String wyswietlTekst (String tekst) {
		return "Przekazany tekst: " + tekst;
	}

	//metoda wykonuj¹ca tylko S.o.p	
	public static void metodaA() {
		System.out.println("testaaa");
	}
	
	// metoda wykonujaca mnozenie
	public static int mnozenie(int cyfra) {
		int wynik = 2 * cyfra;
		return wynik;
	}


}

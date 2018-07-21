package test;

public class WyswietlanieTekstu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String napis = "terefere";
		System.out.println(pokazTekst(napis));
		System.out.println(tekst2());

	}
	
	public static  String pokazTekst(String tekst) {
		
		return "To jest ten tekst: " + tekst;
		
	}
	
	public static String tekst2() {
		
		return pokazTekst("aa");

		
	}

}

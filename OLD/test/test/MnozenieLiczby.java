package test;


public class MnozenieLiczby {

	public static void main(String[] args) {

	System.out.println(mnozenie(3));
}

public static int mnozenie (int num) {
	int liczba = 1;
	for(int liczba1 = 1; liczba1<=num; liczba1++) {
		
		liczba = liczba1 * liczba;
	}
	return liczba;
}
}

  









  

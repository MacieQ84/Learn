package test;

public class TestKonstruktorow 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int poz = 0;
		Konstruktor tworzenie = new Konstruktor(poz);
		tworzenie.pokazDzien();
		
		
		/*for(int a = 0; a <= 3; a++)
		{
			Konstruktor tworzenie = new Konstruktor(a); 	
			
		}
		*/
		
	}
}

	class Konstruktor 
	{
		private int pozycja;
		private String[] text = new String[]{"pon", "wt", "œr", "czw"};

		public Konstruktor(int pozycja)
		{
			//this.text = text;
			this.pozycja = pozycja;
		}
		
		public void pokazDzien ()
		{
			System.out.println("dzieñ " + text[pozycja]);
		}
	}


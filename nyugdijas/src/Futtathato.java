import java.util.Scanner;


public class Futtathato {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner bemeneta = new Scanner(System.in);
		 System.out.println("Kerem az alkalmazottak szamat!");
		 int meret = bemeneta.nextInt();
		 Alkalmazott alkalmazottak[] = new Alkalmazott[meret];
		 bemeneta.close();
		 
		 for (int i = 0; i < alkalmazottak.length; i++) {
			alkalmazottak[i]= new Alkalmazott("Jani"+(i+1), (int)(Math.random()*Alkalmazott.getNyugdijkorhatar())+1);
			 System.out.println(alkalmazottak[i]);
		}
		 Alkalmazott.setNyugdijkorhatar(70);
		 System.out.println("Valtoztattuk a nyugdijkorhatart");
		 for (Alkalmazott alkalmazott : alkalmazottak) {
			System.err.println(alkalmazott);
		}
	}
	
}

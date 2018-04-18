package harmadik;
import java.awt.Color;
import termekeim.Toll;
import masik.SzinesPont;
import sajat.ISzinezheto;
public class Futtathato {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ISzinezheto szinespont = new SzinesPont(Color.BLUE);
		System.out.println(szinespont);
		szinespont.setSzin(Color.GREEN);
		System.out.println(szinespont);
		Atszinezo(szinespont);
		System.out.println(szinespont);
		ISzinezheto toll = new Toll("golyostoll", 500, Color.GREEN, "marka");
		System.out.println(toll);
		toll.setSzin(Color.CYAN);
		System.out.println(toll);
		Atszinezo(toll);
		System.out.println(toll);
		
	}
	
	public static void Atszinezo(ISzinezheto objektum) {
		objektum.setSzin(objektum.alapertelmezett);
	}
	
}

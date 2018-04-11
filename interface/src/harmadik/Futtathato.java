package harmadik;
import java.awt.Color;
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
		szinespont.setAlapertelmezett(Color.GREEN);
		System.out.println(szinespont);
		Atszinezo(szinespont);
		System.out.println(szinespont);
	}
	public static void Atszinezo(ISzinezheto objektum) {
		objektum.setAlapertelmezett(objektum.alapertelmezett);
	}
	
}

package termekeim;
import java.awt.Color;
import sajat.ISzinezheto;

public class Toll extends Aru implements ISzinezheto {
	private Color szin;
	private String marka;
	
	public Toll(String nev, int ar, Color szin, String marka) {
		super(nev, ar);
		this.szin = szin;
		this.marka = marka;
	}

	@Override
	public String toString() {
		return "Toll [szin=" + szin + ", marka=" + marka + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public Color getSzin() {
		// TODO Auto-generated method stub
		return this.szin;
	}

	@Override
	public void setSzin(Color szin) {
		// TODO Auto-generated method stub
		this.szin = szin;
	}
	
	
}

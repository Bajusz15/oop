package masik;

import java.awt.Color;

import sajat.ISzinezheto;

public final class SzinesPont extends Pont implements ISzinezheto {

	private Color szin;
	
	public SzinesPont(int x, int y, Color szin) {
		super(x, y);
		this.szin = szin;
	}

	public SzinesPont(Color szin) {
		super(0,0);
		this.szin = szin;
	}

	@Override
	public Color getSzin() {
		// TODO Auto-generated method stub
		return this.alapertelmezett;
	}

	@Override
	public String toString() {
		return "SzinesPont [szin=" + szin + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public void setSzin(Color szin) {
		// TODO Auto-generated method stub
		 this.szin = alapertelmezett;
	}

}

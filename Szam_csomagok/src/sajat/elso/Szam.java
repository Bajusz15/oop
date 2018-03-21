package sajat.elso;

public class Szam {
	private static final double tures =0.001;
	private double szam;
	public Szam(double szam) {
		this.szam = szam;
	}
	public double getSzam() {
		return szam;
	}
	public void setSzam(double szam) {
		this.szam = szam;
	}
	public boolean szamTuresenBelulVanE(int szam) {
		if(this.szam-szam>0){
			return this.szam-szam<tures;
		}
		else{
			return szam-this.szam<tures;
		}
	}
}

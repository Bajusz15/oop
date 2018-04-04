package myproducts;

public class Product {
	private String nev;
	private int ar;
	private int afakulcs;
	
	public Product(String nev, int ar, int afakulcs){
		this.nev=nev;
		this.ar=ar;
		this.afakulcs=afakulcs;
	}
	public int bruttoar(){
		return  (int)this.ar*(100+afakulcs) /100;
	}
	
	public String toString() {
		return "Áru neve: " + nev + ", Bruttó ár: " + bruttoar();
	}
	public void Novel(int parameter){
		 this.ar= (int) this.ar*(100+parameter)/100;
	}
	public int dragabb_e(Product masik){
		if(this.bruttoar()>masik.bruttoar()){
			return 1;
		} else if (this.bruttoar() < masik.bruttoar()){
			return 0;
		} else {
			return -1;
		}
	}
	
}
	
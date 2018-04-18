package polinom;

import matematika.Polinom;

public class LinearisPolinom implements Polinom {
	private double a;
	private double b;
	
	public LinearisPolinom(double a, double b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public double szamol(double x) {
		//képlet: y=ax+b;
		return a* x +b;
	}

	@Override
	public int polinomFoka() {
		if(a == 0){
			return 0;
		} else {
			return 1;
		}
	}

	@Override
	public String toString() {
		if(b>0){
			return "y=" +a +"x+"  + b;
		} else {
			return "y=" +a +"x"  + b;
		}
		
	}
}

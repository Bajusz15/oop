
public class Pi {
	public static void main(String[] args) {
		//Wallis-formula
		double pi = 1;
		int darab = 1000000;
		
		for (int i = 1; i <= darab; i++) {
			pi*=2*i / (double)((2*i-1));
			pi*= 2*i / (double)((2*i+1));
		}
		System.out.println("Wallis formula: ");
		System.out.println("Pi/2 erteke: "+pi);
		System.out.println("Pi: "+ pi*2);
		
		//Leibniz féle sor
		pi = 0;
		darab *= 4;
		int elojel= 1;
		
		for (int i = 1; i <= darab; i+=2) {
			pi+=elojel* 1 / (double)i;
			elojel *= -1;
		}
		System.out.println("Leibniz féle sor:");
		System.out.println("pi/4 erteke : " +pi );
		System.out.println("pi: "+pi*4);
	}
}

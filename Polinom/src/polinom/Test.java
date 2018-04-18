package polinom;

import java.util.Iterator;
import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinearisPolinom egyenesEgyenlete = new LinearisPolinom(2, 3);
		System.out.println(egyenesEgyenlete);
		LinearisPolinom[] polinom = new LinearisPolinom[5];
		
		for (int i = 0; i < 5; i++) {
			Scanner beolvas = new Scanner(System.in);
			System.out.println("Adja meg az "+ i  +"polinom elso ertekeit!" );
			double elso = beolvas.nextDouble();
			System.out.println("Adja meg az "+ i  +"polinom masodik ertekeit!" );
			double masodik = beolvas.nextDouble();
			polinom[i] = new LinearisPolinom(elso, masodik);
			System.out.println(polinom[i].toString());
			
		}
		fuggvenytablazat(polinom[4]);
		
	}
	
	static void fuggvenytablazat(LinearisPolinom polinom){
		for (double i = 0; i <= 1; i+=0.1) {
			double ertek= polinom.szamol(i);
			System.out.println("fuggveny erteke: "+i + "-nel" +ertek);
		}
	}
}

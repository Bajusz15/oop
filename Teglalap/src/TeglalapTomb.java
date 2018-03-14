
import java.util.Random;
import java.util.Scanner;
public class TeglalapTomb {
 public static void main(String[] args) {
	 Teglalap teglalapok[] = new Teglalap[5];
	 
	 for (int i = 0; i < teglalapok.length; i++) {
		teglalapok[i] = new Teglalap((int)(Math.random()*9)+2, (int)(Math.random()*9)+2);
		System.out.println(teglalapok[i]);
	}
	 int min = 101;
	 int minindex=0;
	 for (int i = 0; i < teglalapok.length; i++) {
		if(teglalapok[i].terulet()<min) {
			min=teglalapok[i].terulet();
			minindex=i;
		}
	}
	 System.out.println("legkisebbterulet  ("+min+") indexe: "+ minindex);
	 System.out.println("Adja meg az "+"a"+" erteket");
	 Scanner bemeneta = new Scanner(System.in);
	 int a = bemeneta.nextInt();
	 Scanner bemenetb = new Scanner(System.in);
	 int b = bemenetb.nextInt();
 }
}

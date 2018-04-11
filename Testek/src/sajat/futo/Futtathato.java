package sajat.futo;
import sajat.*;
public class Futtathato {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Henger henger1 = new Henger(1, 2);
		Hasab henger2 = new Henger(3,4);
		System.out.println(henger1);
		Teglatest tegla = new Teglatest(5,6,7);
		System.out.println(tegla);
		if(henger2.nagyobbE(tegla)){
			System.out.println(henger2);
		} else{
			System.out.println(tegla);
		}
	}

}

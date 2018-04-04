package myproducts.futo;
import myproducts.*;
public class Futtathato {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product aru_objektum = new Product("aru", 20, 27);
		Kenyer kenyer_objektum = new Kenyer("kenyer", 100, 15, 0.75);
		System.out.println();
		int melyik_dragabb = aru_objektum.dragabb_e(kenyer_objektum);
		if(melyik_dragabb < 0){
			System.out.println("aru a dragabb "+aru_objektum.bruttoar());
		} else if(melyik_dragabb > 0){
			System.out.println("kenyer a dragabb "+ kenyer_objektum.bruttoar());
		} else {
			System.out.println("egyenlo az aruk");
		}
		Product referencia_obj = new Kenyer("kenyer2", 210, 15, 1);
		System.out.println("referencia objektum: "+referencia_obj);
		System.out.println(((Kenyer) referencia_obj).getMennyiseg());
	}

}


public class AlkalmazottHasznalo {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Alkalmazott alkalmazottobj = new Alkalmazott();
		 
		 /*
		  * 
		  * meg nem volt private modosito
		  * alkalmazottobj.nev = "Kiss Istvan";
		 alkalmazottobj.fizetes = 10;
		 */
		 alkalmazottobj.setNev("Kiss Istvan");
		 alkalmazottobj.setFizetes(10);
		 System.out.println(alkalmazottobj.toString());
		 System.out.println(alkalmazottobj);
		 
		 alkalmazottobj.fizetesnovelese(5);
		 
		 System.out.println(alkalmazottobj);
		 System.out.println("alkalmazott neve: "+alkalmazottobj.getNev());
		 System.out.println("alkalmazott fizetese: "+alkalmazottobj.getFizetes());
		 System.out.println(alkalmazottobj.fizetesIntervallumokKozott(10, 50));
		 System.out.println(alkalmazottobj.fizetendoAdo());
		 
		 Alkalmazott alkalmazott2 = new Alkalmazott();
		 alkalmazott2.setNev("Kiss Klaudia");
		 alkalmazott2.setFizetes(35);
		 alkalmazott2.fizetesnovelese(11);
		 
		 System.out.println(alkalmazott2);
		 System.out
			.println(alkalmazottobj.fizetesNagyobbMint(alkalmazott2));
	 System.out
			.println(alkalmazott2.fizetesNagyobbMint(alkalmazottobj));
	 
	 Alkalmazott alkalmazottak[] = new Alkalmazott[5];
	 for (int i = 0; i < alkalmazottak.length; i++) {
		alkalmazottak[i] = new Alkalmazott();
		alkalmazottak[i].setNev("xy");
		alkalmazottak[i].setFizetes((long)(Math.random()*50));
		System.out.println(alkalmazottak[i]);
	}
	 long max=alkalmazottak[0].getFizetes();
	for (int i = 1; i < alkalmazottak.length; i++) {
		if(alkalmazottak[i].getFizetes() > max){
			max=alkalmazottak[i].getFizetes();
		}
	}
	
		System.out.println("legnagyobb fizetes: "+max);
	}

}

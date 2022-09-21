
public class Main {

	public static void main(String[] args) {
		int sayiBir = 110;
		int sayiIki = 120;
		int sayiUc = 12;
		int enBuyuk = sayiBir;
		
		if(enBuyuk<sayiIki) {
			enBuyuk = sayiIki;
		}
		
		if(enBuyuk<sayiUc) {
			enBuyuk = sayiUc;
		}
		
		System.out.println("EN BÜYÜK : " + enBuyuk);
	}

}

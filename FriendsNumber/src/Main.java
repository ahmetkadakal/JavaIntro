
public class Main {

	public static void main(String[] args) {
		int sayiBir=121;
		int sayiIki=384;
		int toplamBir=0;
		int toplamIki=0;
		
		for (int i = 1; i <sayiBir; i++) {
			if(sayiBir%i==0) {
				toplamBir=toplamBir+i;
			}
		}

		for (int i = 1; i <  sayiIki; i++) {
			if( sayiIki%i==0) {
				 toplamIki= toplamIki+i;
			}
		}
		
		if (sayiBir==toplamIki && sayiIki==toplamBir ) {
			System.out.println("İki sayı arkadaştır");
		}
		else {
			System.out.println("İki sayı arkadaş değildir");
		}

	}

}


public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[] {1,2,3,6,5,4,8,9};
		int find = 5;
		boolean varmi = false;
		
		for(int number : numbers) {
			if(number == find) {
				varmi = true ;
				break;
				
			}
			
		}

		if (varmi) {
			System.out.println("Sayıyı buldum ");
		} else {
			System.out.println("Bulamadım");
		}

	}

}

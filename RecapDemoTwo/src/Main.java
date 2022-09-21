
public class Main {

	public static void main(String[] args) {
		double[] myList = {2,3.5,6.3,6,2};
		double total = 0;
		double max = myList[0];
		for (double number : myList) {
			if (max<number) {
				max = number;
			}
			total =total + number;
			System.out.println(number);
		}

		System.out.println("toplam = " + total);
		System.out.println("en büyük = " + max);
	}

}

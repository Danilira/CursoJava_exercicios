package exercicio_A8;

public class Main17 {

	public static void main(String[] args) {
		
		double price = 400.00;
		double discout;
		
		if (price < 200.00) {
			discout = price * 0.1;
		}
		else {
			discout = 0;
		}
		
		System.out.println(discout);

	}

}

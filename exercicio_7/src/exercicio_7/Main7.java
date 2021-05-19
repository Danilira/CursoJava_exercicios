package exercicio_7;

import java.util.Locale;
import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if (numero < 0) {	
			
			System.out.println("Negativo");
				
		}
		else {
			
			System.out.println("Não negativo");
		}
			
		sc.close();
	}
}
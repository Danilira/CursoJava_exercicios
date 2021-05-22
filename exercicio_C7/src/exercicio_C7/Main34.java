/**
 * 
 */
package exercicio_C7;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em Fahrenheit. 
 * Perguntar se o usuário deseja repetir (s/n). Caso o usuário digitr "s", repetir o porograma.
 * 
 * @author Dani Lira
 */
public class Main34 {

		public static void main(String[] args) {
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			char resp = 's';
			
			while (resp != 'n') {
				System.out.println("Digite a temperatura em Celsius: ");
				double C = sc.nextDouble();
				double F = 9.0 * C / 5.0 + 32.0;
				System.out.printf("Equivalente a Fahrenheit: %.1f%n", F);
				System.out.println("Deseja repetir (s/n)? ");
				resp = sc.next().charAt(0);
				
			}
			
			sc.close();
	}

}

package exercicio_5;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Quantas horas?");
		hora = sc.nextInt();
		
		if (hora < 12) {
		
		System.out.println("Bom dia");
		
		}
		else {
		
		System.out.println("Boa tarde");
			}
		sc.close();
	}
}
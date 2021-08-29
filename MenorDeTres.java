package curso_programacao;

import java.util.Scanner;

public class MenorDeTres {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite tres numeros inteiros: ");
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		int numero3 = scan.nextInt();
		
		if (numero1>numero2 && numero1 > numero3) {
			System.out.println("O maior numero é: "+ numero1);
		}else if (numero2 > numero3) {
			System.out.println("O maior numero é: "+numero2);
		}else if (numero1 == numero2) {
			System.out.println("Empate, o maior numero é "+numero1);
		}else if (numero1==numero3) {
			System.out.println("Empate, o maior numero é "+numero1);
		}else if (numero2==numero3) {
			System.out.println("Empate, o maior numero é "+numero3);	
		}else {
			System.out.println("O maior numero é "+numero3);
		}

	}

}

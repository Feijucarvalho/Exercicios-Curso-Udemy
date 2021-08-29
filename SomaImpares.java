package curso_programacao;

import java.util.Scanner;

public class SomaImpares {

	public static void main(String[] args) {
		/*
		Leia dois valores X e Y inteiros ( em qualquer ordem ). A seguir 
		calcule e mostre a soma dos numeros impares entre eles.
		 */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Didite dois números inteiros");
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		
		int soma = 0;
		
		if (numero2 < numero1) {
			int x = numero1;
			numero1 = numero2;
			numero2 = x;
		}
		
		for (int i=numero1+1 ; i < numero2 ; i++) {
			    if (i%2 != 0 ) {
			    	soma = soma + (i);
			    	System.out.println(i);
		    }
		}    
		
		
		System.out.println();
		System.out.println("A soma dos numeros impares entre os dois é de: "+soma);
		
	}

}

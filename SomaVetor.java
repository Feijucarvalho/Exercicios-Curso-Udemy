package curso_programacao;

import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		
		/* Faca um programa que leia N numeros reais e armazene-os em um vetor.
		 Em seguida imprima-os e mostre na tela a soma e a media dos elementos
		 do vetor
		 */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos Numeros voce vai digitar");
		int x = scan.nextInt();
		
		double [] vetor = new double[x];
		
		System.out.println("Digite os " + x + " numeros!");
		
		double soma = 0;
		for (int i=0 ; i < vetor.length ; i++) {
			vetor[i] = scan.nextDouble();
			soma = soma + vetor[i];
		}
		
		for (int i=0 ; i<vetor.length ; i++) {
			System.out.println("Vetor na posicao ["+i+"] = "+vetor[i]);
		}
		
		double media = soma/x;
		
		System.out.println();
		System.out.println(" A soma foi de "+soma+" e a media foi de "+media+".");
		
	}

}

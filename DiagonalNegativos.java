package curso_programacao;

import java.util.Scanner;

public class DiagonalNegativos {

	public static void main(String[] args) {
		
		/* fazer um programa para ler um numero inteiro N ( maximo = 10) e uma 
		 matriz quadrada de ordem N contendo numeros inteiros. Em seguida mostrar 
		 a diagonal principal e a quantidade de valores negativos da matriz.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da matriz quadrada de 1 a 10");
		int x = scan.nextInt();
		
		int [][] matriz = new int [x][x];
		
		for (int i=0 ; i < x ; i++) {
			for (int j=0 ; j < x ; j++) {
				System.out.println("Elemento ["+i+","+j+"]:");
				matriz [i][j] = scan.nextInt();
			}
		}
		
		int count = 0;
		for (int i=0 ; i < x ; i++) {
			for (int j=0 ; j < x ; j++) {
				if(matriz[i][j]<=0) {
					count = count+1;
				}
			}
		}
		
		for (int i=0 ; i < x ; i++) {
			for (int j=0 ; j < x ; j++) {
				if (i == j) {
					System.out.println(matriz[i][j]);
				}
			}
		}
		
		System.out.println("A quantidade de numeros negativos é de: "+count);
		
	}

}

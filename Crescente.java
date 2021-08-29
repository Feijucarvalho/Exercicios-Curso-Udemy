package curso_programacao;

import java.util.Scanner;

public class Crescente {

	public static void main(String[] args) {
	
	/* Leia uma quantidade inderteminadas de duplas de valores inteiros	
	X e Y. Escreva para X e Y uma mensagem que indique que estes valores 
	foram digitados em ordem crescente ou decrescente. O programa deve
	finalizar quando o operador digitar dois valores iguais
	 */

		Scanner scan = new Scanner(System.in);
		
		int x = 1;
		int y = 0;
		
		while (x!=y) {
		System.out.println("Digite dois valores");
		x = scan.nextInt();
		y = scan.nextInt();
			if (x<y) {
				System.out.println("Digitou na ordem crescente.");
			}else {
				System.out.println("Digitou na ordem decrescente. ");
			}
		}
	}

}

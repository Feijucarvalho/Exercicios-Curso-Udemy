package curso_programacao;

import java.util.Scanner;

public class ExercicioIdades {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome da primira pessoa: ");
		String nome1 = scan.nextLine();
		System.out.println("Digite a idade da primeira pessoa: ");
		int idade1 = scan.nextInt();
		System.out.println("Digite o nome da segunda pessoa: ");
		scan.nextLine();
		String nome2 = scan.nextLine();
		System.out.println("Digite a idade da segunda pessoa: ");
		int idade2 = scan.nextInt();
		
		int media = (idade1 + idade2)/2;
		
		System.out.println("Nome: "+nome1);
		System.out.println("Idade: "+idade1);
		System.out.println("Nome: "+nome2);
		System.out.println("idade: "+idade2);
		System.out.println("A idade media entre "+nome1+" e "+nome2+" é de "+media);
		
		
		
		
		

	}

}

package curso_programacao;

import java.util.Scanner;

public class ExercicioRetangulo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor da base do retangulo:");
		double base = scan.nextDouble();
		System.out.println("Digite o valor da altura ");
		double altura = scan.nextDouble();
		
		double area = base*altura;
		double perimetro = (2*base) + (2*altura);
		double diagonal = Math.sqrt(Math.pow(base, 2)+Math.pow(altura,2));

		System.out.println(area);
		System.out.println(perimetro);
		System.out.println(diagonal);
	}

}

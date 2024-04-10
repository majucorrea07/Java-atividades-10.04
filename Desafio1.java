package estruturaCondicional;
import java.util.Scanner;
public class Desafio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double nota1,nota2,nota3,nota4,soma, resultado;

		System.out.println("Digite a primeira nota:");
		nota1 = ler.nextInt();

		System.out.println("Digite a segunda nota nota:");
		nota2 = ler.nextInt();

		System.out.println("Digite a terceira nota:");
		nota3 = ler.nextInt();

		System.out.println("Digite a quarta nota:");
		nota4 = ler.nextInt();

		soma = nota1 + nota2 + nota3 + nota4;
		resultado = soma / 4;

		if (resultado >= 6) {
			System.out.println("Parabéns você foi aprovado, sua média é: " + resultado);

		}

	}
}




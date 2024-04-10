package estruturaCondicional;

import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num;
		
		System.out.println("Infome o numero do dia da semana: ");
		num = ler.nextInt();
		
		if (num == 1) {
			System.out.println("O dia da semana é domingo");
		}
		if (num == 2) {
			System.out.println("O dia da semana é Segunda-Feira");
		}
		if (num == 3) {
			System.out.println("O dia da semana é Terça-Feira");
		}
		if (num == 4) {
			System.out.println("O dia da semana é Quarta-Feira");
		}
		if (num == 5) {
			System.out.println("O dia da semana é Quinta-Feira");
		}
		if (num == 6) {
			System.out.println("O dia da semana é Sexta-Feira");
		}
		if (num == 7) {
			System.out.println("O dia da semana é Sábado");
			}
		else if(num >7){
			System.out.println("Dia da semana incorreto");
		}
		else if(num <1){
			System.out.println("Dia da semana incorreto");
		}
	}

}

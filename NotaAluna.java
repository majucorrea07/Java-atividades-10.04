package estruturaCondicional;
import java.util.Scanner;
public class NotaAluna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner ler = new Scanner(System.in);
	double nota1,nota2,nota3,nota4,media;
	
	System.out.println("Digite a primeira nota:");
	nota1 = ler.nextDouble();

	System.out.println("Digite a segunda nota nota:");
	nota2 = ler.nextDouble();

	System.out.println("Digite a terceira nota:");
	nota3 = ler.nextDouble();

	System.out.println("Digite a quarta nota:");
	nota4 = ler.nextDouble();

	media = (nota1+nota2+nota3+nota4)/4;
	
	String mensagem = media >=6 ? "Você está aprovado! Sua média é: " + media : "Você está reprovado! Sua média é: " + media;
	System.out.println(mensagem); // imprime "Você está aprovado! Sua média é: "
	
	}

}

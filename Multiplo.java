package estruturaCondicional;
import java.util.Scanner; 
public class Multiplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    double a;
    Scanner ler = new Scanner(System.in);
	System.out.println("Informe um numero: ");
	a = ler.nextDouble();
	
	String mensagem = a % 5 == 0 ? "O numero: " + a + "é multiplo de 5" : "O numero: " + a + " não é multiplo de 5";
	System.out.println(mensagem);
	
	
	}

}

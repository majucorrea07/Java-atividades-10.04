package estruturaCondicional;
import java.util.Scanner;
public class Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    double anos;
    Scanner ler = new Scanner(System.in);
   	System.out.println("Informe quantos anos você está na empresa: ");
	anos = ler.nextDouble();
	
	if (anos >3) {
		System.out.println("Você deverá receber 7% de bonus");
	}
	else {
	System.out.println("Você deverá receber 5% de bonus");
	
	}
	
	}

}

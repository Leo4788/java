package acerto;
import java.util.Scanner;
import java.util.Random;
public class jogo {

	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int tentativas = 10;
		int numeroSecreto =  random.nextInt(50);
		boolean acertou = false;
		long chute = 0;
		
		while(tentativas >0&& acertou == false);
		System.out.println("digite um numero");
		chute = scan.nextLong();
		
		if(chute<numeroSecreto) {
			--tentativas;
			System.out.println("numero muito grande");
			
			if (numeroSecreto == chute) {
				System.out.println("acertou");
				acertou = true;
			}
		}
	}
}

package exercicio01;
import java.util.Scanner;

class somaint {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
			System.out.println("Soma de dois numeros");
			int num1 = scan.nextInt(), num2 = scan.nextInt(), soma = num1 + num2;
			System.out.println("SOMA: "+soma);
		scan.close();	
		}

	
}

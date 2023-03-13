package lista;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		int n1,n2;
		Scanner input = new Scanner(System.in);
		System.out.println("escreva dois numeros: ");
		n1 = input.nextInt();
		n2 = input.nextInt();
		System.out.println(n1 +" multiplicado por " + n2 + " é igual a " + (n1*n2));
		input.close();
	}
	
}

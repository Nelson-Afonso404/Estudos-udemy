package lista;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		//atividade de nivelação de estrutura de dados
		int n1,n2;
		Scanner input = new Scanner(System.in);
		System.out.println("escreva dois numeros: ");
		n1 = input.nextInt();
		n2 = input.nextInt();
		if(n1>n2) {
			System.out.println(n1 + " é o maior");
		}else if(n2>n1) {
			System.out.println(n2 + " é o maior");
		}else {
			System.out.println("são iguais");
		}
	input.close();
	}
}

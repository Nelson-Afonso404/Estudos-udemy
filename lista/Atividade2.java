package lista;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		//atividade de nivelação de estrutura de dados
		int n1,n2;
		Scanner input = new Scanner(System.in);
		System.out.println("escreva dois numeros: ");
		n1 = input.nextInt();
		n2 = input.nextInt();
		if(n1==n2){
			System.out.println("são iguais");
		}else {
			System.out.println("são diferentes");
		}
		if(n1>n2) {
			System.out.println(n1 + " é o maior");
			System.out.println(n2 + " é menor");
		}
		if(n2>n1) {
			System.out.println(n2 + " é o maior");
			System.out.println(n1 + " é menor");
		}
		
	input.close();
	}
}

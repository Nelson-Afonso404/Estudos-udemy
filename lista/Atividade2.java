package lista;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		//atividade de nivela��o de estrutura de dados
		int n1,n2;
		Scanner input = new Scanner(System.in);
		System.out.println("escreva dois numeros: ");
		n1 = input.nextInt();
		n2 = input.nextInt();
		if(n1==n2){
			System.out.println("s�o iguais");
		}else {
			System.out.println("s�o diferentes");
		}
		if(n1>n2) {
			System.out.println(n1 + " � o maior");
			System.out.println(n2 + " � menor");
		}
		if(n2>n1) {
			System.out.println(n2 + " � o maior");
			System.out.println(n1 + " � menor");
		}
		
	input.close();
	}
}

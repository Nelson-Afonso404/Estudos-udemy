package lista;

import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {
		/* Escrever um programa que leia o nome de um aluno e as
		 *  notas das três provas que ele obteve no semestre. No 
		 *  final informar o nome do aluno e a sua média (aritmética).
		 *  MEDIA = nota1 + nota2 + nota3/3 *///scanner
		Scanner input = new Scanner(System.in);
				
		//variaveis
		double nota1, nota2, nota3, media;
				
		//coletando informações
		System.out.println("Digite sua nota1, nota2, nota3");
		nota1 = input.nextDouble();
		nota2 = input.nextDouble();
		nota3 = input.nextDouble();
				
		//onde a coisa acontece
				
		media =(nota1+nota2+nota3)/3;
		
		System.out.printf(" sua media é: %.2f %n", ( media));
		input.close();
		
	}
	
}

package lista;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		/*Crie uma classe que receba como entrada o nome, a altura e 
		 *o sexo da pessoa. Faça o cálculo do peso ideal obedecendo a
		 * seguinte fórmula: para homens = (72.7*h) – 58
		 * e para mulheres = (62.1 *h) - 44.7.*/
		//scanner
		Scanner input = new Scanner(System.in);
				
		//variaveis
		String nome;
		int sexo;
		double homem, mulher;
				
		//coletando informações
		System.out.println("qual seu nome? ");
		nome = input.next();
		System.out.println("qual seu sexo?"
				+ "\n (1) homem"
				+ "\n (2) mulher");
		
		sexo = input.nextInt();
		System.out.println("qual a sua altura");
		double altura = input.nextDouble();
				
		//onde a coisa acontece
				
		homem = (72.7 * altura) - 58.0;
		mulher = (62.1 * altura) - 44.7;
		
		switch (sexo) {
		case 1: {
			System.out.println(nome + ", seu peso ideal é: " + homem);
			break;
		}
		case 2: {
			System.out.println(nome + ", seu peso ideal é: " + mulher);
			break;
		}
		default:
			System.out.println("algo deu errado");
		}
		input.close();
	}

}

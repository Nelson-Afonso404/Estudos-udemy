package lista;

import java.util.Scanner;

public class Atividade5 {
	/*Crie uma classe em java para calcular o estoque médio de um produto. O estoque
	médio é calculado pela fórmula: estoque médio = (quantidade mínima + quantidade
	máxima)/2. Deverá ser solicitado ao usuário o nome do produto, a quantidade mínima
	e a quantidade máxima do produto.*/
	public static void main(String[] args) {
		
		//scanner
		Scanner input = new Scanner(System.in);
		
		//variaveis
		String nome_produto;
		int quantidade_min, quantidade_max;
		double estoque_medio;
		
		//coletando informações
		System.out.println("escolha o nome do produto: ");
		nome_produto = input.next();
		System.out.println("qual a quantidade minima do produto?");
		quantidade_min = input.nextInt();
		System.out.println("qual a quantidade maxima do produto?");
		quantidade_max = input.nextInt();
		
		//onde a coisa acontece
		
		estoque_medio = (quantidade_min + quantidade_max)/2;
		System.out.println("o estoque medio de " + nome_produto + " é " + estoque_medio);
		input.close();
	}

}

package lista;

import java.util.Scanner;

public class Atividade5 {
	/*Crie uma classe em java para calcular o estoque m�dio de um produto. O estoque
	m�dio � calculado pela f�rmula: estoque m�dio = (quantidade m�nima + quantidade
	m�xima)/2. Dever� ser solicitado ao usu�rio o nome do produto, a quantidade m�nima
	e a quantidade m�xima do produto.*/
	public static void main(String[] args) {
		
		//scanner
		Scanner input = new Scanner(System.in);
		
		//variaveis
		String nome_produto;
		int quantidade_min, quantidade_max;
		double estoque_medio;
		
		//coletando informa��es
		System.out.println("escolha o nome do produto: ");
		nome_produto = input.next();
		System.out.println("qual a quantidade minima do produto?");
		quantidade_min = input.nextInt();
		System.out.println("qual a quantidade maxima do produto?");
		quantidade_max = input.nextInt();
		
		//onde a coisa acontece
		
		estoque_medio = (quantidade_min + quantidade_max)/2;
		System.out.println("o estoque medio de " + nome_produto + " � " + estoque_medio);
		input.close();
	}

}

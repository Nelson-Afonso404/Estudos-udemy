package udemy;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Product product = new Product();
		System.out.println("escreva as informações: ");
		System.out.println("nome: ");
		product.nome = input.nextLine();
		System.out.println("preço: ");
		product.preco = input.nextDouble();
		System.out.println("quantidade: ");
		product.qtd = input.nextInt();
		System.out.println(product.nome);
		System.out.println(product);
		System.out.println("quanto vai adicionar ao estoque");
		product.add(input.nextInt());
		System.out.println(product);
		System.out.println("quanto vai remover ao estoque");
		product.remove(input.nextInt());
		System.out.println(product);
		input.close();
	}

}

package udemy;

import java.util.Scanner;

public class TestaListaEncadeada {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		TestaListaEncadeada testaListaEncadeada = new TestaListaEncadeada();
		ListaEncadeada listaEncadeada = new ListaEncadeada();
		testaListaEncadeada.addCantor(listaEncadeada);

	}
	public void addCantor(ListaEncadeada listaEncadeada) {
		int escolha = 0;
		int i=1;
		do {
			
			
			System.out.println("(1) Adicionar Cantor"
					+ "\n(2) Remover cantor"
					+ "\n(3) Mostrar lista"
					+ "\n(4) Sair");
			escolha = scan.nextInt();
			switch (escolha) {
			case 1: {
				System.out.println("Digite o nome do cantor: ");
				String nome = scan.next();
				/*sobrenome
				if (scan.hasNext()) {
					nome += " " + scan.next();
				}*/
				System.out.println("Digite o nome da cidade: ");
				String cidade = scan.next();

				Cantor cantor = new Cantor(i, nome, cidade);
				listaEncadeada.adicionar(cantor);
				i++;
				break;
			}
			case 2: {
				removerCantor(listaEncadeada);
				System.out.println("Contato removido com sucesso!!!");
				break;
			}
			case 3: {
				mostrarLista(listaEncadeada);
				break;
			}
			case 4: {
				System.out.println("Saindo do programa...");
				break;
			}
			default: {
				System.out.println("Opção inválida!");
				break;
			}
			}
		} while (escolha != 4);
	}

	public void mostrarLista(ListaEncadeada listaEncadeada) {
		System.out.println("Repare como ficou a sua lista");
		while (listaEncadeada.temProximo()) {
			System.out.println("--------------------------------------");
			System.out.println("id: "+ listaEncadeada.getPosicaoAtual().getValor().getId()+" | Nome: "+ listaEncadeada.getPosicaoAtual().getValor().getNome()+ " | Cidade: "+ listaEncadeada.getPosicaoAtual().getValor().getCidade());
		}System.out.println("--------------------------------------");
	}
	public void removerCantor (ListaEncadeada listaEncadeada) {
		listaEncadeada.remover();
	}

}

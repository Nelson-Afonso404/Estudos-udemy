package udemy;

public class ListaEncadeada {
	private Celula primeiro;
	private Celula ultimo;
	private Celula posicaoAtual;

	//Aqui temos o método de adição 
	public void adicionar(Cantor valor) {
		//instanciar uma nova celula
		Celula celula = new Celula();
		celula.setValor(valor);
		//Como esta a minha lista? Não sei prof...
		if (primeiro == null && ultimo == null) {
			primeiro = celula;
			ultimo = celula;
		} else {
			ultimo.setProximo(celula);
			ultimo = celula;
		}
		
	}
	
	//vamos fazer o método excluir? .
	public void remover() {
		if(primeiro.getProximo() != null) {
			Celula celula = this.recuperarPenultimo(primeiro);
			ultimo = celula;
			celula.setProximo(null);
		}else {
			primeiro = ultimo = null;
		}
	}
	
	
	
	public Celula getPosicaoAtual() {
		return posicaoAtual;
	}

	public void setPosicaoAtual(Celula posicaoAtual) {
		this.posicaoAtual = posicaoAtual;
	}

	//vamos recuperar o penultimo 
	private  Celula recuperarPenultimo(Celula celula) {
		if (celula.getProximo().equals(ultimo)) {
			return celula;
		}
		return recuperarPenultimo(celula.getProximo());
	}
	
	public boolean temProximo() {
		if (primeiro == null) {
			return false;
		} else if(posicaoAtual == null) {
			posicaoAtual = primeiro;
			return true;
		}else {
			boolean temProximo = posicaoAtual.getProximo() != null ?true: false;
		/*	if (posicaoAtual.getProximo() != null) {
				return true;
			} else {
				return false;
			}*/
			posicaoAtual = posicaoAtual.getProximo();
			return temProximo;
		}
	}

}

package udemy;

public class Celula {
	private Cantor valor;
	private Celula proximo;
	public Cantor getValor() {
		return valor;
	}
	public void setValor(Cantor valor) {
		this.valor = valor;
	}
	public Celula getProximo() {
		return proximo;
	}
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
}

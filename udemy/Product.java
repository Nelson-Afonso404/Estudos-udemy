package udemy;


public class Product {
	
	String nome;
	double preco;
	int qtd;
	
	public double valorTotal() {
		return preco*qtd;
	}
	public void add(int qtd) {
		this.qtd += qtd;
		
	}
	public void remove(int qtd) {
		this.qtd -= qtd;
		
	}
	public String toString(){
		return nome + ", $ " +
	String.format("%.2f", preco) + ", " + qtd + " unidades," + "total: $" + String.format("%.2f", valorTotal());
	}
}

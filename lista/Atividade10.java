package lista;

public class Atividade10 {

	public static void main(String[] args) {
		//Fa�a um programa que exiba os n�meros primos de 1 at� 50.        for (int i = 2; i <= 50; i++) {
		for (int i = 2; i <= 50; i++) {
			boolean ehPrimo = true;
	        for (int j = 2; j < i; j++) {
	            if (i % j == 0) {
	                ehPrimo = false;
	                break;
	            }
	        }
	        if (ehPrimo) {
	            System.out.print(i + " ");
	        }
		}

	}

}

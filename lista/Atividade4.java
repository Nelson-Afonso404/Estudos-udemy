package lista;

import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {
		int n1,n2;
		char op;
		Scanner input = new Scanner(System.in);
		System.out.println("escolha dois numeros: ");
		n1 = input.nextInt();
		n2 = input.nextInt();
		
		System.out.println("escolha a operação:"
				+ "\n (1)Soma"
				+ "\n (2)Multiplicação"
				+ "\n (3)Subtração"
				+ "\n (4)Divisão");
		op = input.next().charAt(0);
		switch(op) {
		case '1': 
			System.out.println(n1+n2);
			break;
		
		case '2': 
			System.out.println(n1*n2);
			break;
		case '3': 
			System.out.println(n1-n2);
			break;
		case '4': 
			System.out.println(n1/n2);
			break;
		}
		input.close();
	}
}

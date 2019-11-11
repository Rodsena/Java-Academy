package metodos;

public class Calculadora {
	
	public int somar(int  a, int b) {
		return a + b;
	}
	
	public int subtrair(int a, int b) {
		return a - b;
	}
	public int multiplicar(int a, int b) {
		return a * b;
	}

	public int divisao(int a, int b) {
		return a / b;
	}

	public int calcular(int a, int b, int c, int d, int e) {
		return a + b + c + d + e;
	}
	
	public int calcular(int...lista) {
		int soma = 0;
		for (int item : lista) {
		soma += item;
		}
		return soma;
		}

	
	
}

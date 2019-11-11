package cap6lab;

public class Cap6lab2 {
	
	public static void main(String[] args) {
		
			Calculadora calculadora = new Calculadora();
			
			double v1 = calculadora.subtrair(6.2, 3.9);
			double v2 = calculadora.subtrair(6, 2.1);
			double v3 = calculadora.subtrair(6.4, 3);
			calculadora.subtrair(6, 3);
			
			System.out.println("Métodos subtrair sobrecarregados:");
			System.out.printf("Chamando a versão de subtrair com 2 double: %.2f",v1);
			System.out.printf("\nChamando a versão de subtrair com 1 int e 1 double: %.2f",v2);
			System.out.printf("\nChamando a versão de subtrair com 1 double e 1 int: %.2f",v3);
	}
}

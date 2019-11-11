package cap5lab;

public class Cap5lab1 {
	
	public static void main(String[] args) {
	
		Funcionario f1 = new Funcionario();
		
		f1.nome = "Alberto";
		f1.sobrenome = "Roberto";
		f1.cargo = "ator";
		f1.salario = 1000;
		
		System.out.println("Nome: "+f1.nome + "\nSobrenome: " + f1.sobrenome +"\nCargo: "+ f1.cargo +"\nSalario: " + f1.salario);
		
		
	}
}

package cap9lab;

public class Cap9lab1 {
		
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Professor("Rafael", 38, 'M', 2614535, "05/02/1974", 2500.00f, "Portugues" );
		Pessoa p2 = new Aluno("Manuel", 19, 'M', 521367736, "15/06/1993", 1099.00f, "Ciência da Computação");
		Pessoa p3 = new Aluno("Claudia", 22, 'F', 41567383, "12/08/1990", 799.00f, "Administração");
		
		p1.falar("Manuel?");
		p2.falar("Presente");
		p1.falar("Claudia?");
		p3.falar("Presente");
		
		p1.mostrarDados();
		p2.mostrarDados();
		p2.mostrarDados();
		
	}
}

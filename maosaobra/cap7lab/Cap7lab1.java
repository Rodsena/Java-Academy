package cap7lab;

public class Cap7lab1 {
	
	public static void main(String[] args) {
		Cadastro cad1 = new Cadastro();
		Cadastro cad2 = new Cadastro("Rodrigo","Sena");
		Cadastro cad3 = new Cadastro("Rodrigo","Sena", 33);
		
		
		cad1.mostrar();
		cad2.mostrar();
		cad3.mostrar();
	}
}

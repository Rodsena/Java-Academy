package orientacao;

public class UsarCarro {

		public static void main(String[] args) {
		
			Carro c1 = new Carro ();
			
			c1.ano = 1990;
			c1.chassi = "ASHAHS76335";
			c1.placa = "DFF-5261";
			
			c1.motorista = new Pessoa();
			c1.motorista.nome = "Pedro";
			
			c1.passageiros = new Pessoa[4];
			
			Pessoa p1 = new Pessoa();
		
			p1.nome = "Joao";
			p1.setIdade(30);
			p1.carro = c1;
			
			System.out.println(p1.carro.motorista.nome);
			
		}
}

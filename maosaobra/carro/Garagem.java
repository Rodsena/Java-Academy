package carro;

public class Garagem {
	
	Carro carroPasseio = new Carro();
	Carro carroUtilitario;
	
	public static void main(String[] args) {
		
		Garagem g = new Garagem();
		
		g.carroPasseio.modelo = "Honda-Civic";
		g.carroPasseio.cor = "Preto";
		g.carroPasseio.potencia = 2000;
		
		g.carroUtilitario = new Carro();
		g.carroUtilitario.modelo = "Polo";
		g.carroUtilitario.cor = "Branco";
		g.carroUtilitario.potencia = 1000;
		
		System.out.println("Carrro Passeio \nModelo: "+g.carroPasseio.modelo+"\nCor: "+g.carroPasseio.cor+"\nPotência: "+g.carroPasseio.potencia
						 + "\n-----------------------------------------------------------------------------------"
						 + "\nCarro Utilitário \nModelo: "+g.carroUtilitario.modelo+"\nCor: "+g.carroUtilitario.cor+"\nPotência: "+g.carroUtilitario.potencia);
		
	}
}

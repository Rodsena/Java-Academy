package desafio.combustivel;



public class Combustivel {

	private double etanol;
	private double gasolina;
	
	
		public double getEtanol() {
		return etanol;
	}


	public void setEtanol(double etanol) {
		this.etanol = etanol;
	}


	public double getGasolina() {
		return gasolina;
	}


	public void setGasolina(double gasolina) {
		this.gasolina = gasolina;
	}


		public boolean calculaCombustivel(double a, double b ) {
			if(a / b < 0.7) {
				
				return true; 
			} else {
				return false;
			}
				
			
		}
		
}

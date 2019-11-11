package cap9lab;

public class Rg {
	//ATRIBUTOS
	private int numero;
	private String dataNasc;
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	Rg(int numero, String data) {
		this.numero = numero;
		this.dataNasc = data;
	}
}

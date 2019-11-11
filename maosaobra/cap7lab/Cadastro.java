package cap7lab;

import javax.swing.JOptionPane;

public class Cadastro {
	// ATRIBUTOS
	
	private String nome;
	private String sobrenome;
	private int idade;
	
	// METODOS ACESSORES
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	// CRIANDO CONSTRUTORES
	
	Cadastro(){
		
	}
	
	Cadastro(String nome, String sobrenome){
		
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	Cadastro(String nome, String sobrenome, int idade){
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}
	
	public void mostrar() {
		
		JOptionPane.showMessageDialog(null, nome + " " + sobrenome + " " + idade);
	}
}

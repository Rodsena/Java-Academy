package cap9lab;

public class Aluno extends Pessoa {
	
	private float mensalidade;
	private String curso;
	
	public float getMensalidade() {
		return mensalidade;
	}
	
	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Aluno(String nome, int idade, char sexo, int numeroRg, String dataNasc, float mensalidade, String curso) {
		
		Rg rg1 = new Rg(numeroRg, dataNasc);
		
		super.setNome(nome);
		super.setIdade(idade);
		super.setSexo(sexo);
		super.setRg(rg1);
		
		this.mensalidade = mensalidade;
		this.curso = curso;
	}
	
	@Override
	public void falar(String fala) {
		System.out.println(getNome() + ":  " + fala);

	 }
	
	@Override
	public void mostrarDados() {
	
		System.out.println("\n--- Aluno: " + getNome() + " ---"
		+ "\nIdade: " + getIdade() + "\nSexo: " + getSexo()
		+ "\nMensalidade: " + getMensalidade() + "\nCurso: " + getCurso()
		+ "\nNúmero RG: " + getRg().getNumero() + "\nData de Nascimento: " + getRg().getDataNasc() + ".\n");
	
		
	}
	
	
}

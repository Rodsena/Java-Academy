package cap9lab;

public class Professor extends Pessoa{
	
	
	private float salario;
	private String disciplina;
	
	public float getSalario() {
		return salario;
	}
	
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public String getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public Professor(String nome, int idade, char sexo, int numeroRg, String dataNasc, float salario, String disciplina) {
		
			Rg rg1 = new Rg(numeroRg, dataNasc);
		
			super.setNome(nome);
			super.setIdade(idade);
			super.setSexo(sexo);
			super.setRg(rg1);
			
			this.salario = salario;
			this.disciplina = disciplina;
	}
	
	@Override
	public void falar(String fala) {
		
		System.out.println(getNome() + ": " + fala);
	}
	
	@Override
	public void mostrarDados() {

		System.out.println("\n--- Professor: " + getNome() + " ---"
		+ "\nIdade: " + getIdade() + "\nSexo: " + getSexo()
		+ "\nSalario: " + getSalario() + "\nDisciplina: " + getDisciplina()
		+ "\nNúmero RG: " + getRg().getNumero() + "\nData de Nascimento: " + getRg().getDataNasc() + ".\n");
	}
}

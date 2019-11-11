package desafio.maternidade;

public class RegistroDeNascimento {
	
		//ATRIBUTOS
		private String nome;
		private String nomeMae;
		private String sexo;
		private int mesesGestacao;
		private boolean uti;
		
		//CONSTRUTORES

		public RegistroDeNascimento() {
			
			this.mesesGestacao = 9;
			this.uti = false;
		}
		
		public RegistroDeNascimento(String nome, String nomeMae, String sexo) {
		
			this.nome = nome;
			this.nomeMae = nomeMae;
			this.sexo = sexo;
			this.mesesGestacao = 9;
			this.uti = false;
		}
		
		//METODOS ACESSESORES
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getNomeMae() {
			return nomeMae;
		}
		public void setNomeMae(String nomeMae) {
			this.nomeMae = nomeMae;
		}
		public String getSexo() {
			return sexo;
		}
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		public int getMesesGestacao() {
			return mesesGestacao;
		}
		public void setMesesGestacao(int mesesGestacao) {
			this.mesesGestacao = mesesGestacao;
		}
		public boolean isUti() {
			return uti;
		}
		public void setUti(boolean uti) {
			this.uti = uti;
		}

		
		
		
}

package cap6lab;

public class Cap6lab3 {
	
	public static void main(String[] args) {
		
		Aluno joao = new Aluno();
		Aluno maria = new Aluno();
		Aluno marcos = new Aluno();
		
		joao.setNome("João");
		maria.setNome("Maria");
		marcos.setNome("Marcos");
		
		 
		joao.contadorDeAlunos++;
		joao.imprimeAluno();
		
		
		maria.contadorDeAlunos++;
		maria.imprimeAluno();
		
		
		marcos.contadorDeAlunos++;
		marcos.imprimeAluno();
		
		System.out.println("Contador acessando diretamente da classe: " + Aluno.contadorDeAlunos);
	}
}

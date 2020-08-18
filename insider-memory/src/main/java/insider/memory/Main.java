package insider.memory;

public class Main {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.nome =  "Rafael Lucio";
		a1.nota = 9.6;
		
		
		Aluno a2 = criarAluno("Rodrigo Maxwell ", 8.6);
		diminuirNota(a2);
		
		
		a2 = new Aluno();
		a2.nome = "Israel Lucio";
		a2.nota = 10
				
				;
	}
	
	static Aluno criarAluno(String nome, double nota) {
		Aluno a = new Aluno();
		a.nome = nome;
		a.nota = nota;
		return a;
	}

	 static void diminuirNota(Aluno a) {
		a.nota--;
	}
}

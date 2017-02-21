class Turma{
	/*int aluno1;
	int aluno2;
	int aluno3;*/
	
	Aluno[] alunos;
	
	void imprimeNotas(){
		for(int i = 0; i < this.alunos.length; i++){
			if(this.alunos[i] == null) continue;
			System.out.println(this.alunos[i].nota);
		}
	}
}

class Aluno {
	String nome;
	double nota;
}

class TesteDaTurma{
	public static void main(String[] args){
		/*notas[0] = 9;
		notas[1] = 5;*/
		Turma j1 = new Turma();
		j1.alunos = new Aluno[10];
		j1.alunos[0] = new Aluno();
		j1.alunos[0].nome = "Daiane";
		j1.alunos[0].nota = 10;
		
		j1.imprimeNotas();
	}
}

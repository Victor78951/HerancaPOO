public class TesteHeranca1 {
	public static void main(String[] args) {
		AlunoDeGraduacao aluno = new AlunoDeGraduacao();
		aluno.nome = "João";
		aluno.idade = 1;
System.out.printf(
		"Nome: %s, idade: %d\n",
		aluno.nome,
		aluno.idade
	);
	}
}
package revisãoProva01;

public class Aluno implements Comparable<Aluno> {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	private int matricula;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}

	public int compareTo(Aluno a) {
		return this.nome.compareTo(a.getNome());
	}

	public String toString() {
		return this.matricula + " " + this.nome;
	}

}

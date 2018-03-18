package coleções;

public class Aluno {
	private int id;
	private String nome;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Aluno(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	public int compareTo( Aluno a) {
		if(this.id < a.id) {
		return -1;
		} else if (this.id == a.id) {
			return 0;
		} else {
			return 1;
		}
		//return this.nome.compareTo(a.getNome());
	}
}

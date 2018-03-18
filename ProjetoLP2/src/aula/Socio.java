package aula;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Socio {
	//Define a PK e AU
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	//Variaveis
	private String nome;
	private String telefone;
	//garda datas
	@Temporal(TemporalType.DATE)
	private Calendar dataNascimento;
	
	//GET - SET
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	//Construct
	public Socio() {
		super();
	}
	public Socio(String nome, String telefone, Calendar dataNascimento) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
	}
	
	
	
	
}

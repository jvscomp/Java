package exercicioInterface;

public class Pessoa {
	//Variaveis -Nome, Idade, Altura, Peso e Sexo
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	private char sexo;
	//GET - SET
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	//Construtores
	public Pessoa() {
		super();
	}
	public Pessoa(String nome, int idade, double altura, double peso, char sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;
	}
	//IMC
	public void imc(double p, double a) {
		double imc = p/a;
		if (imc <= 18.5){
				System.out.println("abaixo do peso");
		}
		else if (imc > 18.5 && imc <= 25){
				System.out.println("peso normal");
		}
		else if (imc > 25 && imc <= 30){
				System.out.println("acima do peso");
		}
		else
			System.out.println("obesidade");
	}
	
}

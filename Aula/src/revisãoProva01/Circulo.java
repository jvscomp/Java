package revisãoProva01;

public class Circulo extends FormaGeometrica{
	private double raio;
	//GET - SET
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = (raio < 0) ? 0 : raio;
	}
	//Conscrutor
	public Circulo(double raio) {
		setRaio(raio);
	}
	//Abstrata
	@Override
	public void imprime() {
		System.out.println("Dados do Circulo:");
		super.imprime();
		System.out.println("Raio: " + this.raio);
		System.out.println("Area: " + area());
	}
	@Override
	public double area() {
		
		return Math.PI*Math.pow(raio, 2);
	}
	
	public static void main(String[] args) {
		FormaGeometrica circulo = new Circulo(2);
		circulo.imprime();
		FormaGeometrica retangulo = new Retangulo(3,5);
		retangulo.imprime();
		FormaGeometrica triangulo = new Triangulo(3,6);
		triangulo.imprime();
	}

}

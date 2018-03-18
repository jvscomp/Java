package revisãoProva01;

public class Retangulo extends FormaGeometrica{
	private int base, altura;
	//GET - SET
	public int getBase () {
		return base;
	}
	public void setBase( int base) {
		this.base=(base < 0) ? 0 : base;
	}
	
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = (altura < 0) ? 0 : altura;
	}
	//Construtor
	public Retangulo() {}
	public Retangulo(int base, int altura) {
		this.setAltura(altura);
		this.base = base;
	}
	//Métodos
	
	//FormaGeometrica
	@Override
	public void imprime() {
		System.out.println("Dados do Triangulo:");
		super.imprime();
		System.out.println("Base: " + this.base);
		System.out.println("Altura: " + this.altura);
		System.out.println("Area: " + area());
	}
	@Override
	public double area() {
		return base*altura;
	}

}

package revisãoProva01;

public class Triangulo extends FormaGeometrica{
	private double base, altura;
	//GET - SET
	public void setBase(double base) {
		this.base = (base < 0) ? 0 : base;
	}
	public double getBase() {
		return base;
	}
	
	public void setAltura(double altura) {
		this.altura = (altura < 0) ? 0 : altura;
	}
	public double getAltura() {
		return altura;
	}
	//Construct
	public Triangulo() {}
	public Triangulo(double base, double altura) {
		setBase(base);
		setAltura(altura);
	}
	//FormaGeométrica
	@Override
	public void imprime() {
		System.out.println("Dados do Triangulo:");
		super.imprime();
		System.out.println("Base: " + base);
		System.out.println("Altura: " + altura);
		System.out.println("Area: " + area());
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (base*altura)/2;
	}
}

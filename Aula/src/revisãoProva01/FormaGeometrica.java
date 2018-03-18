package revisãoProva01;

public abstract class FormaGeometrica {
	private int lados;
	//Set - Get
	public void setLados (int lados) {
		this.lados = (lados < 0) ? 0 :lados;
	}
	public int getLados () {
		return lados;
	}
	//Consctructor
	public FormaGeometrica() {}
	public FormaGeometrica (int lados) {
		setLados(lados);
	}
	//Metodos adicionais
	public void imprime() {
		System.out.println("Numero de lados: " + this.lados);
	}
	public abstract double area();
}

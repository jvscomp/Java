package revisãoProva01;

public class CLasseGenerica <T>{

	private T primeiro;
	private T segundo;
	//GET - SET
	public T getPrimeiro() {
		return primeiro;
	}
	public void setPrimeiro(T primeiro) {
		this.primeiro = primeiro;
	}
	
	public T getSegundo() {
		return segundo;
	}
	public void setSegundo(T segundo) {
		this.segundo = segundo;
	}
	
	
	
	public CLasseGenerica (T primeiro, T segundo) {
		this.primeiro = primeiro;
		this.segundo = segundo;
	}
	
	public String toString() {
		return "(" + this.getPrimeiro() + ", " + this.getSegundo() + ")";
	}
}

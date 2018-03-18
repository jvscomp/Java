package revisãoProva01;

public class Cliente extends Pessoa {
	private int codigo;

	public Cliente(String nome, String cpf, int codigo) {
		super(nome, cpf);
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Codigo" + this.codigo);
	}
	
}

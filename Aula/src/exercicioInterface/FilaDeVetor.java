package exercicioInterface;

public class FilaDeVetor implements Fila{
	private int tamanho;
	private int vet[];
	//GET - SET
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public int[] getVet() {
		return vet;
	}
	public void setVet(int[] vet) {
		this.vet = vet;
	}
	//Interface
	@Override
	public void add(Fila a) {
		// TODO Auto-generated method stub		
	}
	@Override
	public Fila remove() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Fila get(int index, int i) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Boolean isEmpty() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String ToString() {
		// TODO Auto-generated method stub
		return null;
	}

}

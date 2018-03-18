package revisãoProva01;

public class ContaPoupanca implements Conta{
	private double saldo;

	@Override
	public void deposita(double dinheiro) {
		this.saldo += dinheiro;
		
	}

	@Override
	public void saca(double saque) {
		if (saldo > 0 && saldo >= saque) {
			this.saldo -= saque;
		}
		System.out.println("Transação inválida!");
	}

	@Override
	public double getSaldo() {
		return saldo;
	}
	

}

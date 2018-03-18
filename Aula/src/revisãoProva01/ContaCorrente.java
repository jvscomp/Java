package revisãoProva01;

public class ContaCorrente implements Conta{
	private double saldo;
	private double taxaPorOperacao = 10;
	//GET - SET :: taxaPorOperacao
	public double getTaxaPorOperacao() {return taxaPorOperacao;};
	public void setTaxaPorOperacao(double entra) {this.taxaPorOperacao = entra;};
	//Interface Conta
	@Override
	public void deposita(double dinheiro) {
		if (dinheiro > taxaPorOperacao) {
			saldo = saldo + dinheiro - taxaPorOperacao;
		} else {
			System.out.println("Transação inválida!");
		}
		
	}
	@Override
	public void saca(double saque) {
		if (saque > taxaPorOperacao) {
			saldo = saldo - saque - taxaPorOperacao;
		} else {
			System.out.println("Transação inválida!");
		}
		
	}
	@Override
	public double getSaldo() {
		return saldo;
	}
	
	public static void main(String[] args) {
		Conta c1 = new ContaCorrente();
		c1.deposita(1000);
		System.out.println(c1.getSaldo());
		Conta c2 = new ContaPoupanca();
		c2.deposita(100);
		System.out.println(c2.getSaldo());
	}
}

package modelo;

public class ContaCorrente extends Conta {

	public ContaCorrente(int conta, double saldo) {
		super(conta, saldo);
	}

	public boolean saca(double valor) {
		if (getSaldo() >= valor) {
			return super.saca(valor);
		}
		return false;

	}

}

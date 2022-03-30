package modelo;

public class ContaEspecial extends Conta {
	private double limite;

	public ContaEspecial(int conta, double saldo, double limite) {
		super(conta, saldo);
		if (limite < 0)
			return;
		this.limite = limite;
	}

	public boolean saca(double valor) {
		if ((getSaldo() + limite) >= valor) {
			return super.saca(valor);
		}
		return false;

	}

}

package modelo;

public abstract class Conta {
	private int conta;
	private double saldo;

	public Conta(int conta, double saldo) {
		if (conta < 1 || saldo < 0) {
			return;
		}
		this.conta = conta;
		this.saldo = saldo;
	}

	public boolean deposita(double valor) {
		if (valor < 0) {
			return false;
		}
		this.saldo += valor;
		return true;
	}

	public boolean saca(double valor) {
		if (valor < 0) {
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}

	}

	public int getConta() {
		return conta;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return conta + " - " + saldo;
	}
}
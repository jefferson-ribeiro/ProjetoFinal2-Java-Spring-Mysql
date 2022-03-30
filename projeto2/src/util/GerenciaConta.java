package util;

import java.util.ArrayList;

import modelo.Conta;

public class GerenciaConta {
	private ArrayList<Conta> contas;

	public GerenciaConta() {
		contas = new ArrayList<>();
	}

	public void adicionar(Conta c) {
		contas.add(c);
	}

	public String exibir(int conta) {
		for (int cont = 0; cont < contas.size(); cont++) {
			if (contas.get(cont).getConta() == conta) {
				return contas.get(cont).toString();
			}
		}
		return "Não encontrado";
	}

	private int posicao(int conta) {
		for (int cont = 0; cont < contas.size(); cont++) {
			if (contas.get(cont).getConta() == conta) {
				return cont;
			}
		}
		return -1;
	}

	public boolean remover(int conta) {
		int posicao = posicao(conta);
		if (posicao >= 0) {
			if (contas.remove(posicao) != null) {
				return true;
			}
		}
		return false;
	}

	public boolean deposita(int conta, double valor) {
		for (int cont = 0; cont < contas.size(); cont++) {
			if (contas.get(cont).getConta() == conta) {
				return contas.get(cont).deposita(valor);
			}
		}
		return false;
	}

	public boolean saca(int conta, double valor) {
		for (int cont = 0; cont < contas.size(); cont++) {
			if (contas.get(cont).getConta() == conta) {
				return contas.get(cont).saca(valor);
			}
		}
		return false;
	}

}
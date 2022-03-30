package principal;

import java.util.Scanner;

import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaEspecial;
import util.GerenciaConta;

public class AppContas {

	public static void main(String[] args) {
		// instanciar uma variavel para atribuir o que for digitado no teclado
		Scanner teclado = new Scanner(System.in);

		// inicializar a variavel para atribuir as opções
		int opcao = 0;

		// Declaração de variaveis
		// String nome;
		int numero;
		double saldo, limite, valor;

		// Instanciar o contrutor GerenciaConta o qual foi atribuida a lista
		GerenciaConta contas = new GerenciaConta();

		// instanciar um model de conta
		Conta c;

		while (opcao != 7) {
			System.out.println("---------Cadastro de Contas---------");
			System.out.println("1-Nova Conta Corrente");
			System.out.println("2-Nova Conta Especial");
			System.out.println("3-Sacar");
			System.out.println("4-Depositar");
			System.out.println("5-Procurar");
			System.out.println("6-Apagar");
			System.out.println("7-Sair");
			System.out.print("Sua opção: ");
			opcao = teclado.nextInt();
			System.out.println("-------------------------------------");

			switch (opcao) {
			case 1:
				System.out.println("-----Cadastro de Conta Corrente-----");
				// System.out.println("Digite o nome do correntista: ");
				// nome = teclado.next();
				System.out.println("Digite o número da conta: ");
				numero = teclado.nextInt();
				System.out.println("Digite o valor do saldo da conta: ");
				saldo = teclado.nextDouble();
				System.out.println("-------------------------------------");

				// Criando uma nova conta
				c = new ContaCorrente(numero, saldo);

				// adicionando a nova conta na lista
				contas.adicionar(c);
				break;
			case 2:
				System.out.println("-----Cadastro de Conta Especial-----");
				// System.out.println("Digite o nome do correntista: ");
				// nome = teclado.next();
				System.out.println("Digite o número da conta: ");
				numero = teclado.nextInt();
				System.out.println("Digite o valor do saldo da conta: ");
				saldo = teclado.nextDouble();
				System.out.println("Digite o valor do limite da conta: ");
				limite = teclado.nextDouble();
				System.out.println("-------------------------------------");

				// Criando uma nova conta especial
				c = new ContaEspecial(numero, saldo, limite);

				// adicionando a nova conta especial na lista
				contas.adicionar(c);
				break;
			case 3:
				System.out.println("Digite o valor a ser sacado:");
				valor = teclado.nextDouble();
				System.out.println("Digite a conta a ser debitada:");
				numero = teclado.nextInt();
				contas.saca(numero, valor);
				break;
			case 4:
				System.out.println("Digite o valor a ser depositado:");
				valor = teclado.nextDouble();
				System.out.println("Digite a conta a ser creditada:");
				numero = teclado.nextInt();
				contas.deposita(numero, valor);
				break;
			case 5:
				System.out.println("Digite o número da conta para procurar:");
				numero = teclado.nextInt();
				System.out.println(contas.exibir(numero));
				break;
			case 6:
				System.out.println("Digite a conta a ser removida:");
				numero = teclado.nextInt();
				boolean removeu = contas.remover(numero);
				if (removeu) {
					System.out.println("Conta removida com sucesso");
				} else {
					System.out.println("Não foi possível remover a conta");
				}
				break;
			case 7:
				System.out.println("Fim do programa.");
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
		}
		teclado.close();
	}

}

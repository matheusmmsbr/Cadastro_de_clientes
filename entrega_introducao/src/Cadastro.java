

import javax.swing.JOptionPane;

public class Cadastro {

	static Cliente clientes[] = null;
	static String lista;
	static int confirma = -1;
	static int j = 0;
	@SuppressWarnings("unused")
	private static int total;

	public static void main(String[] args) {

		String op = "";
		int opcao = -1;

		do {

			op = JOptionPane.showInputDialog("SISTEMA PETSHOP - v1.0:\n\n"
					+ "1 ~> Cadastrar Clientes.\n"
					+ "2 ~> Consultar Clientes.\n"
					+ "5 ~> Sair.\n\n");

			if (op == null) {

				op = "0";

			}

			opcao = Integer.parseInt(op);

			if (opcao == 1) {

				CadastrarCliente();

			} else if (opcao == 2) {

				ConsultarCliente();

			} else if (opcao == 5 || opcao == 0) {

				Sair();

			} else {

				JOptionPane.showMessageDialog(null, "Opção Inválida!!!");

			}

		} while (confirma != 0);

	}

	private static void Sair() {
		confirma = JOptionPane.showConfirmDialog(null,
				"Quer mesmo Sair do Programa?");	
		if (confirma == 0) {
			System.exit(0);
		}
		else {
			main(null);
		}
	}

	public static void CadastrarCliente() 
	{

		int QuantClient;

		String Quant = JOptionPane
				.showInputDialog("- CADASTRAR CLIENTE:\n\nQuantos Clientes Deseja Cadastrar: ");

		if (Quant == null)
		{

			Quant = "0";

		}

		QuantClient = Integer.parseInt(Quant);

		clientes = new Cliente[QuantClient];

		for (int i = 0; i < clientes.length; i++) 
		{

			clientes[i] = new Cliente();

		}

		for (int i = 0; i < QuantClient; i++) 
		{

			clientes[i]
					.setNome(JOptionPane
							.showInputDialog("- CADASTRAR CLIENTE:\n\nDigite o Nome do Cliente: ("
									+ (i + 1) + "/" + QuantClient + ")"));

		}

		JOptionPane.showMessageDialog(null, "Clientes Cadastrados!");
	}
	

	public static void ConsultarCliente() {

		if (clientes == null) {

			JOptionPane
					.showMessageDialog(null,
							"- CONSULTAR CLIENTE:\n\nVocê precisa cadastrar pelo menos 1 Cliente!\n\n");

		} else {

			total = 1;
			lista = "";

			for (int i = 0; i < clientes.length; i++) {

				lista += "Cliente " + (i + 1) + "\n";
				lista += "Nome: " + clientes[i].getNome() + "\n";
				lista += "\n\n";
				total++;
				

			}
			
			JOptionPane
			.showMessageDialog(null,
					"- CLIENTES:\n\n"+ lista + "\n\n");
		}
		}}

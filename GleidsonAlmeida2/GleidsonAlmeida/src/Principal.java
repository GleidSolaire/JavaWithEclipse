import java.util.ArrayList;
import java.util.Collections;

/**
 * Classe principal da aplicação.
 * 
 * @author 1829799
 *
 */
public class Principal {

	static ArrayList<Empresa> empresas = new ArrayList<>();

	/**
	 * Executa o método da main.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String[] opcoes = { "Empresas", "Notas Fiscais", "Relatórios" };
		boolean continua = true;
		do {
			int opcao = Console.mostrarMenu(opcoes, "Sistema de Notas", null);
			switch (opcao) {

			case 1:
				menuEmpresa();
				break;

			case 2:
				menuNotaFiscal();
				break;

			case 3:
				menuRelatorios();
				break;

			case -1:
				System.out.println("Saindo do Sistema...");
				continua = false;
				break;

			}
		} while (continua);
	}

	/**
	 * Executa o menu de empresa.
	 */
	private static void menuEmpresa() {

		String[] opcoesMenuEmpresas = { "Cadastrar", "Consultar", "Excluir" };
		boolean continua = true;
		do {
			int opcaoMenuEmpresas = Console.mostrarMenu(opcoesMenuEmpresas, "Empresas", "Voltar");
			switch (opcaoMenuEmpresas) {

			case 1:
				criarEmpresa();
				break;

			case 2:
				consultaDeEmpresas();
				break;

			case 3:
				excluirEmpresa();
				break;

			case -1:
				System.out.println("Saindo do Sistema...");
				continua = false;
				break;

			}
		} while (continua);
	}

	/**
	 * Exclui uma empresa.
	 */
	private static void excluirEmpresa() {
		String cnpj = Console.recuperaTexto("Informe o CNPJ: ");
		int index = encontrarIndexEmpresa(cnpj);

		if (index >= 0) {
			String confirmacao = Console.recuperaTexto("Deseja excluir essa empresa? Sim(S) Não(N): ");
			if (confirmacao.equalsIgnoreCase("s")) {
				empresas.remove(index);
				System.out.println("Empresa Excluida!");
			} else {
				System.out.println("Exclusão cancelada...");
				System.out.println();
			}
		} else {
			System.out.println("CNPJ não encontrado...");
		}
	}

	/**
	 * Realiza a consulta e retorno de uma empresa, para o menu de empresas.
	 */
	private static void consultaDeEmpresas() {
		try {
			String cnpj = Console.recuperaTexto("Informe o CNPJ da empresa: ");
			System.out.println(pegarEmpresa(cnpj));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Executa o menu de notas fiscais.
	 */
	private static void menuNotaFiscal() {

		String[] opcoes = { "Emitir", "Consultar", "Cancelar" };
		boolean continua = true;
		do {
			int opcao = Console.mostrarMenu(opcoes, "Notas Fiscais", "Voltar");
			switch (opcao) {

			case 1:
				emitirNotas();
				break;

			case 2:
				consultarNotas();
				break;

			case 3:
				cancelarNotas();
				break;
			case -1:
				System.out.println("Voltando ao Menu Principal...");
				continua = false;
				break;
			}
		} while (continua);
	}

	/**
	 * Executa o menu de relatórios.
	 */
	private static void menuRelatorios() {

		String[] opcoes = { "Por Empresas", "Notas Canceladas", "Por Valor" };
		boolean continua = true;
		do {
			int opcao = Console.mostrarMenu(opcoes, "Relatórios", "Voltar");
			switch (opcao) {

			case 1:
				gerarRelatorioPorEmpresa();
				break;

			case 2:
				gerarRelatorioNotasCanceladas();
				break;

			case 3:
				gerarRelatorioPorValorDaNota();
				break;

			case -1:
				System.out.println("Voltando ao Menu Principal...");
				continua = false;
				break;

			}
		} while (continua);
	}

	/**
	 * Gera relatórios de notas ordenadas por valor. 
	 */
	private static void gerarRelatorioPorValorDaNota() {
		
		String cnpj = Console.recuperaTexto("Informe o CNPJ da empresa: ");
		try {
			ArrayList<NotaFiscal> notas = new ArrayList<>();
			notas = pegarEmpresa(cnpj).GetNotasFiscaisValidas();
			Collections.sort(notas, new ComparaValorNota());	
			System.out.println(notas);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Gera relatórios de notas canceladas por empresa.
	 */
	private static void gerarRelatorioNotasCanceladas() {
		String cnpj = Console.recuperaTexto("Informe o CNPJ da empresa: ");
		try {
			System.out.println(pegarEmpresa(cnpj).GetNotasFiscaisCanceladas());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Gera relatórios de notas válidas por empresa.
	 */
	private static void gerarRelatorioPorEmpresa() {

		String cnpj = Console.recuperaTexto("Informe o CNPJ da empresa: ");
		try {
			System.out.println(pegarEmpresa(cnpj).GetNotasFiscaisValidas());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Cancela a nota fiscal da empresa desejada.
	 */
	private static void cancelarNotas() {
		try {
			String cnpj = Console.recuperaTexto("Informe o CNPJ da empresa: ");
			System.out.println(pegarEmpresa(cnpj).getNotasFiscais());
			String numeroNota = Console.recuperaTexto("Informe o número da nota: ");
			ArrayList<NotaFiscal> notas = pegarEmpresa(cnpj).getNotasFiscais();

			for (NotaFiscal nota : notas) {
				if (numeroNota.equalsIgnoreCase(nota.getNumero())) {
					nota.setCancelada(true);
					System.out.println("Nota cancelada...");
				} else {
					System.out.println("Nota não encontrada...");
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	
	

	/**
	 * Consulta a nota fiscal da empresa desejada.
	 */
	private static void consultarNotas() {
		try {
			String cnpj = Console.recuperaTexto("Informe o CNPJ da empresa: ");
			Empresa empresaSolicitada = pegarEmpresa(cnpj);
			String numeroNota = Console.recuperaTexto("Informe o número da nota: ");
			ArrayList<NotaFiscal> notas = empresaSolicitada.getNotasFiscais();

			for (NotaFiscal nota : notas) {
				if (numeroNota.equalsIgnoreCase(nota.getNumero())) {
					System.out.println(nota);
				} else {
					System.out.println("Nota não encontrada...");
				}

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Emite uma nota fiscal (Add no Arraylist notasFiscais do objeto empresa).
	 */
	private static void emitirNotas() {
		try {
			String cnpj = Console.recuperaTexto("Informe o CNPJ da empresa: ");
			Empresa empresaSolicitada = pegarEmpresa(cnpj);
			empresaSolicitada.addNotaFiscal(criarNota());
			System.out.println("Nota Emitida...\n");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Cria uma Nota Fiscal.
	 * 
	 * @return Nota Fiscal.
	 */
	private static NotaFiscal criarNota() {

		String numero = Console.recuperaTexto("Informe o número da nota: ");
		String descricao = Console.recuperaTexto("Informe o motivo da nota: ");
		Double valor = Console.recuperaDecimal("Informe o valor da nota: ");
		Imposto imposto = null;
		boolean continua = true;

		do {
			int opcao = Console
					.recuperaInteiroPositivo("Escolha o Estado:\n1) Paraná\n2) Santa Catarina\n3) São Paulo\n 4) Amapa ");
			switch (opcao) {

			case 1:
				imposto = new ImpostoParana(valor);
				continua = false;
				break;

			case 2:
				imposto = new ImpostoSantaCatarina(valor);
				continua = false;
				break;

			case 3:
				imposto = new ImpostoSaoPaulo(valor);
				continua = false;
				break;
				
			case 4:
				imposto = new ImpostoAmapa(valor);
				continua = false;
				break;
				
				
				
			default:
				System.out.println("Número informado não corresponde a um Estado...\n");

			}

		} while (continua);

		NotaFiscal nota = new NotaFiscal(numero, descricao, imposto, valor);
		return nota;
	}

	/**
	 * Encontra uma empresa pelo cnpj, e retorna a empresa.
	 * 
	 * @return A empresa buscada.
	 * @throws Exception
	 */
	public static Empresa pegarEmpresa(String cnpj) throws Exception {

		if (encontrarIndexEmpresa(cnpj) == -1) {
			throw new Exception("CNPJ não encontrado...");
		} else {
			return empresas.get(encontrarIndexEmpresa(cnpj));
		}
	}

	/**
	 * Localiza uma empresa no ArrayList empresas, e retorna seu index.
	 * 
	 * @param cnpj Parâmetro de busca.
	 * @return Um inteiro com o index da empresa buscada.
	 */
	private static int encontrarIndexEmpresa(String cnpj) {

		int i = -1;
		for (Empresa empresa : empresas) {
			i++;
			if (cnpj.equalsIgnoreCase(empresa.getCnpj())) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Cria uma empresa.
	 */
	private static void criarEmpresa() {

		String nome = Console.recuperaTexto("Digite o nome da empresa");
		String cnpj = Console.recuperaTexto("Digite o CNPJ da empresa");

		int index = encontrarIndexEmpresa(cnpj);

		if (index == -1) {
			Empresa empresa = new Empresa(nome, cnpj);
			empresas.add(empresa);
			System.out.println("Empresa adicionada!");
			System.out.println();
		}
	}
}
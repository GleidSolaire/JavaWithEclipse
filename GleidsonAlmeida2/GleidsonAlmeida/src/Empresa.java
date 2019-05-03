import java.util.ArrayList;

/**
 * @author 1829203
 *
 */
public class Empresa {

	private String nome;
	
	private String cnpj;
	
	private ArrayList<NotaFiscal> notasFiscais = new ArrayList<>();
	
	public Empresa(String nome, String cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public ArrayList<NotaFiscal> getNotasFiscais() {
		return notasFiscais;
	}

	public void addNotaFiscal(NotaFiscal notaFiscal) {
		this.notasFiscais.add(notaFiscal);
	}
	
	public ArrayList<NotaFiscal> GetNotasFiscaisValidas(){
		ArrayList<NotaFiscal> notasFiscaisValidas = new ArrayList<>();
		
		for (NotaFiscal nota : notasFiscais) {

			if (nota.isCancelada() == false) {
				notasFiscaisValidas.add(nota);
			}
		}
		return  notasFiscaisValidas;
	}
	public ArrayList<NotaFiscal> GetNotasFiscaisCanceladas(){
		ArrayList<NotaFiscal> notasFiscaisCanceladas = new ArrayList<>();
		for (NotaFiscal nota : notasFiscais) {

			if (nota.isCancelada() == true) {
				notasFiscaisCanceladas.add(nota);
			}
		}
		return  notasFiscaisCanceladas;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + "\nCnpj: " + cnpj + "\n" + notasFiscais ;
	}
	
}
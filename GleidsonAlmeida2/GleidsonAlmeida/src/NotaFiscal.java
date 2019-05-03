import java.util.Comparator;
import java.util.Date;

/**
 * @author 1829203
 *
 */
public class NotaFiscal {

	private String numero;
	private String descricao;
	private Date dataEmissao;
	private Imposto imposto;
	private Double valor;
	private Double valorComImposto;
	private boolean cancelada;
	
	public NotaFiscal(String numero, String descricao, Imposto imposto, Double valor) {
		this.numero = numero;
		this.descricao = descricao;
		this.dataEmissao = new Date();
		this.imposto = imposto;
		this.valor = valor;
		this.cancelada = false;
		this.valorComImposto = this.valor + imposto.calcularImpostoTotal();
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getValorComImposto() {
		return valorComImposto;
	}

	public void setValorComImposto(Double valorComImposto) {
		this.valorComImposto = valorComImposto;
	}

	public boolean isCancelada() {
		return cancelada;
	}

	public void setCancelada(boolean cancelada) {
		this.cancelada = cancelada;
	}

	@Override
	public String toString() {
		return "Nota Fiscal\n\nNúmero: " + numero + "\nDescrição: " + descricao + "\nData Emissão: " + dataEmissao + "\nValor: " + valor + "\nValor com Imposto: " + valorComImposto + "\n";
	}
	
}
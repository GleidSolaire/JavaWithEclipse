/**
 * @author 1829799
 *
 */
public class ImpostoSaoPaulo extends Imposto {

	static Double aliquotaEstadual = 0.18;
	
	public ImpostoSaoPaulo(Double valor) {
		super(valor);
	}

	@Override
	public Double calcularImpostoEstadual() {
		return valor * aliquotaEstadual;
	}
	
}
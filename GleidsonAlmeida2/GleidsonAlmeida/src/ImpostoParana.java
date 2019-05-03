/**
 * @author 1829799
 *
 */
public class ImpostoParana extends Imposto {

	static Double aliquotaEstadual = 0.05;
	
	public ImpostoParana(Double valor) {
		super(valor);
	}

	@Override
	public Double calcularImpostoEstadual() {
		return valor * aliquotaEstadual;
	}

}
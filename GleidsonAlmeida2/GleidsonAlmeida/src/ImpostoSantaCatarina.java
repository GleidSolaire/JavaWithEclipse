/**
 * @author 1829799
 *
 */
public class ImpostoSantaCatarina extends Imposto {

	static Double aliquotaEstadual = 0.1;
	
	public ImpostoSantaCatarina(Double valor) {
		super(valor);
	}

	@Override
	public Double calcularImpostoEstadual() {
		return valor * aliquotaEstadual;
	}

}
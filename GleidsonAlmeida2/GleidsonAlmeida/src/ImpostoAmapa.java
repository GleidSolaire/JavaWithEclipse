
public class ImpostoAmapa extends Imposto {

	
	static Double aliquotaEstadual = 0.215;

	public ImpostoAmapa(Double valor) {
		super(valor);
		
	}

	@Override
	public Double calcularImpostoEstadual() {
	return valor*aliquotaEstadual;
		
	}
	
	
	
	
}

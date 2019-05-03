import java.util.Comparator;

/**
 * @author 1829799
 *
 */
public class ComparaValorNota implements Comparator<NotaFiscal> {

	@Override
	public int compare(NotaFiscal o1, NotaFiscal o2) {
		return o1.getValorComImposto().compareTo(o2.getValorComImposto());
	}

}
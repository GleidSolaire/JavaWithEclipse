package PacoteCalendario;

import java.util.ArrayList;

public class Calendario {

	public static boolean CalculaBinario(int ano) {

		if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
			return true;
		} else {
			return false;

		}

	}

	
	public static ArrayList<Integer> CriarMes (int mes, int ano) {

		int quantidadeDias=31;

		if (mes == 4 || mes ==6 || mes==9 || mes==11) {
			
			mes=30;
			
			
		}if (mes==2) {
			
			boolean eBissexto = CalculaBinario(ano);
			
			if (eBissexto) {
				quantidadeDias=29;
			}else {
				quantidadeDias=28;
			}
			
		}

		ArrayList<Integer> diaDoMes = new ArrayList <> ();
		
		for (int i = 0; i < quantidadeDias; i++) {
			diaDoMes.add(i);
					
		}
		
		return diaDoMes;
		
		}
	
	
	
	
	
	
	
}

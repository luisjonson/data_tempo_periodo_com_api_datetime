package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AfterBefore {
	
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date dataVencimentoBoleto = simpleDateFormat.parse("10/04/2021");
		Date dateAthalHoje = simpleDateFormat.parse("07/04/2021");
		
		if(dataVencimentoBoleto.after(dateAthalHoje)) {
			System.out.println("Boleto não vencido");
		}else {
			System.out.println("Boleto vencido - URGENTE");
		}
		
		if(dataVencimentoBoleto.before(dateAthalHoje)) {
			System.out.println("Boleto vencido - URGENTE");
		}else {
			System.out.println("Boleto não vencido");
		}
		
	}

}

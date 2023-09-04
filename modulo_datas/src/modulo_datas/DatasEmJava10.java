package modulo_datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasEmJava10 {
	public static void main(String[] args) throws ParseException, InterruptedException {
		
		LocalDate dataBase = LocalDate.parse("2019-10-05");
		
		System.out.println("Mais cinco dias " + (dataBase.plusDays(5)));
		System.out.println("Mais cinco semanas " + (dataBase.plusWeeks(5)));
		System.out.println("Mais cinco anos " + (dataBase.plusYears(5)));
		System.out.println("Mais cinco meses " + (dataBase.plusMonths(5)));
		System.out.println("Menos um ano " + (dataBase.minusYears(1)));
		System.out.println("Menos um mes " + (dataBase.minusMonths(1)));
		System.out.println("Menos uma semana " + (dataBase.minusWeeks(1)));
		System.out.println("Menos um dia " + (dataBase.minusDays(1)));
		
		
		for(int mes = 1; mes <=12; mes++) {
			dataBase.plusMonths(1);
			System.out.println("Data do vencimento do boleto " +
			dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " do mês " +
			mes);
			
		}
		
		
	}

}

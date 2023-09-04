package modulo_datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasEmJava6 {
	public static void main(String[] args) throws ParseException {
		
		//Nova API de data a partir do java 8
		
		LocalDate dataAtual = LocalDate.now();
		System.out.println("Data Atual: " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("Dia da semana: " + dataAtual.getDayOfWeek().name());
		
		System.out.println("Dia do mes: " + dataAtual.getDayOfMonth());
		
		System.out.println("Dia do ano: " + dataAtual.getDayOfYear());
		
		System.out.println("Mes: " + dataAtual.getMonthValue());
		System.out.println("Mes: " + dataAtual.getMonth());
		
		System.out.println("Ano: " + dataAtual.getYear());
		
	}

}

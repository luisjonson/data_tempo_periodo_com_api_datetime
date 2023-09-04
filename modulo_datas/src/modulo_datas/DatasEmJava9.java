package modulo_datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;

public class DatasEmJava9 {
	public static void main(String[] args) throws ParseException, InterruptedException {
		
		LocalDate dataAntiga = LocalDate.parse("2019-10-05");
		
		LocalDate dataNova = LocalDate.of(2021, 2, 7);
		
		System.out.println("Data antiga é maior que data nova: " + dataAntiga.isAfter(dataNova));
		System.out.println("Data antiga é anterior a nova: " + dataAntiga.isBefore(dataNova));
		System.out.println("Data são iguais: " + dataAntiga.isEqual(dataNova));
		
		Period perido = Period.between(dataAntiga, dataNova);
		System.out.println("Quantos anos " + perido.getYears());
		System.out.println("Quantos meses " + perido.getMonths());
		System.out.println("Total de  meses " + perido.toTotalMonths());
		System.out.println("Quantos dias " + perido.getDays());
	}

}

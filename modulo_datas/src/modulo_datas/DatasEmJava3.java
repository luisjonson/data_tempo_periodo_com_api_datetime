package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DatasEmJava3 {
	public static void main(String[] args) throws ParseException {
		
		Calendar calendar =  Calendar.getInstance();// pegar a data atual
		// simular que data vem do banco de dados
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2021"));//define uma data qualquer
		calendar.add(Calendar.DAY_OF_WEEK, 5);
		System.out.println("Somando o dia do mês " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		// trabalhando em mes 
		calendar.add(Calendar.MONTH, 1);
		System.out.println("Somando o mês " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		// trabalhando com o Ano 
		calendar.add(Calendar.YEAR, 2);
		System.out.println("Somando o Ano " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
	}

}

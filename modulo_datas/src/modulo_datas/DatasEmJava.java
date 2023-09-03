package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class DatasEmJava {
	public static void main(String[] args) throws ParseException {
		Calendar calendar = Calendar.getInstance();
		
		Date date = new Date();
		
		System.out.println("Data em milisegundo " + date.getTime());
		System.out.println("Data em milisegundo " + calendar.getTimeInMillis());
		
		System.out.println("Dia do mes " + date.getDate());
		System.out.println("Calendar Dia do mes " + calendar.DAY_OF_MONTH);
		System.out.println("Dia da semana " + date.getDay());
		System.out.println("Calendar Dia da semana " + (calendar.get(Calendar.DAY_OF_WEEK) - 1));
		System.out.println("Hora do dia " + date.getHours());
		System.out.println("Calendar Hora do dia " + calendar.get((Calendar.HOUR)));
		System.out.println("Minuto  da hora " + date.getMinutes());
		System.out.println("Calendar minuto da hora " + calendar.get(Calendar.MINUTE));
		System.out.println("Segundo da hora " + date.getSeconds());
		System.out.println("Calendar segundo da hora " + calendar.get(Calendar.SECOND));
		System.out.println("Ano " + (date.getYear() + 1900));
		System.out.println("Calendar ano " + calendar.get(Calendar.YEAR));
		
//		----------------------symple Date Format------------------------------
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		
		System.out.println("Data atual formato padrão String " + simpleDateFormat.format(date));
		
		System.out.println("Calendar Data atual formato padrão String " + simpleDateFormat.format(calendar.getTime()));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.SS");
		
		System.out.println("Data em formato para banco de dados " + simpleDateFormat.format(date));
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println("Objeto Date " + simpleDateFormat.parse("1987-10-18"));
		
		simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Objeto Date " + simpleDateFormat.parse("18/10/1987"));
	}

}

package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class DatasEmJava {
	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		
		System.out.println("Data em milisegundo " + date.getTime());
		System.out.println("Dia do mes " + date.getDate());
		System.out.println("Dia da semana " + date.getDay());
		System.out.println("Hora do dia " + date.getHours());
		System.out.println("Minuto do dia " + date.getMinutes());
		System.out.println("Segundo " + date.getSeconds());
		System.out.println("Ano " + (date.getYear() + 1900));
		
//		----------------------symple Date Format------------------------------
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		
		System.out.println("Data atual formato padrão String " + simpleDateFormat.format(date));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.SS");
		
		System.out.println("Data em formato para banco de dados " + simpleDateFormat.format(date));
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println("Objeto Date " + simpleDateFormat.parse("1987-10-18"));
		
		simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Objeto Date " + simpleDateFormat.parse("18/10/1987"));
	}

}

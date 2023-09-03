package modulo_datas;

import java.util.Date;

public class DatasEmJava {
	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println("Data em milisegundo " + date.getTime());
		System.out.println("Dia do mes " + date.getDate());
		System.out.println("Dia da semana " + date.getDay());
		System.out.println("Hora do dia " + date.getHours());
		System.out.println("Minuto do dia " + date.getMinutes());
		System.out.println("Segundo " + date.getSeconds());
		System.out.println("Ano " + (date.getYear() + 1900));
		
	}

}

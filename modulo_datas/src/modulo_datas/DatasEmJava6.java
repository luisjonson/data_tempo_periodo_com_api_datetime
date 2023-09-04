package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DatasEmJava6 {
	public static void main(String[] args) throws ParseException {
		
		//Nova API de data a partir do java 8
		
		LocalDate dataAtual = LocalDate.now();
		System.out.println("Data Atual: " + dataAtual);
		
		LocalTime horaAtual = LocalTime.now();
		System.out.println("Hora atual: " + horaAtual);
		
	}

}

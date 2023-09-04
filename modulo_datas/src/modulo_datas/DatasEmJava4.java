package modulo_datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DatasEmJava4 {
	public static void main(String[] args) throws ParseException {
		
		// Dias corridos  
		Long dias = ChronoUnit.DAYS.between(LocalDate.parse("1978-08-30"), LocalDate.now());
		System.out.println("Possui " + dias + " dias  entre a faixa de data");
		// Dias corridos
		
		Long decadas = ChronoUnit.DECADES.between(LocalDate.parse("1978-08-30"), LocalDate.now());
		System.out.println("Possui " + decadas + " decadas entre a faixa de data");
		
//		Long horas = ChronoUnit.HOURS.between(LocalDate.parse("1978-08-30 10:20.30"), LocalDate.now());
//		System.out.println("Posui " + horas + " entre a faixa de data");
		Long anos = ChronoUnit.YEARS.between(LocalDate.parse("1978-08-30"), LocalDate.now());
		System.out.println("Possui " + anos + " anos entre a faixa de data");
		Long meses = ChronoUnit.MONTHS.between(LocalDate.parse("1978-08-30"), LocalDate.now());
		System.out.println("Possui " + meses + " meses entre a faixa de data");
		Long semanas = ChronoUnit.WEEKS.between(LocalDate.parse("1978-08-30"), LocalDate.now());
		System.out.println("Possui " + semanas + " semanas entre a faixa de data");
		
		
	}

}

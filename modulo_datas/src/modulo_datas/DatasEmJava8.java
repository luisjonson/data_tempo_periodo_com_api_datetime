package modulo_datas;

import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;

public class DatasEmJava8 {
	public static void main(String[] args) throws ParseException, InterruptedException {
		
		//Nova API de data a partir do java 8
		Instant inicio = Instant.now();
		
		Thread.sleep(20000);
		Instant ifinal = Instant.now();
		
		Duration duracaoDuration = Duration.between(inicio, ifinal);
		System.out.println(" Duração em nano segundos : " + duracaoDuration.toNanos());
		System.out.println(" Duração em minutos : " + duracaoDuration.toMinutes());
		System.out.println(" Duração em horas : " + duracaoDuration.toHours());
		System.out.println(" Duração em milisegundos : " + duracaoDuration.toMillis());
		System.out.println(" Duração em dias : " + duracaoDuration.toDays());
		
		
		
	}

}

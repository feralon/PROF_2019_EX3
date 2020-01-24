package es.upm.grise.profundizacion2019.ex3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {
	/**
	 * 
	 * @param time Datetime from we are getting the future time
	 * @param seconds to forward
	 * @return final Datetime
	 */
	public static String getFutureTime(LocalDateTime time, long seconds) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		return formatter.format(time.plusSeconds(seconds));	
	}

}

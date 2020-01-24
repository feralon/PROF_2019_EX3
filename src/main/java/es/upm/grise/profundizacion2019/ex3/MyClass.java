package es.upm.grise.profundizacion2019.ex3;

import java.time.LocalDateTime;

public class MyClass {
	
	public void nextTime(long seconds) {
		String next = Time.getFutureTime(LocalDateTime.now(),seconds);
		System.out.println(next);
	}

}

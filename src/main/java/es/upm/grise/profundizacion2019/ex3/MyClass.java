package es.upm.grise.profundizacion2019.ex3;

import java.time.LocalDateTime;

public class MyClass {
	
	private Time time;
	
	public MyClass(Time time)
	{
		this.time = time;
	}
	
	public void nextTime(long seconds) {
		String next = time.getFutureTime(LocalDateTime.now(),seconds);
		System.out.println(next);
	}

}

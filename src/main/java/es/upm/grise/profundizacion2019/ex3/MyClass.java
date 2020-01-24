package es.upm.grise.profundizacion2019.ex3;

import java.time.LocalDateTime;

public class MyClass {
	
	private Time time;
	private LocalDateTime actualTime = null;
	
	public MyClass(Time time)
	{
		this.time = time;
	}
	
	public MyClass(LocalDateTime actualTime, Time time)
	{
		this.time = time;
		this.actualTime = actualTime;
	}
	
	public void nextTime(long seconds) {
		LocalDateTime ld = this.actualTime;
	
		if(ld == null)
			ld = LocalDateTime.now();
		
		String next = time.getFutureTime(ld,seconds);
		
		System.out.println(next);
	}

}

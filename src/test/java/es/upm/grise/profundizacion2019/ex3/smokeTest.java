package es.upm.grise.profundizacion2019.ex3;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class smokeTest {
	MyClass my;
	Time time;
	
	@Before
	public void setUp() {
		time = new Time();
		my = new MyClass(time);
	}

	@Test
	public void smoleTest() {
		long SECONDS = 60;
		my.nextTime(SECONDS);
	}
	
	@Test
	public void stateTestTimeClass ()
	{
		LocalDateTime actualDt = LocalDateTime.of(2020, 1, 1, 0, 0, 0);
		LocalDateTime futureDt = LocalDateTime.of(2020, 1, 1, 0, 2, 0);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		
		assertEquals(futureDt.format(formatter), time.getFutureTime(actualDt, 120));
	}
	
	@Test
	public void WhenCallingMyClassNextTimeThenMyClassNexTimeIsOnlyInvokedOnce()
	{
		LocalDateTime ld = LocalDateTime.now();
		Time timeMocked = mock(Time.class);
		MyClass m = new MyClass(ld, timeMocked);
		
		m.nextTime(120);
		
		verify(timeMocked, times(1)).getFutureTime(ld, 120);
	}
}

package at.mexx.test.testrepo;

import java.util.concurrent.TimeUnit;

public class Service {
	
	public boolean foo(int waitInSeconds) {
		
		try {
			System.out.println("foo: " + waitInSeconds);
			TimeUnit.SECONDS.sleep(waitInSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("foo finished");
		return true;
		
		
	}

}

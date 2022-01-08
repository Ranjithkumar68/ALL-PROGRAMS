package org.tcs;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Reports {
	
	@Test
	public void Report() {
	Result r = JUnitCore.runClasses(College.class,Department.class,Hostel.class);
		System.out.println("Runcount:"+r.getRunCount());
		System.out.println("Failure Count:"+r.getFailureCount());
		System.out.println("Ignore Count"+r.getIgnoreCount());
		System.out.println("Runtime:"+r.getRunTime());
		int x = r.getRunCount()-r.getFailureCount();
		System.out.println("PassCount:"+ x);
		List<Failure> failures = r.getFailures();
		for (Failure z : failures) {
			System.out.println("Failure:"+z);
			
		}
		
		

	}

}

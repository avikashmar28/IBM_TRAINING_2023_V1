package JunitTestCase;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JunitRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result result=JUnitCore.runClasses(JunitTestCaseCheck.class);
		System.out.println("Total Test case are:" +result.getRunCount());
		System.out.println("Total ignored test cases are:" +result.getIgnoreCount());
		System.out.println("Total Failed test cases are:" +result.getFailureCount());
		System.out.println("total run time is:" +result.getRunTime());
		for(Failure failed:result.getFailures()) {
			System.out.println(failed.getException());
		}
	}

}

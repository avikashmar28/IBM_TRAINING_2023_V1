package JunitTestCase;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import FifthDay.MathOperations;

/**
 * @author Student
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ JunitTestCaseCheck.class})
public class JunitSuite {
	@BeforeClass
	public static void setUpBeforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void setupAfterClass() {
		System.out.println("After Class");
	}

}

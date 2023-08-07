package JunitTestCase;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


import FifthDay.MathOperations;
 public class JunitTestCaseCheck {
	 
	@AfterClass
	public static void afterclass() {
		System.out.println("After Class always Executed once after executing all");
	}
	@BeforeClass
	public static void beforeclass() {
		System.out.println("Before Class always Executed once before executing all");
	}

	//@Ignore (@Ignore annotation This will ignore the test case while running)
	@Test
	public void BestaddFunation() {
		MathOperations m1=new MathOperations();
		int ret=m1.add(2, 3);
		assertEquals(6,ret);
	}
	
	@Test
	public void AestsubstractFunation() {
		MathOperations m1=new MathOperations();
		int ret=m1.substract(3, 2);
		assertEquals(1,ret);
	}
	
	@After
	public void after() {
		System.out.println("After each test case this block will run");
	}
	
	@Before
	public void before() {
		System.out.println("Before executing each test case this block got executed");
	}

}

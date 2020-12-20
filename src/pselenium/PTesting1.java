package pselenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PTesting1 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after");
	}

	@Test
	public void test1() {
		//System.out.println("login");
		System.out.println("test1");
		//System.out.println("logout");
	}
	
	@Test
	public void test2() {
		//System.out.println("login");
		System.out.println("test2");
		//System.out.println("logout");
	}
	
	@Test
	public void test3() {
		//System.out.println("login");
		System.out.println("test3");
		//System.out.println("logout");
	}

}

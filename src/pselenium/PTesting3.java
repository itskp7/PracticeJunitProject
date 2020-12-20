package pselenium;


import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;



public class PTesting3 {
	
	@Rule
	public ErrorCollector err = new ErrorCollector();
	

	@Test
	public void test6() {
		String actual = "abc";
		String expected = "abc1";
		/*if (actual.equals(expected)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}*/
		System.out.println("before 1st assert");
		Assert.assertEquals(expected, actual);           // hard assert (this is used in company)
		System.out.println("after 1st assert");
		Assert.assertTrue(2>3);
		System.out.println("after 2nd assert");
	}
	
	@Test
	public void test7() {
		String actual = "abc";
		String expected = "abc";
		System.out.println("before 1st assert");
		try {                                           // if we use if, else either one of them is executed
		Assert.assertEquals(expected, actual);          // while in try catch both are 
		}catch(Throwable Krunal) {
			System.out.println("I am in first catch");
			err.addError(Krunal);                          // ErrorCollector is used to collect error and test would not have failed
		}                                                    // bcz the test would not fail so we use it
		System.out.println("after 1st catch");
		try {
			Assert.assertTrue(2>3);
		}catch(Throwable Krunal) {
			System.out.println(" I am in second catch");
			err.addError(Krunal);
		}
		System.out.println("after 2nd assert");
	
		}
	}


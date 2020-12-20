package pselenium;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	PTesting1.class, 
	PTesting2.class, 
	PTesting3.class 
	})
public class PJunitSuiteRunnerTest {

}

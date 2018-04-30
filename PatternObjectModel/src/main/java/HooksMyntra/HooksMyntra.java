package HooksMyntra;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class HooksMyntra extends SeMethods{
		
	@Before
	public void before(Scenario sc)  {
		startResult();
		startTestModule(sc.getName(), sc.getId());
		test = startTestCase(sc.getName());
		test.assignCategory("Smoke");
		test.assignAuthor("Myntra");
		startApp("chrome");		
	}
		
	@After
	public void after()   {
		endResult();
		closeAllBrowsers();
		
	}

	
}

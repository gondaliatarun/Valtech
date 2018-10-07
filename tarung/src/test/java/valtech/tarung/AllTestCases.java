package valtech.tarung;

import org.testng.annotations.Test;

public class AllTestCases extends Hooks {

	@Test(priority =1)
	public void assertRecentBlogs(){
		hp.acceptCookies();
		utils.waitForMilliseconds();
		hp.assertRecentBlogs();
		System.out.println("Exe-2.a : Test Pass");
	}

	@Test (priority =2)
	public void assertFirstBlog() {
		hp.acceptCookies();
		hp.clickOnFirstBlog();
		fut.assertFutureForDevOps();
		System.out.println("Exe-2.b : Test Pass");
	}
	
	@Test (priority = 3)
	public void assertAbout() {
	}
	
	@Test (priority = 4)
	public void assertWork() {
	}
	
	@Test (priority = 5)
	public void assertservices() {
	}
	
	@Test (priority = 6)
	public void totalOffices() {
	}
}

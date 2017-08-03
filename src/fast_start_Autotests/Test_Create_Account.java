package fast_start_Autotests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import fs_Page_Object.FS_Account;
import system_classes.Credentials;
import system_classes.Load_CRM_enter_Credentials;
import system_classes.Sys_DriverChooseClass;



public class Test_Create_Account {
	
	private static final String crm_url_fs = Credentials.crm_url_fs;
	private WebDriver driver;
		

	
	@Before
	public void SetUp() throws Exception {

	driver = Sys_DriverChooseClass.getDriver("chrome");	
	//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	//driver.manage().window().maximize();
	//Thread.sleep(4000);

	
	}
	
	@Test
	public void test() throws Exception {
		driver.get(crm_url_fs);
		
		Load_CRM_enter_Credentials.enter_cred(driver);
		
		FS_Account.main(driver);
		
		
		
		
	}
	
	
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(6000);
		driver.quit();

}
}

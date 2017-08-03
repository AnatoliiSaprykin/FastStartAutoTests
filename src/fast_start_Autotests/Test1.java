package fast_start_Autotests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import system_classes.Credentials;
import system_classes.Ctrl_V_class;
import system_classes.Righclick;
import system_classes.Sys_DriverChooseClass;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class Test1 {
	private static final String crm_url_fs = Credentials.crm_url_fs;
	private WebDriver driver;
		

	
	@Before
	public void SetUp() throws Exception {

	//driver = Sys_DriverChooseClass.getDriver("firefox");	
	//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	//driver.manage().window().maximize();
	//Thread.sleep(4000);

		
	}
	
	@Test
	public void test() throws Exception {
		open("crm_url_fs");
		
		
	}
	
	
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(6000);
		driver.quit();

}
}
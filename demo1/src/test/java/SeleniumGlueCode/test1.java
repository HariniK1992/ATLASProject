package SeleniumGlueCode;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class test1 {
	
	public static WebDriver driver;
	@Given("^user is on ATLAS application$")
	public void App_Access() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://atlas.virtusacloud.net/");
	}
	@When("^user enters Username and password$")
	public void Login() throws Throwable
	{
		driver.findElement(By.id("mat-input-0")).sendKeys("kmadhavan@virtusa.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("Virtusa@123");
		driver.findElement(By.xpath("/html/body/app-root/app-login/mat-card/form/div/div[2]/div/button/span")).click();
	}
	@Then("^Home page will be displayed$")
	public void Home_Page() throws Throwable
	{
		if(driver.findElement(By.xpath("/html/body/app-root/app-layout/app-nav/mat-toolbar/div/button[5]/span/mat-icon")).isDisplayed()==true)
		{
			System.out.println("Login Successful");
		}
		else
		{
			System.out.println("Login unsuccessful");
		}
	}
	@Given("^I need to select the Overview option from the left Menu bar$")
	public void verify_Overviewoption() throws Throwable {
	    
		driver.findElement(By.xpath("/html/body/app-root/app-layout/app-nav/mat-toolbar/button/span/mat-icon")).click();
	}

	@Then("^Validate the GraphNames$")
	public void validate_the_GraphNames() throws Throwable {
	    
		if(driver.getPageSource().contains("Agent Installed"))
			System.out.println("Agent Installed is displaying");
		else
			System.out.println("Agent Installed is not displaying");
		if(driver.getPageSource().contains("Agent Status"))
			System.out.println("Agent Status is displaying");
		else
			System.out.println("Agent Status is not displaying");
		if(driver.getPageSource().contains("Discovery Status"))
			System.out.println("Discovery Status is displaying");
		else
			System.out.println("Disovery Status is not displaying");
		if(driver.getPageSource().contains("Planning Status"))
			System.out.println("Planning Status is displaying");
		else
			System.out.println("Planning Status is not displaying");
	}
	@Given("^I need to select the Agent Setup option from the Left Menu bar$")
	public void Agent_Setup_Selection() throws Throwable {
		
		driver.findElement(By.xpath("/html/body/app-root/app-layout/app-nav/mat-sidenav-container/mat-sidenav/div/button[2]/span")).click();
	}

	@When("^Agent Setup screen is displaying$")
	public void Verify_Agent_Setup() throws Throwable {
	    
		String textname = driver.findElement(By.xpath("/html/body/app-root/app-layout/app-nav/mat-sidenav-container/mat-sidenav-content/app-agent-setup/mat-card/mat-card-header/div/mat-card-title/h3")).getText();
		if(textname.equals("Agent Setup"))
			System.out.println("Agent Setup screen is displaying");
		else
			System.out.println("Agent Setup screen is not displaying");
	}

	@Then("^Select the Agent Version$")
	public void select_the_Agent_Version() throws Throwable {
	    driver.findElement(By.xpath("//*[@id=\"mat-select-0\"]/div/div[1]/span")).click();
	    driver.findElement(By.xpath("//*[@id=\"mat-option-1\"]/span")).click();
	}

	@Then("^Click on Download option$")
	public void click_on_Download_option() throws Throwable {
	    driver.findElement(By.xpath("/html/body/app-root/app-layout/app-nav/mat-sidenav-container/mat-sidenav-content/app-agent-setup/mat-card/span/button/span")).click();
	    driver.findElement(By.className("mat-list-item")).click(); //Windows option, need to check for Linux as well
	}
	@Given("^I need to select the Agent Status option from the Left Menu bar$")
	public void Agent_Status_Selection() throws Throwable {
	    driver.findElement(By.xpath("/html/body/app-root/app-layout/app-nav/mat-sidenav-container/mat-sidenav/div/button[3]/span")).click();
	}

	@When("^Agent Status screen is displaying$")
	public void Verify_Agent_Status() throws Throwable {
		String textname = driver.findElement(By.xpath("/html/body/app-root/app-layout/app-nav/mat-sidenav-container/mat-sidenav-content/app-agent-status/mat-card/mat-card-header/div/mat-card-title")).getText();
		if(textname.equals("Agent Status"))
			System.out.println("Agent Status screen is displaying");
		else
			System.out.println("Agent Status screen is not displaying");
	}

	@Then("^Verify all the related columns are displaying or not$")
	public void verify_columns() throws Throwable {
	  
		Thread.sleep(2000);
		List<WebElement> column_headers=driver.findElements(By.xpath("/html/body/app-root/app-layout/app-nav/mat-sidenav-container/mat-sidenav-content/app-agent-status/mat-card/table/thead/tr"));
		for(WebElement e : column_headers)
		{
			System.out.print(e.getText());
			System.out.println();
			//Need to keep an excel and verify the column names
			//Need to keep a DB connection and verify the values			
		}
	}
	@Given("^I need to select the Discover option from the Left Menu bar$")
	public void Discovery_option() throws Throwable {
	    driver.findElement(By.xpath("/html/body/app-root/app-layout/app-nav/mat-sidenav-container/mat-sidenav/div/button[4]/span")).click();
	    Thread.sleep(2000);
	}

	@Then("^Click on any Agent in the Network Topology$")
	public void click_on_any_Agent_in_the_Network_Topology() throws Throwable {
	    
	}

	@Then("^Verify whether the System Info and Metadata Info is displaying or not$")
	public void verify_whether_the_System_Info_and_Metadata_Info_is_displaying_or_not() throws Throwable {
	    
	}
	@Given("^I need to select the Plan option from the Left Menu bar$")
	public void Plan_option_Selection() throws Throwable {
	    driver.findElement(By.xpath("/html/body/app-root/app-layout/app-nav/mat-sidenav-container/mat-sidenav/div/button[5]/span")).click();
	}

	@When("^Plan screen is displaying$")
	public void Verify_plan_screen() throws Throwable {
		String textname = driver.findElement(By.xpath("/html/body/app-root/app-layout/app-nav/mat-sidenav-container/mat-sidenav-content/app-planning/mat-card/mat-card-header/div/mat-card-title")).getText();
		if(textname.equals("Plan"))
			System.out.println("Plan screen is displaying");
		else
			System.out.println("Plan screen is not displaying");
	}

	@Then("^Verify All,Apps,MoveGroups are displaying or not$")
	public void verify_tabs() throws Throwable {
	    
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[contains(text(),'Apps')]/ancestor::div[@role='tab']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[contains(text(),'Move Groups')]/ancestor::div[@role='tab']")).click();
	}
}

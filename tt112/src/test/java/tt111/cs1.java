package tt111;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cs1 {
	WebDriver driver;
	@Given("the signup page is opened")
	public void the_signup_page_is_opened() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.03\\Desktop\\inu\\chromedriver.exe");
			driver = new ChromeDriver();
			String url = "http://10.232.237.143:443/TestMeApp/fetchcat.htm";
			driver.get(url);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	}

	@When("user enters saiindhu as username")
	public void user_enters_saiindhu_as_username() {
	  driver.findElement(By.id("userName")).sendKeys("saiindhu");
	}

	@When("user enters indhu as firstname")
	public void user_enters_indhu_as_firstname() {
		 driver.findElement(By.id("firstName")).sendKeys("indhu");
	}

	@When("user enters inuuu as lastname")
	public void user_enters_inuuu_as_lastname() {
		driver.findElement(By.id("lastName")).sendKeys("inuuu");
	}

	@When("user enters passwordinuu as password")
	public void user_enters_passwordinuu_as_password() {
		driver.findElement(By.id("password")).sendKeys("passwordinuu");
	}

	@When("user enters passwordinuu as confirm password")
	public void user_enters_passwordinuu_as_confirm_password() {
		driver.findElement(By.id("pass_confirmation")).sendKeys("passwordinuu");
	}

	@When("user selects Female as Gender")
	public void user_selects_Female_as_Gender() {
		driver.findElement(By.xpath("//input[@value='Female']")).click();
	}

	@When("user enters saiindhu.melan@gmail.com as Email")
	public void user_enters_saiindhu_melan_gmail_com_as_Email() {
		driver.findElement(By.id("emailAddress")).sendKeys("saiindhu.melan@gmail.com");
	}

	@When("user enters {string} as mobile number")
	public void user_enters_as_mobile_number(String string) {
		driver.findElement(By.id("mobileNumber")).sendKeys("9876543212");
	}

	@When("user enters {string} as DOB")
	public void user_enters_as_DOB(String string) {
		driver.findElement(By.id("dob")).sendKeys("09/06/1998");
	}

	@When("user enters ctr as Address")
	public void user_enters_ctr_as_Address() {
		driver.findElement(By.id("address")).sendKeys("down street bangalore");
	}

	@When("user selects What is your favour color? as Security Question")
	public void user_selects_What_is_your_favour_color_as_Security_Question() {
	  Select q = new Select(driver.findElement(By.id("securityQuestion")));
	  q.selectByIndex(1);
	}

	@When("user enters white as Answer")
	public void user_enters_white_as_Answer() {
		driver.findElement(By.id("answer")).sendKeys("white");
	}

	@When("user clicks on Register button")
	public void user_clicks_on_Register_button() {
	   driver.findElement(By.xpath("//input=[@value='Register']")).click();
	}

	@Then("user will   Finds a testmeapp admin page")
	public void user_will_Finds_a_testmeapp_admin_page() {
		System.out.println("the page name is"+driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Home"));
	}



}

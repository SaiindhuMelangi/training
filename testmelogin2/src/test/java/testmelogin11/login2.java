package testmelogin11;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login2 {
	WebDriver driver;
	@Given("the login page is opened")
	public void the_login_page_is_opened() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.03\\Desktop\\inu\\chromedriver.exe");
			driver = new ChromeDriver();
			String url = "http://10.232.237.143:443/TestMeApp/fetchcat.htm";
			driver.get(url);
			driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	}

	@When("user enters lalitha as username")
	public void user_enters_lalitha_as_username() {
		 driver.findElement(By.id("userName")).sendKeys("lalitha");
		 
		   
	}

	@And("user enters password{int} as password")
	public void user_enters_password_as_password(Integer int1) {
		driver.findElement(By.id("password")).sendKeys("password123");
	}

	@Then("user will   Finds a testmeapp homepage")
	public void user_will_Finds_a_testmeapp_homepage() {
		  driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
		  System.out.println("the page name is"+driver.getTitle());
		  Assert.assertTrue(driver.getTitle().contains("Home"));
		  driver.close();

	}

	@Given("the login page is opened")
	public void the_login_page1_is_opened() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.03\\Desktop\\inu\\chromedriver.exe");
			driver = new ChromeDriver();
			String url = "http://10.232.237.143:443/TestMeApp/fetchcat.htm";
			driver.get(url);
			driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	}

	@When("user enters admin as username")
	public void user_enters_admin_as_username() {
		 driver.findElement(By.id("userName")).sendKeys("admin");
		 
		   
	}

	@And("user enters password{int} as password")
	public void user_enters_password456_as_password(Integer int1) {
		driver.findElement(By.id("password")).sendKeys("password456");
	}

	@Then("user will   Finds a testmeapp admin page")
	public void user_will_Finds_a_testmeapp_admin_page() {
		 driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
		  System.out.println("the page name is"+driver.getTitle());
		  Assert.assertTrue(driver.getTitle().contains("Home"));
		  driver.close();

	}



}

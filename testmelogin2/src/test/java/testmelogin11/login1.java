package testmelogin11;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login1 {
	WebDriver driver;

@Given("login page is opened")
public void login_page_is_opened() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.03\\Desktop\\inu\\chromedriver.exe");
		driver = new ChromeDriver();
		String url = "http://10.232.237.143:443/TestMeApp/fetchcat.htm";
		driver.get(url);
		
		
}

@When("user click on login")
public void user_click_on_login() {
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
}

@When("user enters {string} and {string}")
public void user_enters_and(String username, String password) {
	 driver.findElement(By.id("userName")).sendKeys(username);
	 driver.findElement(By.id("password")).sendKeys( password);
	   
}

@Then("user will be able to open testme homepage")
public void user_will_be_able_to_open_testme_homepage() {
    driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
System.out.println("the page name is"+driver.getTitle());
Assert.assertTrue(driver.getTitle().contains("Home"));
driver.close();
}


}

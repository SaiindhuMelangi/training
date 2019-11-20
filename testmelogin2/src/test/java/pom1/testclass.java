package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testclass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.03\\Desktop\\inu\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	PageClass po = new PageClass(driver);
	driver.get("http://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	po.clicklink();
	String username = null;
	po.unn(username);
	String password = null;
	po.pwdd(password);
	po.clicklogin();
	System.out.println("the page name is"+driver.getTitle());
	
	}

}

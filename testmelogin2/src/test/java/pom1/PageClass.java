package pom1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageClass {
	WebDriver driver;
	By ln = By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
	By un = By.name("Email");
	By pwd = By.id("Password");
	By li = By.xpath("//input[@value='Log in']");
	public PageClass(WebDriver driver) {
		this.driver=driver;
	}
	public void clicklink() {
		driver.findElement(ln).click();
	}
	public void unn(String username) {
		driver.findElement(un).sendKeys("aravind.guggilla57@gmail.com");
	}
	public void pwdd(String password) {
		driver.findElement(pwd).sendKeys("aravind");
	}
	public void clicklogin() {
		driver.findElement(li).click();
	}
}
	

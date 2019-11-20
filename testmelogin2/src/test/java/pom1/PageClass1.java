package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageClass1 {
	WebDriver driver;
	@FindBy(how=How.XPATH,using="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a") WebElement lo;
	@FindBy(how=How.ID,using="Email") WebElement un;
	@FindBy(how=How.ID,using="Password") WebElement pwd;
	@FindBy(how=How.XPATH,using="//input[@value='Log in']") WebElement li;
	public PageClass1(WebDriver driver) {
		this.driver=driver;
	}
	public void limethod(String unn,String pwdd) {
		lo.click();
		un.sendKeys(unn);
		pwd.sendKeys(pwdd);
		li.click();
	}

}

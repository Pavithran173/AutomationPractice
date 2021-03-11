package www.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomclass {

	public WebDriver driver;



	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getDs() {
		return ds;
	}

	@FindBy(xpath = "//*[@title='Log in to your customer account']")
	private WebElement signin;
	@FindBy(id = "email")
	private WebElement username;
	@FindBy(id = "passwd")
	private WebElement password;
	@FindBy(id = "SubmitLogin")
	private WebElement login;
	@FindBy(xpath="//a[@title='View my customer account']/span")private WebElement ds;

	public Pomclass(WebDriver driverx) {

		this.driver = driverx;

		PageFactory.initElements(driver, this);

	}

}

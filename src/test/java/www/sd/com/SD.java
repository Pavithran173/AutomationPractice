package www.sd.com;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import www.bc.com.Baseclass;
import www.pom.com.Pomclass;

public class SD extends Baseclass {

	@Given("^Customer select sign in option$")
	public void customer_select_sign_in_option() throws Throwable {

		

		browser("http://automationpractice.com/index.php");
		
		Pomclass ps = new Pomclass(driver);
		
		Thread.sleep(3000);

		click(ps.getSignin());
		
		Thread.sleep(10000);

	}

	@When("^Customer enter username and password$")
	public void customer_enter_username_and_password() throws Throwable {
    
		
		Pomclass ps = new Pomclass(driver);
		
		sendkeys(ps.getUsername(), "qhy@email.com");
		sendkeys(ps.getPassword(), "innovate");
	}

	@When("^Customer click login button$")
	public void customer_click_login_button() throws Throwable {
		Pomclass ps = new Pomclass(driver);
		click(ps.getLogin());
	}

	@Then("^Customer logged in to site and verify username$")
	public void customer_logged_in_to_site_and_verify_username() throws Throwable {
		driver.manage().window().maximize();
		
		Pomclass ps = new Pomclass(driver);
		boolean isdisplay = isdisplay(ps.getDs());
		System.out.println(isdisplay);
		
		String getattribute = getattribute(ps.getDs(), "name");
		System.out.println(getattribute);
		
	}

}

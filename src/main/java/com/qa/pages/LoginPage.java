package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Utils;

public class LoginPage extends Utils {

	// Page factory-OR:
	@FindBy(id = "edit-name")
	WebElement username;
	@FindBy(id = "edit-pass")
	WebElement password;
	@FindBy(css = "#edit-submit" )
	WebElement signup;

	@FindBy(xpath = "//*[@class=\"user-login-form\"]/div[1]/div/ul/li[1]")
	WebElement warningmessage;
	@FindBy(xpath = "//label[@id='edit-name-error']")
	WebElement withoutusername;
	@FindBy(xpath = "//label[@id='edit-pass-error']")
	WebElement withoutpassword;
	
	//Utils xlr = new Utils();

	public LoginPage() {
	
		PageFactory.initElements(driver, this);
	//	wait=new WebDriverWait(driver, 20);
		

	}

	public  void enterUsername (String Un) throws Exception {
		
			clearAndType(username, Un);
		
		
			
	}
/*public void usernameenter() {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript(“document.getElementsById(‘edit-name’).value=’Mishra’;”);
}*/
	public void enterPassword(String Un) throws Exception{
		
			clearAndType(username, Un);
		
		
	}

	public void clickLogin() throws Exception{
		
        waitForElementToBeClickable(signup, 10);
		signup.click();
	}

	public String ValidatingWarningMessageforinvalidcred() {
		return warningmessage.getText();

	}

	public String ValidatingWarningMessageforwithoutusername() {
		return withoutusername.getText();

	}

	public String ValidatingWarningMessageforwithoutpassword() {
		return withoutpassword.getText();
	}

}

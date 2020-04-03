package com.qa.util;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils extends TestBase {
	
	private static final int DEFAULT_EXPLICIT_WAIT_TIMEOUT = 60;
	
	public WebDriverWait webDriverWait(long timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait;
}
	public void waitForElementToBeClickable(WebElement locator, long timeOut) {
		WebDriverWait wait = webDriverWait(timeOut);
		wait.until(ExpectedConditions.elementToBeClickable(locator));

}
	public void clearAndType(WebElement element , String text) throws Exception {
		boolean status=true;
		try{	
		
		waitForElementToBeClickable(element, DEFAULT_EXPLICIT_WAIT_TIMEOUT);
		
		element.click();
		element.clear();
		element.sendKeys(text);
		element.sendKeys(Keys.TAB);
		}catch (Exception e) {
		e.printStackTrace();
		}

		
		}
}
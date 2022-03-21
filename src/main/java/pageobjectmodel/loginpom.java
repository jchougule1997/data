package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginpom {
@FindBy(how=How.XPATH,using="//input[@placeholder='First Name']")
private WebElement firstname;

public WebElement getfirstname() {
	return firstname;
}

@FindBy(how=How.XPATH,using="//input[@placeholder='Last Name']")
private WebElement lastname;
public WebElement getlastname() {
	return lastname;
}


}

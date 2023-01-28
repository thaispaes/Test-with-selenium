package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private By emailAddressLocator = By.id("email");
    private By passwordLocator = By.name("password");
    private By submitBtnLocator = By.xpath("//*[@id=\"SubmitLogin\"]");
    private By tagMyAccountLocator = By.tagName("h1");

    public void signin() {
        if(super.isDisplayed(emailAddressLocator)) {
            super.type("email", emailAddressLocator);
            super.type("senha", passwordLocator);
            super.click(submitBtnLocator);
        } else {
            System.out.println("Email textbox was not present");
        }
    }

    public String getMyAccountMessage(){
        return super.getText(tagMyAccountLocator);
    }
}

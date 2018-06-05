package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DemoLoginPage {

    @FindBy(xpath = "//*[@name=\"Email\"]")
    public WebElement usernameField;

    @FindBy(how = How.NAME, using = "Password")
    public WebElement passwordField;

    @FindBy(name="action_doLogin")
    public WebElement submitButton;

    @FindBy(name="Remember")
    public WebElement rememberMeCheckbox;


    public void doLogin(String username,String password){
        usernameField.clear();
        usernameField.sendKeys(username);

        passwordField.clear();
        passwordField.sendKeys(password);

        rememberMeCheckbox.click();
        submitButton.click();

    }


}


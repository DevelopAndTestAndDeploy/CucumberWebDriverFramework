package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_PO extends Base_PO {

    private @FindBy(id = "text")
    WebElement userName_TextField;

    private @FindBy(id = "password")
    WebElement password_TextField;

    private @FindBy(id = "login-button")
    WebElement login_Button;

    public Login_PO() {
        super();
    }

    public void navigateToWebDriverUniversity_Login_Page() {
        navigateTo_URL("https://webdriveruniversity.com/Login-Portal/index.html");

    }

    public void setUserName(String userName) {
        sendKeys(userName_TextField, userName);
    }

    public void setPassword(String password) {
        sendKeys(password_TextField, password);
    }

    public void clickOn_Login_Button() {
        waitForWebElementAndClick(login_Button);
    }


}

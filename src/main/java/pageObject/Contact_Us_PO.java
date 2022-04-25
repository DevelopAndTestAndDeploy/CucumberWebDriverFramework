package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import utils.Global_Vars;

public class Contact_Us_PO extends Base_PO {

    private @FindBy(how = How.XPATH, using = "//input[@name='first_name']")
    WebElement first_Name_TextField;

    private @FindBy(how = How.XPATH, using = "//input[@name='last_name']")
    WebElement last_Name_TextField;

    private @FindBy(xpath = "//*[@id='contact_form']/input[3]")
    WebElement emailAddress_TextField;

    private @FindBy(xpath = "//textarea[@name='message']")
    WebElement comment_TextField;

    private @FindBy(xpath = "//input[@value='SUBMIT']")
    WebElement submit_Button;

    private @FindBy(xpath = "//div[@id='contact_reply']/h1")
    WebElement successfulSubmission_Message_Text;





    public Contact_Us_PO() {
        super();
    }

    public void navigateTo_WebDriverUniversity_Contact_US_Page() {
        navigateTo_URL(Global_Vars.WEBDRIVER_UNIVERSITY_HOMEPAGE_URL + "/Contact-Us/contactus.html");

    }

    public void setUnique_FirstName() {
        sendKeys(first_Name_TextField, "AutoFN " + generateRandomNumber(5));
    }

    public void setUnique_LastName() {
        sendKeys(last_Name_TextField, "AutoLN " + generateRandomNumber(5));
    }

    public void setUnique_EmailAddress() {
        sendKeys(emailAddress_TextField, "AutoEmail@" + generateRandomNumber(5) + ".gmail.com");
    }

    public void setUnique_Comment() {
        sendKeys(comment_TextField, "Hello World  + generateRandomNumber(20)");
    }

    public void setSpecificFirstName(String firstName) {
        //driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstName)
        sendKeys(first_Name_TextField, firstName);

    }

    public void setSpecificLastName(String lastName) {
        //driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstName)
        sendKeys(last_Name_TextField, lastName);

    }

    public void setSpecificEmailAddress(String emailAddress) {
        //driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstName)
        sendKeys(emailAddress_TextField, emailAddress);

    }


    public void setSpecificComment(String comment) {
        //driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstName)
        sendKeys(comment_TextField, comment);

    }

    public void click_On_Submit_Button() {
        waitForWebElementAndClick(submit_Button);
    }

    public void validate_Successful_SubmissionMessage_Text() {

        waitFor(successfulSubmission_Message_Text);
        Assert.assertEquals(successfulSubmission_Message_Text.getText(), "Thank You for your Message!");

    }


}

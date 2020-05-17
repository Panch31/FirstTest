package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
    }

    @FindBy(xpath = "//a[@href ='/login']")
    WebElement LoginButton;

    @FindBy(id = "login_field")
    WebElement LoginField;

    @FindBy(id = "password")
    WebElement PasswordField;

    @FindBy(xpath = "//input[@type = 'submit']")
    WebElement SubmitButton;

    @FindBy(xpath = "//span[contains(@class, 'nick')]")
    WebElement NameSting;

    public void goToHomePage() {
        String http = "https://github.com/";
        driver.get(http);
    }

    public void clickOnLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(LoginButton))
                .click();
    }

    public void enterToLoginField() {
        wait.until(ExpectedConditions.elementToBeClickable(LoginField))
                .sendKeys("Panch31");
    }

    public void enterToPasswordField() {
        wait.until(ExpectedConditions.elementToBeClickable(PasswordField))
                .sendKeys("mAEege4jJW");
    }

    public void clickOnSubmitButton() {
        wait.until(ExpectedConditions.elementToBeClickable(SubmitButton))
                .click();
    }

     public String getName(){
        driver.get("https://github.com/Panch31/");
        String name = wait.until(ExpectedConditions.visibilityOf(NameSting))
                .getText();
        return name;
    }

}

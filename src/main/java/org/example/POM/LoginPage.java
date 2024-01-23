package org.example.POM;

import org.example.Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPage extends BaseTest {

    WebDriverWait wait = new WebDriverWait(BaseTest.driver, Duration.ofMinutes(2));
    @FindBy(xpath = "//a[text()='Practice']") private WebElement btnPractice;
    @FindBy(xpath = "//a[text()='Test Login Page']") private WebElement btnLogin;
    @FindBy(xpath = "//input[@name='username']") private WebElement inpUsername;
    @FindBy(xpath = "//input[@name='password']") private WebElement inpPassword;
    @FindBy(xpath = "//button[@id='submit']") private WebElement btnSubmit;

    public LoginPage() {
        PageFactory.initElements(BaseTest.driver, this);
    }
    public void navigatesToLoginPage() {
        wait.until(ExpectedConditions.visibilityOf(btnPractice)).click();
        wait.until(ExpectedConditions.visibilityOf(btnLogin)).click();
    }
    public void enterTheCredentials(String username, String password) {
        wait.until(ExpectedConditions.visibilityOf(inpUsername)).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOf(inpPassword)).sendKeys(password);
        wait.until(ExpectedConditions.visibilityOf(btnSubmit)).click();
    }
    public void verifyLoginStatus(String text){
        String actualText = wait.until(ExpectedConditions.visibilityOf(BaseTest.driver.findElement(By.xpath("(//*[text()='"+text+"'])[1]")))).getText();
        Assert.assertEquals(actualText, text);
    }

}

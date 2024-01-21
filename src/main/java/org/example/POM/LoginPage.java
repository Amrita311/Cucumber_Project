package org.example.POM;

import org.example.Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BaseTest {

    @FindBy(xpath = "//input[@name='username']") private WebElement inpUsername;
    @FindBy(xpath = "//input[@name='password']") private WebElement inpPassword;
    @FindBy(xpath = "//button[@id='submit']") private WebElement btnSubmit;
    @FindBy(xpath = "//div[@id='error']") private WebElement txtLoginError;


    public LoginPage(){
        PageFactory.initElements(BaseTest.driver, this);
    }

    //Methods
    public void enterCredentials(String username , String password){

        WebDriverWait wait = new WebDriverWait(BaseTest.driver, Duration.ofMinutes(2));
        wait.until(ExpectedConditions.visibilityOf(inpUsername)).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOf(inpPassword)).sendKeys(password);
        wait.until(ExpectedConditions.visibilityOf(btnSubmit)).click();

    }


}

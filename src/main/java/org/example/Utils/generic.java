package org.example.Utils;

import org.example.Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

public class generic {

    //Common tools related method.

    /*public static void waitForElement(List<WebElement> element) throws Exception {

        Function testconditionWait = i -> element.size()>0;
        WebDriverWait wait = new WebDriverWait(BaseTest.driver, Duration.ofMinutes(2));
        try {
            wait.until(testconditionWait);
        }catch (Exception e){
            throw new Exception("Webelement is not visible exception");
        }
    }


    public static void action_Click(List<WebElement> elements) throws Exception {
        waitForElement(elements);
        elements.get(0).click();
    }

    public static void action_SendKeys(List<WebElement> elements, String value) throws Exception {
        waitForElement(elements);
        elements.get(0).sendKeys(value);

    }*/
}

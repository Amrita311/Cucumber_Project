package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.example.Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

@CucumberOptions(
        features = "src/test/java/Feature",
        glue = "org/example/StepDefinition",
        monochrome = true,
        tags = "@Login_Outline"
)
public class TestRunner extends AbstractTestNGCucumberTests {
    @BeforeClass
    public void preCondtions(){
        BaseTest.launchBrowser();
    }

    @AfterClass
    public void PostCondtions() throws InterruptedException {
        Thread.sleep(5000);
        BaseTest.driver.quit();
    }

}

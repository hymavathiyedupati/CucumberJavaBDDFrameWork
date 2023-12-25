package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;
import java.util.concurrent.TimeUnit;
public class LoginPageSteps_PF {
    WebDriver driver=null;
    LoginPage_PF login;
    HomePage_PF home;
    @Given("browser is open")
    public void browserIsOpen() {
        System.out.println("----I am inside browser is open----");
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @And("user is on login page")
    public void userIsOnLoginPage() {
        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
        System.out.println(driver.getTitle());
    }
    @When("^user enters (.*) and (.*)$")
    public void userEntersUsernameAndPassword(String username,String password) throws InterruptedException {
        login = new LoginPage_PF(driver);
        login.enterUsername(username);
        login.enterPassword(password);
        Thread.sleep(2000);
    }
    @And("user clicks on submit button")
    public void userClicksOnSubmitButton() {
        login.clickSubmit();
    }
    @Then("user is navigated to the home page")
    public void userIsNavigatedToTheHomePage() {
        home=new HomePage_PF(driver);
        Assert.assertTrue(home.checkLogOutIsDisplayed());
    }
}


package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
    @FindBy(id="username")
    WebElement txt_username;
    @FindBy(id="password")
    // @CacheLookup
    WebElement txt_password;
    @FindBy(id="submit")
    WebElement btn_submit;

    //    @FindBy(how= How.ID, using="name")
//    WebElement abc;
    WebDriver driver;
    public LoginPage_PF(WebDriver driver){
        this.driver=driver;

//        AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver,30);
//        PageFactory.initElements(factory,this);

        PageFactory.initElements(driver,this);
        //  PageFactory.initElements(driver, LoginPage_PF.class);
    }
    public void enterUsername(String username) {
        txt_username.sendKeys(username);
    }

    public void enterPassword(String password) {
        txt_password.sendKeys(password);
    }


    public void clickSubmit() {
        btn_submit.click();
    }
}

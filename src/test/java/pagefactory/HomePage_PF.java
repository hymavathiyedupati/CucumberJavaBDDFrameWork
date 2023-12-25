package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {
    @FindBy(linkText="Log out")
    WebElement btn_logout;
    WebDriver driver;
    public HomePage_PF(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        //   PageFactory.initElements(driver, HomePage_PF.class);
    }
    public boolean checkLogOutIsDisplayed(){
        return btn_logout.isDisplayed();
    }
}

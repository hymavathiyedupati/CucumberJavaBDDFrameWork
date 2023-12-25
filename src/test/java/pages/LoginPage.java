package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By txt_username = By.id("username");
    private By txt_password = By.id("password");
    private By btn_submit = By.id("submit");
    private By btn_logout = By.linkText("Log out");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        if (!driver.getTitle().equals("Test Login | Practice Test Automation")) {
            throw new IllegalStateException("This is not login page. the current page is " + driver.getCurrentUrl());
        }
    }

    public void enterUsername(String username) {
        driver.findElement(txt_username).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(txt_password).sendKeys(password);
    }


    public void clickSubmit() {
        driver.findElement(btn_submit).click();
    }

    public boolean checkLogOutIsDisplayed() {
        return driver.findElement(btn_logout).isDisplayed();
    }

    public void loginValidUser(String username, String password) {
        driver.findElement(txt_username).sendKeys(username);
        driver.findElement(txt_password).sendKeys(password);
        driver.findElement(btn_submit).click();
    }
}



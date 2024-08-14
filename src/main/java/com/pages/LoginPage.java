package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    By usernameInput = By.xpath("//input[@id='username']");
    By passwordInput = By.xpath("//input[@id='password']");
    By loginButton = By.xpath("//button[contains(text(),'Đăng nhập')]");
    By errorMessage = By.xpath("//div[@class='woocommerce-notices-wrapper']");

    // private base;

    public LoginPage(WebDriver givenDriver) {
        super(givenDriver);
        //TODO Auto-generated constructor stub
    }


    public void enterEmail(String txt){
        //        this.driver.findElement(usernameInput).sendKeys(txt);
        this.findElementByLocator(usernameInput).clear(); // By.xpath("//input[@id='username']")
        this.findElementByLocator(usernameInput).sendKeys(txt);
    }

    public void enterPassword(String txt){
        findElementByLocator(passwordInput).clear();
        findElementByLocator(passwordInput).sendKeys(txt);
    }


    public void clickLogin(){
        findElementByLocator(loginButton).click();
    }

    public String getErrorMessage(){
        return findElementByLocator(errorMessage).getText();
    }
    

}

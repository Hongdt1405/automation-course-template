package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {

    static By usernameInput = By.xpath("//input[@id='reg_email']");
    static By passwordInput = By.xpath("//input[@id='reg_password']");
    By RegisterButton = By.xpath("//button[contains(text(),'Đăng ký')]");
    By errorMessage = By.xpath("//div[@class='woocommerce-notices-wrapper']");

    public RegisterPage(WebDriver givenDriver) {
        super(givenDriver);
        //TODO Auto-generated constructor stub
    }


    public void enterEmail(String txt){
        //        this.driver.findElement(usernameInput).sendKeys(txt);
        this.findElementByLocator(usernameInput).clear(); // By.xpath("//input[@id='username']")
        this.findElementByLocator(usernameInput).sendKeys(txt);
    }

    public void enterPassword(String txt){
        this.findElementByLocator(passwordInput).clear();
        this.findElementByLocator(passwordInput).sendKeys(txt);
    }


    public void clickRegister()
    {
        this.findElementByLocator(RegisterButton).click();
    }

    public String getErrorMessage(){
        return this.findElementByLocator(errorMessage).getText();
    }


    
   
    
    

}

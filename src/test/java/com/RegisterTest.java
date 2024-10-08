package com;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.utils.BasicTest;
import com.utils.Utils;

public class RegisterTest extends BasicTest {


    // @Test()
    public void RegisterTestSuccess() throws Exception {
        // Launch website
        String url = "https://bantheme.xyz/hathanhauto/tai-khoan/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);


        // Enter username

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hongdo14051995@gmail.com");
        Utils.hardWait(); // 3s

        // Enter password
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Mincao@1405");
        Utils.hardWait();

        // Click login
        driver.findElement(By.xpath("//button[@name='login']")).click();
        Utils.hardWait();
        // Verify
        // Boolean displayed;
        
        // try {
        //     displayed = driver.findElement(By.xpath("//button[@name='login']")).isDisplayed();
        // } catch (Exception e ){
        //     displayed = false;
        // };
        


        // Assert.assertFalse(displayed);


        String errorMessage;

        try {

            errorMessage = driver.findElement(By.xpath("//ul[@class='woocommerce-error']")).getText();
        } catch (Exception e ){
            errorMessage = "";
        };

        Assert.assertEquals(errorMessage, "");
    }

    //@Test()
    public void RegisterTestFailedEmail() throws Exception {
        // Launch website
        String url = "https://bantheme.xyz/hathanhauto/tai-khoan/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);


        // Enter email

         driver.findElement(By.xpath("//input[@id='reg_email']")).sendKeys("mincaodt@gmail.com");
        // Utils.hardWait(); // 3s

        // Enter password
       // driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Mincao@1405");
        Utils.hardWait();

        // Click register
        driver.findElement(By.xpath("//button[@name='register']")).click();
        Utils.hardWait();
        // Verify
        
        String errorMessage;

        try {

            errorMessage = driver.findElement(By.xpath("//ul[@class='woocommerce-error']")).getText();
        } catch (Exception e ){
            errorMessage = "Lỗi: Vui lòng nhập mật khẩu tài khoản.";
        };
        
    }
        @Test()
        public void RegisterTestFailedpwd() throws Exception {
            // Launch website
            String url = "https://bantheme.xyz/hathanhauto/tai-khoan/";
            driver.get(url);
            Assert.assertEquals(driver.getCurrentUrl(), url);
    
    
            // Enter username
    
             //driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hongdo14051995@gmail.com");
            // Utils.hardWait(); // 3s
    
            // Enter password
            driver.findElement(By.xpath("//input[@id='reg_password']")).sendKeys("Mincao@1405");
            Utils.hardWait();
    
            // Click register
            driver.findElement(By.xpath("//button[@name='register']")).click();
            Utils.hardWait();
            // Verify
            
            String errorMessage;
    
            try {
    
                errorMessage = driver.findElement(By.xpath("//div[@class='woocommerce-notices-wrapper']")).getText();
            } catch (Exception e ){
                errorMessage = "";
            };
            

        Assert.assertEquals(errorMessage, "Lỗi: Vui lòng cung cấp địa chỉ email hợp lệ.");


    }

}

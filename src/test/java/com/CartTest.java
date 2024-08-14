package com;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.utils.BasicTest;
import com.utils.Utils;

public class CartTest extends BasicTest {


     @Test()
    public void CardSuccess() throws Exception {
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
        


        // click search 
        driver.findElement(By.xpath("(//input[@id='s'])[1]")).sendKeys("Merc");
        Utils.hardWait();




        // Lấy sản phẩm đầu tiên
        driver.findElement(By.xpath("//*[contains(text(),'Bơm nước xe ')]")).click();;
        Utils.hardWait();


       // Nhấn chọn
        String xpathExpression;
        driver.findElement(By.xpath("//option[@value='england']")).click();

        

       // Nhấn thêm vào giỏ hàng
       driver.findElement(By.xpath("//button[contains(text(),'Thêm vào giỏ hàng')]")).click();


       // tu dong vo link gp hang
       // Check tồn tại của sản phẩm


    String ProductName=driver.findElement(By.xpath("//td[@class='product-name']")).getText();
    Assert.assertEquals(ProductName,"Bơm nước xe Mercedes SLK200, SLK300, GLK200, E260, C350-2742000207 - England");




    }

    
}


       
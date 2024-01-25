package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TipCaluclatorproject {
    public WebDriver driver;
    @Test(priority = 1)
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://qatipcalc.ccbp.tech/");
        driver.manage().window().maximize();
        //Test the tip calculation.:
        WebElement l1= driver.findElement(By.xpath("//input[@id='billAmount']"));
        l1.sendKeys("1000");
        WebElement l2= driver.findElement(By.xpath("//input[@id='percentageTip']"));
        l2.sendKeys("12");
        WebElement l3= driver.findElement(By.xpath("//button[@id='calculateButton']"));
        l3.click();
        WebElement l4= driver.findElement(By.xpath("//p[@id='tipAmount']"));
        String str1=l4.getText();
        WebElement l5= driver.findElement(By.xpath("//p[@id='totalAmount']"));
        String str2=l5.getText();
        if(str1==str2){
            System.out.println("Tip Caluclation is Correctly");
        }else{
            System.out.println("Tip Caluclation is not Incorrectly");
        }
        driver.quit();
    }
    //Test the display of error message for no inputs.
    @Test(priority = 2)
    public void openbrowser(){
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://qatipcalc.ccbp.tech/");
        driver.manage().window().maximize();
        WebElement l1= driver.findElement(By.xpath("//button[@id='calculateButton']"));
        l1.click();
        WebElement l2= driver.findElement(By.xpath("//p[@id='errorMessage']"));
        String str1=l2.getText();
        String str2="Please Enter a Valid Input.";
        if(str1.equals(str2)){
            System.out.println("Test Case is Passed");
        }else{
            System.out.println("Test Case is Failed");
        }
        driver.quit();
    }
    @Test(priority = 3)
    public void thirdsetup(){
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://qatipcalc.ccbp.tech/");
        driver.manage().window().maximize();
        WebElement l1= driver.findElement(By.xpath("//input[@id='percentageTip']"));
        l1.sendKeys("10.0f");
        WebElement l2= driver.findElement(By.xpath("//button[@id='calculateButton']"));
        l2.click();
        WebElement l3= driver.findElement(By.xpath("//p[@id='errorMessage']"));
        String str1=l3.getText();
        String str2="Please Enter a Valid Input.";
        if(str1.equals(str2)){
            System.out.println("Test Case is Passed");
        }else{
            System.out.println("Test case is not Passed");
        }
        driver.quit();
    }

}

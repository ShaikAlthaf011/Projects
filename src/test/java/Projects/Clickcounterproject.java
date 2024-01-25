package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Clickcounterproject {

    public WebDriver driver;
    @Test
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://qaclickcounter.ccbp.tech/");
        driver.manage().window().maximize();
        WebElement l1= driver.findElement(By.xpath("//button[@class='button']"));
        for(int i=0;i<100;i++){
            l1.click();
        }
        WebElement l2= driver.findElement(By.xpath("//span[@class='counter-value']"));
        String str1="100";
        String str2=l2.getText();
        System.out.println(str2);
        if(str1.equals(str2)){
            System.out.println("Test is Passed");
        }else{
            System.out.println("Test is not Passed");
        }
        driver.quit();
    }
}

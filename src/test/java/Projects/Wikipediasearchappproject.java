package Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Wikipediasearchappproject {
    public WebDriver driver;
@Test
public void setup(){
    System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
    driver=new ChromeDriver();
    driver.navigate().to("https://qawikisearch.ccbp.tech/");
    driver.manage().window().maximize();
    WebElement e1=driver.findElement(By.xpath("//input[@id='searchInput']"));
    e1.sendKeys("HTML");
    WebElement e2=driver.findElement(By.xpath("//button[@id='submitButton']"));
    e2.click();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='searchResults']/div")));
    List<WebElement> list=driver.findElements(By.xpath("//div[@id='searchResults']/div"));
    System.out.println(list.size()+" Results Found");
    driver.quit();
}
}

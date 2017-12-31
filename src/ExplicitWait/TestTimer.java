package ExplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestTimer {

public static void main(String args[]){
System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    
    driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_timing2");
    
    driver.switchTo().frame("iframeResult");//switch to result frame
    
    driver.findElement(By.xpath("//button[text()='Try it']")).click();//click on try it button
    
    WebDriverWait wait=new WebDriverWait(driver, 6);
    
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='6 seconds']")));//adding explicit wait
    
    Boolean flag=driver.findElement(By.xpath("//p[text()='6 seconds']")).isDisplayed();
    
    System.out.println(flag);
	}

}

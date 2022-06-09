package week5day5assign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Download the Driver And setup the Path
        WebDriverManager.edgedriver().setup();
        //launch the Browser
        EdgeOptions option=new EdgeOptions();
        option.addArguments("--disable-notifications");
        EdgeDriver driver=new EdgeDriver();
        //Maximize the browser
        driver.manage().window().maximize();
        //go to URL
        driver.get("https://www.snapdeal.com/");
        //Implicity wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        WebElement element = driver.findElement(By.linkText("Men's Fashion"));
        Actions builder=new Actions(driver);
        builder.moveToElement(element).perform();
        driver.findElement(By.className("linkTest")).click();
        
        String text = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
        System.out.println(text);
       
       }
}

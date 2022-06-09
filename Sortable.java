package week5day5asign;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Download the Driver And Setup the Path
        WebDriverManager.edgedriver().setup();
        //launch the browser
        EdgeDriver driver=new EdgeDriver();
        //get URL
        driver.get("http://www.leafground.com/pages/sortable.html");
        //maximize the window
        driver.manage().window().maximize();
        //implicity wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        //get Item list
        List<WebElement> Item = driver.findElements(By.xpath("(//div[@id='mydiv']//li)"));
        WebElement Item2 = Item.get(1);
        WebElement Item5 = Item.get(4);
        
        //sort Item2 in Item5
        Actions build=new Actions(driver);
        build.clickAndHold(Item2).moveToElement(Item5).release().perform();
        
       
	}
}

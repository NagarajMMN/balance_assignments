package week5day5asign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dragg {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	    WebElement ele = driver.findElement(By.id("draggable"));
	    WebElement ell1 = driver.findElement(By.id("droppable"));
	    Actions build=new Actions(driver);
	    build.dragAndDrop(ele, ell1).perform();
	    
	}
}

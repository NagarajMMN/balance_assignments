package week5day5asign;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Disappear {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Download the Driver And Setup the Path
        WebDriverManager.edgedriver().setup();
        //launch the browser
        EdgeDriver driver=new EdgeDriver();
        //get URL
        driver.get("http://www.leafground.com/pages/appear.html");
        //maximize the window
        driver.manage().window().maximize();
        //implicity wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        WebElement Ele= driver.findElement(By.id("btn"));
        //Explicity wait
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(Ele));
        //Take Snapshot
        File source = driver.getScreenshotAs(OutputType.FILE);
        File Destination=new File("./snap/img.png");
        FileUtils.copyFile(source, Destination);
        
      
        
        

	}
}

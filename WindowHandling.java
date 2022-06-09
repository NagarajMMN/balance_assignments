package week5day2assign;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.id("home")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> openWindow=new ArrayList<String>(windowHandles);
		driver.switchTo().window(openWindow.get(1));
		driver.findElement(By.xpath("//h5[text()='Edit']")).click(); 
		 String title="TestLeaf - Interact with Edit Fields"; 
		 String title2 = driver.getTitle(); 
		  if(title.equals(title2)) { 
		  System.out.println("Switched to another window"); 
		   }else { 
		  System.out.println("Controll not switched"); 
		  }
		  driver.close();
		  driver.switchTo().window(parentWindow);
		  driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		  int size = driver.getWindowHandles().size();
		  System.out.println("size"+size);
		
}
}

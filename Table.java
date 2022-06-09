package week5day5asign;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Download the Driver And Setup the Path
        WebDriverManager.edgedriver().setup();
        //launch the browser
        EdgeDriver driver=new EdgeDriver();
        //get URL
        driver.get("http://www.leafground.com/pages/table.html ");
        //maximize the window
        driver.manage().window().maximize();
        //implicity wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       
        //Number of Row
        List<WebElement> row = driver.findElements(By.xpath("//div[@id='contentblock']//table//tr//td[2]"));
        int size = row.size();
        System.out.println("Number of Rows :"+" "+ size);
        
        //Number of Column
        List<WebElement> Column = driver.findElements(By.xpath("//div[@id='contentblock']//table//th"));
        int size2 = Column.size();
        System.out.println("Number of Column :"+" "+ size2);
        System.out.println("********************************");
        
        //Get the progress value of 'Learn to interact with Elements'
        System.out.println("Get the progress value of 'Learn to interact with Elements'");
        for (int i = 1; i <size; i++) {
        	String text = row.get(i).getText();
        	System.out.println(text);
			}
        System.out.println("************************************");
        
        //Check the vital task for the least completed progress.
        driver.findElement(By.xpath("//div[@id='contentblock']//table//tr[6]//td[3]")).click();
        System.out.println("Least completed progress value is checked");
	}
}

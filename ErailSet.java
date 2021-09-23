package week3.day2;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSet {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://erail.in/");
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("Ms"+Keys.TAB);
		
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("MDU"+Keys.TAB);
		
		Thread.sleep(1000);
		
		List<WebElement> list1=driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]"));
		
		System.out.println("ovaerall rail name : "+list1.size());
		
		Set<String> se1=new HashSet<String>();
		
		for (WebElement webElement : list1) {
			
			String text=webElement.getText();
			
			se1.add(text);
			
		}
		
		System.out.println("without duplicate  rail name : "+se1.size());

	}

}

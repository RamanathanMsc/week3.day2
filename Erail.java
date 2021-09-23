package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

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
		
		System.out.println(list1.size());
		
		List<String> list2=new ArrayList<String>();
		
		for (WebElement webElement : list1) {
			
			String text=webElement.getText();
			
			list2.add(text);
			
			//System.out.println(text);
			
			
		}

		Collections.sort(list2);
		
		for (String string : list2) {
			
			System.out.println(string);
		}

	}

}

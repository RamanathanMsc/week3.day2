package week3.day2;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.ajio.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags"+Keys.ENTER);
		
		driver.findElement(By.xpath("//label[@for='Men']")).click();		
		
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();	
		
		String text= driver.findElement(By.xpath("//div[@class='length']")).getText();
		
		System.out.println(text);
		List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
		System.out.println(" Size :" + bagBrandList.size());
		
		for (WebElement webElement : bagBrandList) {
			
			String name=webElement.getText();
			System.out.println(name);
		}
		
	}

}

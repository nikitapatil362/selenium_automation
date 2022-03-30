package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstWebDriverScripting3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.adactinhotelapp.com");
		driver.manage().window().minimize();
		WebElement uname = driver.findElement(By.cssSelector("#username"));
		uname.sendKeys("Nikitapatil16");
		driver.findElement(By.cssSelector("#password")).sendKeys("Nikitapatil@362");
		driver.findElement(By.cssSelector("#login")).click();
		driver.quit();
	}


	}




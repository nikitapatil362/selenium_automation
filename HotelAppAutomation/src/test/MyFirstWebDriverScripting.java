package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstWebDriverScripting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//importing web page
		driver.get("http://www.adactinhotelapp.com");
		driver.manage().window().minimize();		//for window minimize
		//locate element or find element
		WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys("Nikitapatil16");
		driver.findElement(By.id("password")).sendKeys("Nikitapatil@362");
		driver.findElement(By.id("login")).click();
		
		driver.quit();
	}

}

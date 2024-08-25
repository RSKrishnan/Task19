package org.loc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuviLocators {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guvi.in/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// By using 'id'
		// driver.findElement(By.id("name")).sendKeys("Krishna");

		// By using cssSelector tagName#id
		// driver.findElement(By.cssSelector("input#name")).sendKeys("Krishna");

		// By using cssSelector tagName.className
		driver.findElement(By.cssSelector("input.form-control")).sendKeys("Krishna");

		// By using cssSelector value
		driver.findElement(By.cssSelector("#password")).sendKeys("Krishna");

		// By using className
		// driver.findElement(By.className("form-control")).sendKeys("Krishna");

		// By using xpath
		// driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Krishna");

		// By using text
		// driver.findElement(By.xpath("//a[text()='Sign Up']")).click();

		// By using parent child relationship
		// driver.findElement(By.xpath("//div[@id='emailgroup']/input")).sendKeys("rama@1234.com");

		// By using cssSelector tagName[attribute=value]
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("rama@1234.com");

		// By using xpath contains
		driver.findElement(By.xpath("//a[contains(@class,'btn signup-btn')]")).click();

		// by using linkText
		// driver.findElement(By.linkText("Login")).click();

		// by using PartiallinkText
		driver.findElement(By.partialLinkText("Lo")).click();
	}

}

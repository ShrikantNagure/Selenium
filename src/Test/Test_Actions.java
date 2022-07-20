package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_Actions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();

		//mouse movement hover
		WebElement selenium_btn=driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[1]"));
		
		Actions act=new Actions(driver);  //method over loading once declared u can use many times
		act.moveToElement(selenium_btn).click().build().perform();
		
		//Drag and drop
		
		WebElement src_element=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement dest_element=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		act.dragAndDrop(src_element, dest_element).perform();
		
		
	}

}

package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Autosuggestions {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	WebElement searchbar=driver.findElement(By.xpath("//input[@name='q']"));
	searchbar.sendKeys("Maven");
	Thread.sleep(3000);
	
	List<WebElement> autolist=driver.findElements(By.xpath("//ul[@class='erkvQe']//li")); // more elements 
	System.out.println(autolist.size()); //no. of autosuggestions 
	Thread.sleep(3000);
	
	System.out.println(autolist.get(4).getText());
	
	for(int i=0; i<autolist.size();i++){
		 String textlist=autolist.get(i).getText();
		 
		 System.out.println(textlist);
		 if(textlist.equals("maven central repository"))
			 autolist.get(i).click();
	}
	
	
	}

}

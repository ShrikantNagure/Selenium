package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_Dropdown {

	public static void main(String[] args) {

		String chromepath= "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		WebElement drpelement=driver.findElement(By.xpath("//select[@name='dropdown-class-example']"));
		Select s=new Select(drpelement);
		//s.selectByIndex(1);
		//s.selectByValue("option2");
		s.selectByVisibleText("Option3");
	}

}

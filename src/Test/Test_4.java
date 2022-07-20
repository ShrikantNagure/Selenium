package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_4 {

	public static void main(String[] args) throws InterruptedException {

		String chromepath= "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login");
		driver.manage().window().maximize();
		
		WebElement txt_email= driver.findElement(By.xpath("//input[@id='email']"));
		WebElement txt_password=driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement btn_login=driver.findElement(By.xpath("//button[@id='loginbutton']"));
		
		if(txt_email.isEnabled()==true && txt_email.isDisplayed()==true) { //boolean values
		txt_email.sendKeys("Test");
		}
		
		txt_password.sendKeys("Mighty@412");
		btn_login.click();
		
		//WebElement btn_logout= driver.findElement(By.xpath("//span[@dir='auto']"));
		//btn_logout.click();)
		Thread.sleep(3000);
		//driver.close();
	}

}

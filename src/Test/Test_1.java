package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_1 {

	public static void main(String[] args) throws InterruptedException   {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); // object creation
		driver.get("bugspotter.in"); // to open specific website
		driver.manage().window().maximize(); //to maximize the window
		
		System.out.println(driver.getTitle()); // to get title
		System.out.println(driver.getCurrentUrl()); //to get current url
		Thread.sleep(6000); //wait for 6 seconds
		driver.close(); //to close driver
	}

}

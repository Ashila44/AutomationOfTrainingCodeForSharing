package PeopleNTech.AutomationTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IBrowserWorking
{
	static WebDriver driver; // WebDriver is an Interface, "driver" is its reference...
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		//i) How to open browser
		//ii) How to open the browser
		// Open src folder, drivers folder and right click on chromedriver.exe and select properties and copy path...
		System .setProperty("webdriver.chrome.driver", "C:\\Users\\eRisheXpress\\Documents\\PnT Files\\Selenium\\"
				+ "PracticeFiles\\AutomationTraining\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		String windowhandle = driver.getWindowHandle();
		System.out.println(windowhandle);
		String urlOfBrowser = driver.getCurrentUrl();
		System.out.println(urlOfBrowser);
		driver.close();
		
		
		
		
		
	
		
		
		

	}

}

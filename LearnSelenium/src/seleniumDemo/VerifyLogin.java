package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		String expectedtitle="Demo Web Shop. Login";
		String actualtitle=driver.getTitle();
		
		System.out.println(actualtitle);

		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("You are on the correct page");
		
		  
		driver.findElement(By.id("Email")).sendKeys("anjana.p@gmail.com");
	    driver.findElement(By.name("Password")).sendKeys("0987654321");
	    driver.findElement(By.xpath("//input[@value='Log in']")).click();
	    driver.findElement(By.linkText("Log out")).click();
	  
		}
		else 
		{
			System.out.println("You are on the wrong page");
			driver.close();
		}
		   
	}
}


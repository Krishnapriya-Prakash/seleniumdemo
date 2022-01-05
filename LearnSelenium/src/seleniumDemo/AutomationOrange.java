package seleniumDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationOrange {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver\",\"C:\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        
        driver.findElement(By.name("txtUsername")).sendKeys("Admin");
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
        
        driver.findElement(By.xpath("//input[@value='LOGIN']")).click();      //Login page
        
        driver.findElement(By.xpath("//a[@id='welcome']")).click();           //Drop box link
        
        WebDriverWait mywait=new WebDriverWait(driver, 10);
 


        mywait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
        
        
        driver.findElement(By.linkText("Logout")).click();                    //Logout page Link
        
        driver.close();
        
		
	}

}

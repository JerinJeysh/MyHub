package seleniumTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class OpenGoogle {
	 static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jerin\\Downloads\\Compressed\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
	    driver.findElement(By.name("q")).sendKeys("Whatsup Duck!");
	    driver.findElement(By.name("q")).submit();
	    driver.quit();

	}

}

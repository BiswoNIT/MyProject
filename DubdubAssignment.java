import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DubdubAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://z3t0c9.csb.app/");
		
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("abc123@gmail.com");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		pwd.sendKeys("abc123");
		
		driver.findElement(By.xpath("//button[@style='margin-top: 10px;']"));
		
		

	}

}

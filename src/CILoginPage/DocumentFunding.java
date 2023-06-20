package CILoginPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DocumentFunding {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91967\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://citest.crowdinvest.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement CIEmail = driver.findElement(By.xpath("//input[@id='floating_outlined_email']"));
		CIEmail.sendKeys("yocewi9672@byorby.com");
		
		WebElement CIPassword = driver.findElement(By.xpath("//input[@id='floating_outlined_password']"));
		CIPassword.sendKeys("Sample@123");
		
		WebElement ClLogin = driver.findElement(By.xpath("//p[@class='text-white text-btn font-normal']"));
		ClLogin.click();
		Thread.sleep(15000);
		
		WebElement SubmitButton = driver.findElement(By.xpath("//button[@class='lg:w-[80px] lg:h-[35px] rounded-[5px] font-[700] text-[#2626EA] bg-[#A8EFED]']"));
		SubmitButton.click();
		Thread.sleep(1000);
				
		//Alert alert = driver.switchTo().alert();
		//alert.accept();
		Thread.sleep(4000);
		
		WebElement dragDropField = driver.findElement(By.xpath("(//div[@tabindex=\"0\"])[1]"));
		Thread.sleep(2000);
		String filePath = "C:\\Users\\91967\\Desktop\\CI Screenshot\\document docs repeat.pdf";
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(dragDropField, 0, 0).build().perform();
		Thread.sleep(2000);
		Thread.sleep(2000);
		WebElement fileInput = dragDropField.findElement(By.xpath("(//input[@type=\"file\"])[1]"));
		Thread.sleep(2000);
		fileInput.sendKeys(filePath);
	}	
}

	
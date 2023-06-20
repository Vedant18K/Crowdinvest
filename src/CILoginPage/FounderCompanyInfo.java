package CILoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FounderCompanyInfo {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91967\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("http://localhost:3000/login");
		
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
		
		WebElement CompIsCorp = driver.findElement(By.xpath("//select[@id='isIncorp']"));
		Select S10 = new Select(CompIsCorp);
		S10.selectByVisibleText("No");
		
		Thread.sleep(12000);
		
		WebElement Countryofregistered = driver.findElement(By.xpath("//select[@name='countryReg']"));
	//	Select S11 = new Select(Countryofregistered);
		Countryofregistered.click();
		Countryofregistered.sendKeys("India");
		
	//	S11.selectByVisibleText("india");
		
		WebElement NameofComp = driver.findElement(By.xpath("//input[@name='name']"));
		NameofComp.sendKeys("Automation Testing");
		
		WebElement NameofBrand = driver.findElement(By.xpath("//input[@name='brandName']"));
		NameofBrand.sendKeys("Selenium");
		
		WebElement Revenue = driver.findElement(By.xpath("//input[@name='revenue']"));
		Revenue.sendKeys("52625");
		
		Thread.sleep(1000);
		WebElement RevenueModel = driver.findElement(By.xpath("//select[@name='revenueModel']"));
		Select S12 = new Select(RevenueModel);
		S12.selectByVisibleText("Advertising Model");
		Thread.sleep(1000);
		WebElement BusinessModel = driver.findElement(By.xpath("//select[@name='Select Businss Model']"));
		Select S13 = new Select(BusinessModel);
		S13.selectByVisibleText("B2B");
		Thread.sleep(1000);
		WebElement Stage = driver.findElement(By.xpath("//select[@name='stage']"));
		Select S14 = new Select(Stage);
		S14.selectByVisibleText("Pre-Product");
		Thread.sleep(1000);
		WebElement CompEnterAddress1 = driver.findElement(By.xpath("//input[@name='address1']"));
		CompEnterAddress1.sendKeys("TV Center");
		
		WebElement CompEnterAddress2 = driver.findElement(By.xpath("//input[@name='address2']"));
		CompEnterAddress2.sendKeys("Aurangabad");
		
		WebElement CompCountry= driver.findElement(By.xpath("//select[@name='country']"));
		Select S7 = new Select(CompCountry);
		S7.selectByVisibleText("India");
		Thread.sleep(1000);
		
		WebElement CompState= driver.findElement(By.xpath("//select[@name='state']"));
		Select S8 = new Select(CompState);
		S8.selectByVisibleText("Maharashtra");
		Thread.sleep(1000);
		
		WebElement CompCity_County= driver.findElement(By.xpath("//select[@name='city']"));
		Select S9 = new Select(CompCity_County);
		S9.selectByVisibleText("Aurangabad");
		Thread.sleep(1000);	
		
		WebElement CompEnterPostalcode = driver.findElement(By.xpath("//input[@name='postCode']"));
		CompEnterPostalcode.sendKeys("431003");
		

		WebElement Synopsis = driver.findElement(By.xpath("//textarea[@name='synopsis']"));
		Synopsis.sendKeys("Automation testing with selenium ");
		
		WebElement Tagline = driver.findElement(By.xpath("//input[@name='tagLine']"));
		Tagline.sendKeys("Easiest way to do testing ");
		Thread.sleep(1000);
	
		WebElement Sector  = driver.findElement(By.xpath("//div[@class=' css-b62m3t-container']"));
		Sector.click();
		
		Actions action = new Actions(driver);
		action.keyDown(Sector,Keys.ENTER).sendKeys("Consumer").keyDown(Keys.ENTER).build().perform();
//		//action.keyUp(Keys.SHIFT).build().perform();

//		WebElement SectorChoose = driver.findElement(By.xpath("//div[@class=' css-kvi6pe-control']"));
//		SectorChoose.sendKeys("Medtech");
//		
		Thread.sleep(10000);
		
		WebElement Website = driver.findElement(By.xpath("//input[@name='website']"));
		Website.sendKeys("www.sdlccorp.com");
		
		WebElement CompanyProceed = driver.findElement(By.xpath("//div[@class='flex justify-center items-center flex-row w-[160px] h-[45px] bg-gradient-to-r from-[#2626F4] hover:bg-gradient-to-r active:bg-gradient-to-r  active:from-[#00DDE2] active:to-[#2626F4] hover:from-[#2626F4] hover:to-[#00DDE2] to-[#171795] rounded-[10px]  undefined undefined']"));
		CompanyProceed.click();
		Thread.sleep(10000);
		

		WebElement fileInput = driver.findElement(By.xpath("//div[@id='lblpitchDeck']"));
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].click();", fileInput);
		Thread.sleep(1000);
		fileInput.sendKeys("C:\\Users\\91967\\Desktop\\CI Screenshot\\document docs repeat.pdf");
		Thread.sleep(1000);
		
		WebElement thumbnailinput = driver.findElement(By.xpath("//p[@class='text-inputBorder text-center']"));
		
		jsExecutor.executeScript("arguments[0].click();", thumbnailinput);
		Thread.sleep(1000);
		thumbnailinput.sendKeys("C:\\Users\\91967\\Desktop\\CI Screenshot\\t_500x300.jpeg");
		Thread.sleep(1000);
		
		WebElement proceed = driver.findElement(By.xpath("//p[@class='text-white text-btn font-normal']"));
		proceed.click();
	}
}

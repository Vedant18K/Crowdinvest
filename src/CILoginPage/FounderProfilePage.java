package CILoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FounderProfilePage {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91967\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		Thread.sleep(1000);
		driver.get("http://localhost:3000/login");
		
		driver.manage().window().maximize();
		WebElement CIEmail = driver.findElement(By.xpath("//input[@id='floating_outlined_email']"));
		CIEmail.sendKeys("yocewi9672@byorby.com");
		WebElement CIPassword = driver.findElement(By.xpath("//input[@id='floating_outlined_password']"));
		CIPassword.sendKeys("Sample@123");
		WebElement ClLogin = driver.findElement(By.xpath("//p[@class='text-white text-btn font-normal']"));
		ClLogin.click();
		
		Thread.sleep(10000);
		//driver.get("http://localhost:3000/investor/socialfeeds");//Social Feed
		
		WebElement SubmitButton = driver.findElement(By.xpath("//button[@class='lg:w-[80px] lg:h-[35px] rounded-[5px] font-[700] text-[#2626EA] bg-[#A8EFED]']"));
		SubmitButton.click();
		
	//	WebElement FounderOnBoarding = driver.findElement(By.xpath("//div[@class='flex justify-center place-content-center']"));
	//	FounderOnBoarding.click();
		
	//	WebElement declarationCheckbox = driver.findElement(By.xpath("//input[@class='m-auto mt-1 accent-color-[#232323] border-4 ']"));
	//	declarationCheckbox.click();
		
	//	WebElement AgreeandContinue = driver.findElement(By.xpath("//p[@class='text-white text-btn font-normal']"));
	//	AgreeandContinue.click();
		Thread.sleep(10000);

		WebElement EnterDesignation = driver.findElement(By.xpath("//input[@placeholder='Enter Designation']"));
		EnterDesignation.sendKeys("CEO");
		
		Thread.sleep(10000);

		WebElement EnterMobile = driver.findElement(By.xpath("//input[@placeholder='Enter phone number']"));
		EnterMobile.clear();
		EnterMobile.sendKeys("+919673505528");
		
		WebElement EnterDOB = driver.findElement(By.xpath("//input[@placeholder='Select Date Of Birth']"));
		EnterDOB.sendKeys("22/04/1999");
		
		WebElement Nationality = driver.findElement(By.xpath("//select[@name=\"nationality\"]"));
		Select S1 = new Select(Nationality);
		S1.selectByVisibleText("India");
		
		WebElement CountryofResidenceasNationality = driver.findElement(By.xpath("//select[@name='corSame']"));
		Select S2 = new Select(CountryofResidenceasNationality);
		S2.selectByVisibleText("Yes");
		Thread.sleep(1000);
		
		WebElement Gender = driver.findElement(By.xpath("//select[@name='gender']"));
		Select S3 = new Select(Gender);
		S3.selectByVisibleText("Male");
		Thread.sleep(1000);
		
		WebElement EnterCalendlyLink = driver.findElement(By.xpath("//input[@placeholder='Enter Calendly Link']"));
		EnterCalendlyLink.sendKeys("https://calendly.com/mayurikundalwal7121/30min");
		
		WebElement EnterAddress1 = driver.findElement(By.xpath("//input[@name='address1']"));
		EnterAddress1.sendKeys("TV Center");
		
		WebElement EnterAddress2 = driver.findElement(By.xpath("//input[@name='address2']"));
		EnterAddress2.sendKeys("Aurangabad");
		
		WebElement Country= driver.findElement(By.xpath("//select[@name='country']"));
		Select S4 = new Select(Country);
		S4.selectByVisibleText("India");
		Thread.sleep(1000);
		
		WebElement State= driver.findElement(By.xpath("//select[@name='state']"));
		Select S5 = new Select(State);
		S5.selectByVisibleText("Maharashtra");
		Thread.sleep(1000);
		
		WebElement City_County= driver.findElement(By.xpath("//select[@name='city']"));
		Select S6 = new Select(City_County);
		S6.selectByVisibleText("Aurangabad");
		Thread.sleep(1000);
				
		
		WebElement EnterPostalcode = driver.findElement(By.xpath("//input[@name='postCode']"));
		EnterPostalcode.sendKeys("431003");
		
		WebElement Proceed = driver.findElement(By.xpath("//p[@class='text-white text-btn font-normal']"));
		Proceed.click();
		
		System.out.println("Profile page successfully run");
		
		
		
		
	}
	}

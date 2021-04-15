package noon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	
	
	
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
	
System.setProperty("webdriver.chrome.driver","C://Users//Sandeep//Downloads//chromedriver_win32//chromedriver.exe");
		
		
		
		driver = new ChromeDriver();
		
		
		
		driver.get("https://www.noon.com/uae-en/");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		WebElement e =driver.findElement(By.xpath("(//*[@class='sc-dlfnbm eFXxew'])[1]"));
		
		js.executeScript("arguments[0].scrollIntoView()",e);
		
		
		Thread.sleep(5000);
		
	/*	
		WebElement firstelment =driver.findElement(By.xpath("(//div[@class='swiper-wrapper'])[2]"));
		
		
	List<WebElement> listswipes= 	firstelment.findElements(By.tagName("div"));
	
	
	System.out.println(listswipes.size());
	
		
WebElement tex =	listswipes.get(2).findElement(By.xpath("//div[@class='kcs0h5-0 diNcmV grid']"));


System.out.println(tex.getAttribute("title"));*/
		
		
	WebElement er = driver.findElement(By.xpath("(//div[@class='swiper-slide swiper-slide-active'])[2]"));
	
	List<WebElement>eb =er.findElements(By.tagName("div"));
	
	
	
		
		
		
		System.out.println(eb.size());

	}

}

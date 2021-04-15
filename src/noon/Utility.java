package noon;

import java.awt.Window;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Utility {
	
	
	public static  WebDriver driver;
	
	
	
	
	public static void main(String [] args) throws Exception
	{
		
		
		
		
	System.setProperty("webdriver.chrome.driver","C://Users//Sandeep//Downloads//chromedriver_win32//chromedriver.exe");
		
		
		
		driver = new ChromeDriver();
		
		
		
		driver.get("https://www.noon.com/uae-en/");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
	/*	while(2>1)
		{
			
			try
			{
				driver.findElement(By.xpath("(//div[@class='sc-gsTCUz bhdLno'])[1]/h3"));			
			break;
			}
			
			
			
			catch(Exception e)
			{
				
				js.executeScript("window.scrollBy(0,200)");
				
				Thread.sleep(3000);
				
				
			}
		}
		*/
		
		
	WebElement f =	driver.findElement(By.xpath("(//div[@class='sc-gsTCUz bhdLno'])[1]/h3"));	
		
	js.executeScript("arguments[0].scrollIntoView(true);",f);
		
	
		Thread.sleep(3000);
		
	List	<WebElement> siz =driver.findElements(By.xpath("((//div[@class='swiper-container swiper-container-initialized swiper-container-horizontal'])[2]/div/child::div)"));
		
		System.out.println(siz.size());
		
	
		

		
		
		
	int count=0;
	int var =7;
		
		
		
		
for(int i=1;i<=40;i++)
{
	
	WebElement e20= driver.findElement(By.xpath("((//div[@class='swiper-container swiper-container-initialized swiper-container-horizontal'])[2]/child::*/div)["+i+"]//div[@class='e3js0d-11 liZdac']"));
	System.out.println(e20.getText());
	
	count= count+1;
	
	if(count ==var)
	{
		
		try
		{
		
	WebElement e12 =	driver.findElement(By.xpath("(//div[contains(@class,'swiper-button-next custom-navigation swiper-nav-')])[1]"));
		
		e12.isDisplayed();
		
		e12.click();
		
		Thread.sleep(5000);
		
		
		
		var=var+7;
		
		
		}
		
		catch(Exception e11)
		{
			
			
			break;
			
		}
	}
	
	
	
	
	
}
		
		
		
		
		
		
		
		
		
	}
}
	
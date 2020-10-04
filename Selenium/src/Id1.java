import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.*;


public class Id1 
	{
public static void main(String[] args)
{
	String url="https://www.flipkart.com/";
	WebDriver driver=new FirefoxDriver();
	driver.get(url);
	//driver.manage().window().maximize();
	//WebElement email=driver.findElement(By.id("identifierId"));
	//email.sendKeys("ranjan.jyoti.2014@gmail.com");;
	WebElement login=driver.findElement(By.className("_3Ep39ldas"));
	login.click();
	//WebElement email=driver.findElement(By.className("_2zrpKA _1dBPDZ"));
	//email.sendKeys("7749899171");
	WebElement pwd=driver.findElement(By.className("_2zrpKA _3v41xv _1dBdas"));
	pwd.sendKeys("babul@321");
	WebElement enter=driver.findElement(By.className("_2AkmmA _1LctnI _7UHT_c"));
	enter.click();
	
}
	}


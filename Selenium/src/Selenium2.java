import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.*;

public class Selenium2
{
public static void main(String[] args)
{
System.out.println("Enter the broswer name");
Scanner scan=new Scanner(System.in);
String bro=scan.next();
System.out.println("The entered website is - "+ bro);

if (bro.equalsIgnoreCase("Chrome"))
{
	ChromeDriver c=new ChromeDriver();
	das(c);
	
}
else if (bro.equalsIgnoreCase("FireFox")) 
{
	FirefoxDriver f=new FirefoxDriver();
	das(f);
	
} 

else 
{
	System.out.println("Invalid, please enter a valid webpage name");	
} 
}
public static void das(WebDriver driver)
{
	driver.get("https://www.flipkart.com/");
	String tit=driver.getTitle();
	System.out.println("The title is"+ tit);
	String url=driver.getCurrentUrl();
	System.out.println("the urls is  "+ url);
	

}
}

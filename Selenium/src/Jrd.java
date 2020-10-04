import org.openqa.selenium.By;
import java.util.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jrd {
	
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) throws InterruptedException 
	{
			System.out.println("Please entr the wesite");
		    Scanner scan=new Scanner(System.in);
			String website=scan.next();
			System.out.println("The website uh enter is - "+ website);
			// url of web
			String email="https://www.gmail.com/";
			String magento="https://www.magento.com/";
			String flipcart="https://www.flipkart.com/";
			//Website
			String website1="Gmail";
			String website2="Magento";
			String website3="Flipcart";
			
			if (website.equalsIgnoreCase(website1)) 
			{
			
				ChromeDriver driver=new ChromeDriver();
				driver.get(email);
				
				String a=driver.getCurrentUrl();
				String b=driver.getPageSource();
				driver.close();
				System.out.println("Url si "+ a );				
				
			}
			else if (website.equalsIgnoreCase(website2)) 
			{
				ChromeDriver driver=new ChromeDriver();
				driver.get(magento);
				String c=driver.getCurrentUrl();
				String d=driver.getPageSource();
				System.out.println("Url si "+ c + "Page source is " + d);		
				
			}
			else if (website.equalsIgnoreCase(website3)) 
			{
				ChromeDriver driver=new ChromeDriver();
				driver.get(flipcart);
				String e=driver.getCurrentUrl();
				String f=driver.getPageSource();
				System.out.println("Url si "+ e + "Page source is " + f);		
						
			}
			else
			{
				System.out.println("In valid input ,Please enter the valid website");
			}
			
			
	}

}

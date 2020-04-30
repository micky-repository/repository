package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBPageAutomate 
{
  public static void main(String[] args) 
  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Micky\\Desktop\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement firstname = driver.findElement(By.id("u_0_m"));
	firstname.sendKeys("Micky");
	
	WebElement surname = driver.findElement(By.name("lastname"));
	surname.sendKeys("Bhambri");
	
	WebElement mobilenumber = driver.findElement(By.cssSelector("input#u_0_r"));
	mobilenumber.sendKeys("1234567890");
	
	WebElement newpass = driver.findElement(By.cssSelector("input[name='reg_passwd__']"));
	newpass.sendKeys("MickyBhambri@12345");
	
	WebElement daydrop = driver.findElement(By.cssSelector("select#day"));
	Select s=new Select(daydrop);
	s.selectByIndex(10);
	
	WebElement monthdrop = driver.findElement(By.id("month"));
	Select t=new Select(monthdrop);
	t.selectByVisibleText("Feb");
	
	WebElement yeardrop = driver.findElement(By.name("birthday_year"));
	Select u=new Select(yeardrop);
	u.selectByValue("1995");
	
	WebElement gender = driver.findElement(By.className("_8esa"));
	gender.click();
	
	WebElement signup = driver.findElement(By.cssSelector("button[name='websubmit']"));
	signup.click();
	
 }
}

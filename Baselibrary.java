package baselibrary;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baselibrary  {

 public static  WebDriver driver;
public static void getLaunchurl() throws InterruptedException {
	driver = new ChromeDriver();
	driver.get("https://appq.dotclear.io/");
	driver.manage().window().maximize();
	
	}
}
 
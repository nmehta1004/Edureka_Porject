import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium_Test {
	public static void main(String[] args)
	{

	System.setProperty("webdriver.chromedriver", "/usr/bin/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://3.91.180.191:5800/");
		String x = driver.getTitle();
		System.out.println(x);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElementById("About Us").click();
		String text=driver.findElementById("PID-ab2-pg").getText();
		System.out.println(text);
		String y= "This is about page. Lorem Ipsum Dipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
	if (x==y) {
		 System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
	}
	}

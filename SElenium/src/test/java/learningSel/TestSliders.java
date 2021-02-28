package learningSel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestSliders {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Amita\\Downloads\\chromedriver_win32\\chromedriver.exe")	;
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("http://jqueryui.com/resources/demos/slider/default.html");
        WebElement slider= driver.findElement(By.xpath("//*[@id='slider']/span"));
                
       new Actions(driver).dragAndDropBy(slider, 400,0).perform();
        
        
        
	}

}

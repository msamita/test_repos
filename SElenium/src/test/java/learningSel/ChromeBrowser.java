package learningSel;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class ChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Amita\\Downloads\\chromedriver_win32\\chromedriver.exe")	;
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
              //driver.get("http://google.com");
              driver.navigate().to("http://wikipedia.com");
             driver.findElement(By.id("searchLanguage")).sendKeys("Hi");
              WebElement dropdown= driver.findElement(By.id("searchLanguage"));
             
             Select select=new Select(dropdown);
              select.selectByVisibleText("Eesti");
            List<WebElement> values=driver.findElements(By.tagName("option"));
            System.out.println("total languages are" + values.size());
                     
            System.out.println(values.get(4).getText());
          for(int i=0;i<values.size();i++) 
          {
          	 System.out.println(values.get(i).getAttribute("lang"));
          }  
          List<WebElement> links =driver.findElements(By.tagName("a"));
          System.out.println("total links are" + links.size());
          //for(WebElement link:links) {
          //	 System.out.println(link.getText()+"--URL is --"+link.getAttribute("href"));
         // }                       
            driver.close( );
	}

}	

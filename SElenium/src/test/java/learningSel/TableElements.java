package learningSel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TableElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Amita\\Downloads\\chromedriver_win32\\chromedriver.exe")	;
        WebDriver driver=new ChromeDriver();
              driver.get("http://google.com");
             driver.findElement(By.name("q")).sendKeys("Way2Automation");
             WebDriverWait wait=new WebDriverWait(driver, 5);
             driver.findElement(By.className("gNO89b")).click();//google search button
             
            // wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div[1]/a/div[2]/div")));
             driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div[1]/div/div/div[1]/a/h3/span")).click();// way 2 Automation
             
          WebElement menu= driver.findElement(By.xpath("//*[@id=\"navbar-collapse-1\"]/ul/li[8]/a"));// resource menu
            Actions  act=new Actions(driver); 
            act.moveToElement(menu).perform();//move mouse on element
            driver.findElement(By.linkText("Practice site 1")).click();
             
            
            
            //count links on sites
             
            /* List<WebElement> links =driver.findElements(By.tagName("a"));
             System.out.println("total links are" + links.size());
             for(WebElement link:links) {
              System.out.println(link.getText()+"--URL is --"+link.getAttribute("href"));
             }      */                 
               driver.close( );
	}

}

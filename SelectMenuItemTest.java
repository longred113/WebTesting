package TH_2_10_Team1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectMenuItemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Game\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = "http://demo.guru99.com/test/guru99home/";
		driver.get(url);
		
		selectMenuItem("Bank Project", driver);
	}
	public static void selectMenuItem(String str, WebDriver dr) {
		WebElement listElement= dr.findElement(By.xpath("//ul[@class= 'nav navbar-nav' ]"));
        List<WebElement> childElements= listElement.findElements(By.xpath("//li[@class='dropdown']/child::a"));
		for (int i=0; i< childElements.size(); i++) {
			if (childElements.get(i).getText().equals(str)) {
				childElements.get(i).click();
				System.out.println("Pass");
				break;
			}
		}	
		dr.close();
	}

}

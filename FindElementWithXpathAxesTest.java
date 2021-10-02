package TH_2_10_Team1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementWithXpathAxesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		testSiblingAndParentInXpath();
//		testAncestorInXpath();
//		testParentInXpath();
		Preceding();
	}
	public static void testSiblingAndParentInXpath() {
		System.setProperty("webdriver.chrome.driver","D:\\Game\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = "http://demo.guru99.com/test/guru99home/";
		driver.get(url);
		
		
        List <WebElement> dateBox = driver.findElements(By.xpath("//h2[contains(text(),'A few of our most popular courses')]/parent::div//div[//a[text()='SELENIUM']]/following-sibling::div[@class='rt-grid-2 rt-omega']"));

        for (WebElement webElement : dateBox) {
            System.out.println(webElement.getText());
        }     

        driver.close();
	}
	public static void testAncestorInXpath(){

		System.setProperty("webdriver.chrome.driver","D:\\Game\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = "http://demo.guru99.com/test/guru99home/";
		driver.get(url);

        List <WebElement> dateBox = driver.findElements(By.xpath("//div[.//a[text()='SELENIUM']]/ancestor::div[@class='rt-grid-2 rt-omega']/following-sibling::div"));

        for (WebElement webElement : dateBox) {
            System.out.println(webElement.getText());
        }
     
        driver.quit();
    }
	public static void testParentInXpath() {
		System.setProperty("webdriver.chrome.driver","D:\\Game\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebElement w;

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = "http://demo.guru99.com/test/guru99home/";
		driver.get(url);
		
		w =driver.findElement(By.xpath("//*[@id='rt-feature']//parent::div"));
		
		System.out.println(w.getText());
		 
	    driver.quit();
	}
	public static void Preceding() {
		System.setProperty("webdriver.chrome.driver","D:\\Game\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebElement w;

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = "http://demo.guru99.com/test/guru99home/";
		driver.get(url);
		
		w =driver.findElement(By.xpath("//*[@type='text']//preceding::input[1]"));
		
		System.out.println(w.getText());
		 
	    driver.quit();
	}

}

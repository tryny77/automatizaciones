import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Product {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
		
		WebDriver navegador= new FirefoxDriver();
		
		navegador.get("http://automationpractice.com/index.php");
		
		navegador.manage().window().maximize();
		
		JavascriptExecutor jse = (JavascriptExecutor) navegador;
		
		jse.executeScript("window.scrollBy(0,1000)");
		
		WebElement sing= navegador.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a"));
		
		sing.click();
		
		navegador.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("perez.123bolivi@gmail.com");
		
		navegador.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("sistemas.01");
		
		navegador.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
		
		navegador.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("top");
		
		navegador.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/button")).click();
		
		navegador.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[1]/div[1]/div/ul/li[1]/a/img")).click();
		
		jse.executeScript("window.scrollBy(0,500)");
		
		navegador.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button")).click();
		
		  Thread.sleep(1000);
		
		navegador.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span")).click();
		
		jse.executeScript("window.scrollBy(0,900)");
		
		navegador.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span")).click();
		
		jse.executeScript("window.scrollBy(0,900)");
		
		navegador.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button")).click();
		
		jse.executeScript("window.scrollBy(0,900)");
		
		navegador.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
		
		navegador.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p/button")).click();
		
		jse.executeScript("window.scrollBy(0,900)");
		
		navegador.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[1]/div/p/a")).click();
		
		jse.executeScript("window.scrollBy(0,900)");
		
		navegador.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button")).click();
		
		jse.executeScript("window.scrollBy(0,100)");

	}

}

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Verify {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		String text =getCorreo();
		
		System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
		
		WebDriver navegador= new FirefoxDriver();
		
		navegador.get("https://reqres.in/");
		
		navegador.manage().window().maximize();
		
		Robot rb = new Robot();
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		
		rb.keyPress(KeyEvent.VK_F);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		
		rb.keyRelease(KeyEvent.VK_F);
		
		  Thread.sleep(1000);
			
	    StringSelection stringSelection = new StringSelection(text);
	    
	    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	    
	    clipboard.setContents(stringSelection, stringSelection);
		
	    rb.keyPress(KeyEvent.VK_CONTROL);
		
	    rb.keyPress(KeyEvent.VK_V);
	
	    rb.keyRelease(KeyEvent.VK_CONTROL);
		
		rb.keyRelease(KeyEvent.VK_V);

	}
	
	public static String getCorreo() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
		
		WebDriver navegador= new FirefoxDriver();
		
		navegador.get("https://reqres.in/api/users?page=2");
		
		navegador.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement ob=navegador.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div/div[2]/table/tbody/tr[8]/td[2]/span/span"));
		
		String correo=ob.getText();
	
		return correo;
	}

}

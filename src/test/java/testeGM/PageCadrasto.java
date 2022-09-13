package testeGM;


import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class PageCadrasto {
	
	private WebDriver driver;
	
	@Before
	public void ConfigurarTeste() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void TesteNavegabilidade() {
		
		driver.get("http://localhost:4200/cadastro");
		
		driver.findElement(By.id(usuario)).sendKeys(RobertaAraujo);
		driver.findElement(By.id(senha)).sendKeys(123adm);
		driver.findElement(By.className(btn-cadastrar)).click();	
		
	}
	
	@After
	public void fechar() {
		driver.close();
	}
	

}
package testedesoftware.test;

import org.junit.BeforeClass;

import org.junit.AfterClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	protected static WebDriver driver;
	protected static final String URL_BASE = "file:///C:/Users/36124872022.1n/Desktop/selenium-lab-main/sistema/produtos.html";
	protected static final  String PATH_DRIVE = "src/test/resources/chromedriver.exe";
	
	@BeforeClass
	public static void iniciar() {
		System.setProperty("webdriver.chrome.driver", PATH_DRIVE);
		driver = new ChromeDriver(); //essa linha so abre o navegador
		driver.manage().window().maximize();
		driver.get(URL_BASE);
	}
	
//	@AfterClass
//	public static void finalizar() {
//		driver.quit();
		
//	}
		
}

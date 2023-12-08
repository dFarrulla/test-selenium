package testedesoftware.test;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;



import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFirstTest {
	private WebDriver driver;
	private String URL_BASE = "https://www.google.com";
	private String PATH_DRIVE = "src/test/resources/chromedriver.exe";
	
	private void iniciar() {
		System.setProperty("webdriver.chrome.driver", PATH_DRIVE);
		driver = new ChromeDriver(); //essa linha so abre o navegador
		driver.manage().window().maximize();
		driver.get(URL_BASE);
	}
	
	@Test
	public void pesquisarNoGoogle() {
		//Montagem do cenario
		iniciar();
		
		WebElement inputPesquisa = driver.findElement(By.name("q"));
		
		
		inputPesquisa.sendKeys("bolo de larana" + Keys.ENTER);
		
		String resultado = driver.findElement(By.id("result-stats")).getText();
		
		
		assertTrue(resultado,resultado.contains("Aproximadamente"));
		
		
		
		driver.quit();
		
		
		
	}
	
}

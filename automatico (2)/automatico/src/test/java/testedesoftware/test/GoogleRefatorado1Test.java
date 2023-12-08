package testedesoftware.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class GoogleRefatorado1Test extends BaseTest {
	
	@Test
	public void pesquisarNoGoogle() {
	
		WebElement inputPesquisa = driver.findElement(By.name("q"));
			
		inputPesquisa.sendKeys("bolo de larana" + Keys.ENTER);
		
		String resultado = driver.findElement(By.id("result-stats")).getText();
		
		assertTrue(resultado,resultado.contains("Aproximadamente"));
		
	}
	
	
	
}

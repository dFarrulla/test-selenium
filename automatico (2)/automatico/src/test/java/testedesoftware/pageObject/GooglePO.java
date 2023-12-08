package testedesoftware.pageObject;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;



import org.openqa.selenium.support.FindBy;




public class GooglePO extends BasePO {
	
	
	
	@FindBy (name="q")
	public WebElement inputPesquisa;
	
	@FindBy(id = "result-stats")
	public WebElement divResultadoPesquisa;
	
	
	/**
	 * Construtor para a criacao da pagina do Google
	 * @param driver
	 */
	public GooglePO(WebDriver driver) {
		super(driver);
		
		
	}
	

}

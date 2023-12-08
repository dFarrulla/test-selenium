package testedesoftware.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProdutoPO extends BasePO {

    // Elementos da página usando a anotação @FindBy do Selenium
    @FindBy(id ="nome")
    public WebElement inputNome;

    @FindBy(id ="valor")
    public WebElement inputValor;

    @FindBy(id ="quantidade")
    public WebElement inputQuantidade;

    @FindBy(id ="codigo")
    public WebElement inputCodigo;

    @FindBy(id ="data")
    public WebElement inputData;  // Adiciona o campo para a data do produto

    @FindBy(id ="btn-adicionar")
    public WebElement buttonAdicionar;

    @FindBy(id ="btn-salvar")
    public WebElement buttonSalvar;  // Adiciona o botão para salvar

    @FindBy(css="div.modal-content span#mensagem")
    public WebElement spanMensagemSucesso;

    // Construtor da classe que recebe um WebDriver
    public ProdutoPO(WebDriver driver) {
        super(driver);
    }

    // Método para obter a mensagem de sucesso após adicionar um produto
    public String obterMensagemSucesso() {
        return this.spanMensagemSucesso.getText();
    }

    // Método para adicionar um produto com os parâmetros fornecidos, incluindo código e data
    public void adicionarProduto(String nomeProduto, String precoProduto, String quantidadeProduto, String codigoProduto) {
        escrever(inputNome, nomeProduto);
        escrever(inputValor, precoProduto);
        escrever(inputQuantidade, quantidadeProduto);
        escrever(inputCodigo, codigoProduto);
        buttonAdicionar.click();
    }

    // Método privado para escrever em um elemento WebElement
    private void escrever(WebElement input, String texto) {
        // Limpa o campo e insere o texto fornecido
        input.clear();
        input.sendKeys(texto);
    }

    // Método para escrever a data
    public void escreverData(String dataProduto) {
        escrever(inputData, dataProduto);
    }

    // Método para clicar no botão "Salvar"
    public void cliqueSalvar() {
        buttonSalvar.click();
    }
}

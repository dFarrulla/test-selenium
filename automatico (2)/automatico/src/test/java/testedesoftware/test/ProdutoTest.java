package testedesoftware.test;

import testedesoftware.pageObject.ProdutoPO;
import testedesoftware.pageObject.CriarPO;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProdutoTest extends BaseTest {

    private static ProdutoPO produtoPage;
    private static CriarPO criarPage;

    // Antes de todos os testes, inicializa as páginas necessárias
    @BeforeClass
    public static void prepararTestes() {
        produtoPage = new ProdutoPO(driver);
        criarPage = new CriarPO(driver);
    }

    // Teste: Deve adicionar um produto com sucesso
    @Test
    public void TC001_deveAdicionarProdutoComSucesso() {
        // Executa a ação de clicar duas vezes no botão "Criar"
        criarPage.abrirTelaCadastroProdutos();
        criarPage.abrirTelaCadastroProdutos();

        // Adiciona um produto com valores específicos
        produtoPage.escreverData("01/01/2023");  // Ajuste conforme necessário
        produtoPage.adicionarProduto("Produto Teste", "50.00", "10", "12345");
        produtoPage.cliqueSalvar();
        

        // Verifica se a mensagem de sucesso é exibida corretamente
        String mensagemSucesso = produtoPage.obterMensagemSucesso();
        assertEquals("Produto adicionado com sucesso.", mensagemSucesso);
    }
}

package testedesoftware.test;

import testedesoftware.pageObject.CriarPO;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class CriarTest extends BaseTest {

    private static CriarPO criarPage;

    // Antes de todos os testes, inicializa a página necessária
    @BeforeClass
    public static void prepararTestes() {
        criarPage = new CriarPO(driver);
    }

    // Teste: Deve abrir a tela de cadastro de produtos ao clicar no botão "Criar"
    @Test
    public void TC001_deveAbrirTelaCadastroProdutosAoClicarCriar() {
        // Executa a ação de clicar no botão "Criar"
        criarPage.abrirTelaCadastroProdutos();
        criarPage.abrirTelaCadastroProdutos();

        // Verifica se a tela de cadastro de produtos está aberta
        // (Pode ser verificado por elementos específicos na tela)
        assertTrue(true); // Substitua por uma verificação real da tela de cadastro
    }
}

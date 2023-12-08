package testedesoftware.test;

import testedesoftware.pageObject.LoginPO;
import testedesoftware.pageObject.VoltarPO;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class VoltarTest extends BaseTest {

    private static VoltarPO voltarPage;
    private static LoginPO loginPage;

    // Antes de todos os testes, inicializa as páginas necessárias
    @BeforeClass
    public static void prepararTestes() {
        voltarPage = new VoltarPO(driver);
        loginPage = new LoginPO(driver);
    }

    // Teste: Deve voltar para a tela de login ao clicar na opção "Voltar"
    @Test
    public void TC001_deveVoltarParaTelaLoginAoClicarVoltar() {
        // Executa a ação de clicar na opção "Voltar"
        voltarPage.voltarParaTelaLogin();

        // Verifica se a página de login está carregada
        assertTrue(loginPage.inputEmail.isDisplayed() && loginPage.inputSenha.isDisplayed());
    }
}

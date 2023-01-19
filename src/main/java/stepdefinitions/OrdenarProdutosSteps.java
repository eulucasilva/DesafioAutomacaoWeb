package stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.OrdenarProdutosPage;

public class OrdenarProdutosSteps {
	
	WebDriver driver;

	@Quando("^o usuario selecionar a opcao \"([^\"]*)\"$")
	public void oUsuarioSelecionarAOpcao(String arg1) throws Throwable {
		OrdenarProdutosPage ordenar = new OrdenarProdutosPage(Hooks.getDriver());
		ordenar.preencherOpcaoOrdenar(arg1);
	}

	@Entao("^o sistema deve ordenar os produtos$")
	public void oSistemaDeveOrdenarOsProdutos() throws Throwable {
		OrdenarProdutosPage ordenar = new OrdenarProdutosPage(Hooks.getDriver());
		ordenar.validarOrdenacao();
	}
}

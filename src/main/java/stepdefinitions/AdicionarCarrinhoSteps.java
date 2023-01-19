package stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.AdicionarCarrinhoPage;

public class AdicionarCarrinhoSteps {

	WebDriver driver;

	@Quando("^o usuario selecionar o produto \"([^\"]*)\" e clicar para adicionar ao carrinho$")
	public void oUsuarioSelecionarOProdutoEClicarParaAdicionarAoCarrinho(String prod) throws Throwable {
		AdicionarCarrinhoPage add = new AdicionarCarrinhoPage(Hooks.getDriver());
		add.adicionarAoCarrinho(prod);
	}

	@E("^o produto esteja selecionado$")
	public void oProdutoEstejaSelecionado() throws Throwable {
		AdicionarCarrinhoPage add = new AdicionarCarrinhoPage(Hooks.getDriver());
		add.adicionarAoCarrinho("Sauce Labs Backpack");
	}

	@Entao("^o sistema devera inserir o produto no carrinho$")
	public void oSistemaDeveraInserirOProdutoNoCarrinho() throws Throwable {
		AdicionarCarrinhoPage add = new AdicionarCarrinhoPage(Hooks.getDriver());
		add.validarCarrinho();
	}

	@E("^redirecionar o usuario para o carrinho$")
	public void redirecionarOUsuarioParaOCarrinho() throws Throwable {
		AdicionarCarrinhoPage add = new AdicionarCarrinhoPage(Hooks.getDriver());
		add.verCarrinho();
	}
}

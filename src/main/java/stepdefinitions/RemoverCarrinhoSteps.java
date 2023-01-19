package stepdefinitions;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.RemoverCarrinhoPage;

public class RemoverCarrinhoSteps {
	
	@Quando("^o usuario estiver no carrinho$")
	public void oUsuarioEstiverNoCarrinho() throws Throwable {
		RemoverCarrinhoPage del = new RemoverCarrinhoPage(Hooks.getDriver());
		del.habilitarCarrinho();
	}
	
	@E("^o usuario selecionar o produto \"([^\"]*)\" e clicar para remover do carrinho$")
	public void oUsuarioSelecionarOProdutoEClicarParaRemoverDoCarrinho(String prod) throws Throwable {
		RemoverCarrinhoPage del = new RemoverCarrinhoPage(Hooks.getDriver());
		del.removerDoCarrinho(prod);
	}

	@Entao("^o sistema devera excluir o produto no carrinho$")
	public void oSistemaDeveraExcluirOProdutoNoCarrinho() throws Throwable {
		RemoverCarrinhoPage del = new RemoverCarrinhoPage(Hooks.getDriver());
		del.validarCarrinho();
	}

}

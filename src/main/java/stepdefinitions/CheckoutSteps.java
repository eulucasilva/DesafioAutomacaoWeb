package stepdefinitions;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.CheckoutPage;

public class CheckoutSteps {
	
	@Quando("^o usuario clicar no botao checkout$")
	public void oUsuarioClicarNoBotaoCheckout() throws Throwable {
	    CheckoutPage check = new CheckoutPage(Hooks.getDriver());
	    check.clicaBotaoCheckout();
	}

	@E("^inserir o nome \"([^\"]*)\", sobrenome \"([^\"]*)\" e CEP \"([^\"]*)\"$")
	public void inserirONomeSobrenomeECEP(String arg1, String arg2, String arg3) throws Throwable {
		CheckoutPage check = new CheckoutPage(Hooks.getDriver());
	    check.inserirInformacaoCheckout(arg1, arg2, arg3);
	}

	@E("^clicar no botao Continuar$")
	public void clicarNoBotaoContinuar() throws Throwable {
		CheckoutPage check = new CheckoutPage(Hooks.getDriver());
	    check.clicaBotaoContinuar();
	}

	@E("^clicar no botao Finalizar$")
	public void clicarNoBotaoFinalizar() throws Throwable {
		CheckoutPage check = new CheckoutPage(Hooks.getDriver());
	    check.clicaBotaoFinalizar();
	}

	@Entao("^o sistema finaliza a compra$")
	public void oSistemaFinalizaACompra() throws Throwable {
		CheckoutPage check = new CheckoutPage(Hooks.getDriver());
	    check.validaCheckout();
	}

}

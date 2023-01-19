package stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.LoginPage;

public class LoginSteps {

	WebDriver driver;

	@Dado("^que o usuario esteja na pagina principal do sistema$")
	public void queOUsuarioEstejaNaPaginaPrincipalDoSistema() throws Throwable {
		Hooks.abrirUrl("https://www.saucedemo.com/");
		driver = Hooks.getDriver();
	}
	
	@Dado("^que o usuario esteja logado no sistema$")
	public void queOUsuarioEstejaLogadoNoSistema() throws Throwable {
		LoginPage lp = new LoginPage(driver);
	    lp.preencherUsuario("standard_user");
	    lp.preencherSenha("secret_sauce");
	    lp.clicarBotaoLogin();
	}

	@Quando("^informar o campo Username como \"([^\"]*)\"$")
	public void informarOCampoUsernameComo(String arg1) throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.preencherUsuario(arg1);
	}

	@Quando("^informar o campo Password como \"([^\"]*)\"$")
	public void informarOCampoPasswordComo(String arg1) throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.preencherSenha(arg1);
	}

	@Quando("^clicar no botao Login$")
	public void clicarNoBotaoLogin() throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.clicarBotaoLogin();
	}

	@Entao("^o sistema devera autorizar o login, exibindo pagina contendo o Dashboard$")
	public void oSistemaDeveraAutorizarOLoginExibindoPaginaContendoODashboard() throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.validaTelaProdutos();
		
	}

}

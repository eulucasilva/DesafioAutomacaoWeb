package stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.LogoutPage;

public class LogoutSteps {
	
	WebDriver driver; 
	
	@Quando("^o usuario clicar no menu ao lado$")
	public void oUsuarioClicarNoMenuAoLado() throws Throwable {
		LogoutPage lp = new LogoutPage(Hooks.getDriver());
		lp.menu();
	}

	@E("^clicar na opcao logout$")
	public void clicarNaOpcaoLogout() throws Throwable {
		LogoutPage lp = new LogoutPage(Hooks.getDriver());
		lp.fazerLogout();
	}

	@Entao("^o sistema devera fazer logout$")
	public void oSistemaDeveraFazerLogout() throws Throwable {
		LogoutPage lp = new LogoutPage(Hooks.getDriver());
		lp.validaLogout();
		System.out.println("saiu");
	}
}

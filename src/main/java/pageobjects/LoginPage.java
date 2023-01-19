package pageobjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.Utils;

public class LoginPage extends Utils {

	protected WebDriver driver;

	public LoginPage(WebDriver driver) {
//		PageFactory é uma classe fornecida pelo Selenium WebDriver para implementar o
//		PageObject. Usando-o, você pode inicializar os objetos de página definidos ou instanciá-los
//		diretamente.
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "user-name")
	private WebElement usuario;

	@FindBy(how = How.ID, using = "password")
	private WebElement senha;

	@FindBy(how = How.ID, using = "login-button")
	private WebElement btnLogin;

	@FindBy(how = How.XPATH, using = "//span[@class='title']")
	private WebElement telaProdutos;

	public void preencherUsuario(String nomeusuario) {
		esperarElemento(usuario);
		usuario.sendKeys(nomeusuario);
	}

	public void preencherSenha(String senhausuario) {
		esperarElemento(senha);
		senha.sendKeys(senhausuario);
	}

	public void clicarBotaoLogin() {
		esperarElemento(btnLogin);
		btnLogin.click();
	}

	public void validaTelaProdutos() {
		esperarElemento(telaProdutos);
		assertEquals("PRODUCTS", telaProdutos.getText());
	}

}

package pageobjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.Utils;

public class CheckoutPage extends Utils {

	protected WebDriver driver;

	public CheckoutPage(WebDriver driver) {
//		PageFactory é uma classe fornecida pelo Selenium WebDriver para implementar o
//		PageObject. Usando-o, você pode inicializar os objetos de página definidos ou instanciá-los
//		diretamente.
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "checkout")
	private WebElement botaoCheckout;

	@FindBy(how = How.ID, using = "first-name")
	private WebElement campoNome;

	@FindBy(how = How.ID, using = "last-name")
	private WebElement campoSobrenome;

	@FindBy(how = How.ID, using = "postal-code")
	private WebElement campoCep;

	@FindBy(how = How.ID, using = "continue")
	private WebElement botaoContinuar;

	@FindBy(how = How.ID, using = "finish")
	private WebElement botaoFinalizar;
	
	@FindBy(how = How.ID, using = "back-to-products")
	private WebElement voltar;

	public void clicaBotaoCheckout() {
		esperarElemento(botaoCheckout);
		botaoCheckout.click();
	}

	public void inserirInformacaoCheckout(String nome, String sobrenome, String cep) {
		esperarElemento(campoNome);
		campoNome.sendKeys(nome);

		esperarElemento(campoSobrenome);
		campoSobrenome.sendKeys(sobrenome);

		esperarElemento(campoCep);
		campoCep.sendKeys(cep);

	}

	public void clicaBotaoContinuar() {
		esperarElemento(botaoContinuar);
		botaoContinuar.click();
	}

	public void clicaBotaoFinalizar() {
		esperarElemento(botaoFinalizar);
		botaoFinalizar.click();
	}
	
	public void validaCheckout() {
		esperarElemento(voltar);
		assertEquals("BACK HOME", voltar.getText());
	}
}

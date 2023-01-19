package pageobjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.Utils;

public class RemoverCarrinhoPage extends Utils {

	protected WebDriver driver;

	public RemoverCarrinhoPage(WebDriver driver) {
//		PageFactory � uma classe fornecida pelo Selenium WebDriver para implementar o
//		PageObject. Usando-o, voc� pode inicializar os objetos de p�gina definidos ou instanci�-los
//		diretamente.
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private WebElement btnDelCarrinho;

	@FindBy(how = How.ID, using = "continue-shopping")
	private WebElement continuarCompra;
	
	@FindBy(how = How.XPATH, using = "//a[@class='shopping_cart_link']")
	private WebElement carrinho;

	public void removerDoCarrinho(String prod) {
		String[] dado = prod.split(" ");
		String produto = "";
		for (int i = 0; i < dado.length; i++) {
			produto = produto + dado[i];
			if (i != dado.length - 1) {
				produto += "-";
			}	
		}
		String id = produto.toLowerCase();
		btnDelCarrinho = driver.findElement(By.id("remove-" + id));
		esperarElemento(btnDelCarrinho);
		btnDelCarrinho.click();
	}

	public void validarCarrinho() {
		esperarElemento(continuarCompra);
		assertTrue(continuarCompra.isDisplayed());
	}

	public void habilitarCarrinho() {
		esperarElemento(carrinho);
		carrinho.click();
	}
}

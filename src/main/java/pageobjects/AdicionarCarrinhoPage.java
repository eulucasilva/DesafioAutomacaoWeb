package pageobjects;

import static org.junit.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.Utils;

public class AdicionarCarrinhoPage extends Utils {

	protected WebDriver driver;

	public AdicionarCarrinhoPage(WebDriver driver) {
//		PageFactory é uma classe fornecida pelo Selenium WebDriver para implementar o
//		PageObject. Usando-o, você pode inicializar os objetos de página definidos ou instanciá-los
//		diretamente.
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private WebElement btnAddCarrinho;

	@FindBy(how = How.XPATH, using = "//span[@class='shopping_cart_badge']")
	private WebElement qtdItens;

	@FindBy(how = How.XPATH, using = "//a[@class='shopping_cart_link']")
	private WebElement carrinho;

	public void adicionarAoCarrinho(String prod) {
		String[] dado = prod.split(" ");
		String produto = "";
		for (int i = 0; i < dado.length; i++) {
			produto = produto + dado[i];
			if (i != dado.length - 1) {
				produto += "-";
			}
		}
		String id = produto.toLowerCase();
		btnAddCarrinho = driver.findElement(By.id("add-to-cart-" + id));
		esperarElemento(btnAddCarrinho);
		btnAddCarrinho.click();
	}

	public void validarCarrinho() {
		esperarElemento(qtdItens);
		assertNotEquals(0, qtdItens.getText());
	}

	public void verCarrinho() throws InterruptedException {
		esperarElemento(carrinho);
		carrinho.click();
	}
}

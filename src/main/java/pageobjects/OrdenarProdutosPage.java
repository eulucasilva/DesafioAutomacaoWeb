package pageobjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.Utils;

public class OrdenarProdutosPage extends Utils {
	protected WebDriver driver;

	public OrdenarProdutosPage(WebDriver driver) {
//		PageFactory é uma classe fornecida pelo Selenium WebDriver para implementar o
//		PageObject. Usando-o, você pode inicializar os objetos de página definidos ou instanciá-los
//		diretamente.
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//span[@class='title']")
	private WebElement telaProdutos;

	@FindBy(how = How.CLASS_NAME, using = "product_sort_container")
	private WebElement campoOrdenar;

	public void preencherOpcaoOrdenar(String opcao) {
		esperarElemento(campoOrdenar);
		selecionar(campoOrdenar, opcao);
	}

	public void validarOrdenacao() {
		esperarElemento(telaProdutos);
		assertEquals("PRODUCTS", telaProdutos.getText());
	}
}

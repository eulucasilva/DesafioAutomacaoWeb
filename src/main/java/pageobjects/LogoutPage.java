package pageobjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.Utils;

public class LogoutPage extends Utils {
	protected WebDriver driver;

	public LogoutPage(WebDriver driver) {
//		PageFactory é uma classe fornecida pelo Selenium WebDriver para implementar o
//		PageObject. Usando-o, você pode inicializar os objetos de página definidos ou instanciá-los
//		diretamente.
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "react-burger-menu-btn")
	private WebElement menu;
	
	@FindBy(how = How.ID, using = "logout_sidebar_link")
	private WebElement logout;
	
	@FindBy(how = How.CLASS_NAME, using = "login_logo")
	private WebElement logo;
	
	
	public void menu() {
		esperarElemento(menu);
		menu.click();
	}
	
	public void fazerLogout() {
		esperarElemento(logout);
		logout.click();
	}
	
	public void validaLogout() {
		esperarElemento(logo);
		assertTrue(logo.isDisplayed());
	}

}

package Tests;

import static Core.DriverFactory.*;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import Core.BaseTest;
import PageObject.LoginPage;
import PageObject.MenusPage;

public class TestAutenticacaoUsuario extends BaseTest {

	private LoginPage login;
	private MenusPage menu;
	
	@Before
	public void inicializacaoPadrao() {
		
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		login = new LoginPage();
		login.acessarSite();
		
		menu = new MenusPage();
		
	}
	
	@After
	public void encerraDriver() {
		
		killDriver();
	}

	@Test
	public void homePage() throws InterruptedException {
		
		assertEquals(getDriver().getTitle(), "Sistema de Gestão de Igrejas!");
		
		login.elementosHomePage();

	}
	
	@Test
	public void layoutMenus() throws InterruptedException {
		
		login.login();
		
		menu.menuInicio();
		menu.menuClientes();
		menu.menuRelatorios();
		menu.menuUsuarios();
		menu.menuFuncionarios();
		menu.menuDepartamentos();
		menu.menuTestes();
		menu.menuSistemas();
		menu.menuIgreja();
	}
	


}

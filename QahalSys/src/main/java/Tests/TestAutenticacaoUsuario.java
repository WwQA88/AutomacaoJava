package Tests;

import static Core.DriverFactory.*;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import Core.BaseTest;
import PageObject.LoginPage;

public class TestAutenticacaoUsuario extends BaseTest {

	private LoginPage login;

	
	@Before
	public void inicializacaoPadrao() {
		
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		login = new LoginPage();
		login.acessarSite();
	
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
	public void loginSucesso() throws InterruptedException {
		
		assertEquals(getDriver().getTitle(), "Sistema de Gestão de Igrejas!");
		
		login.loginAdm();

	}
	
	@Test
	public void loginFalha() throws InterruptedException {
		
		assertEquals(getDriver().getTitle(), "Sistema de Gestão de Igrejas!");
		
		login.loginErro();
		
		assertEquals("ERROR: Usuário ou senha inválidos",obterTexto(By.id("swal2-content")));

	}
	

	


}

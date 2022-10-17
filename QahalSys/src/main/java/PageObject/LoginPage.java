package PageObject;

import static Core.DriverFactory.getDriver;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Core.BaseTest;

public class LoginPage extends BaseTest {

	public void acessarSite() {

		getDriver().manage().window().maximize();
		getDriver().get(url);

	}

	public void elementosHomePage() {

		aguardarInteracao(By.xpath("//*[@class='login-signin']//h3[.='Acessar']"));
		assertEquals(obterTexto(By.xpath("//*[@class='login-signin']//h3[.='Acessar']")), "Acessar");
		assertEquals(obterTexto(By.xpath("//*[@class='login-signin']//p[.='Digite seu nome de usu�rio e senha']")),
				"Digite seu nome de usu�rio e senha");

		assertEquals(
				obterAtributoPlaceholder(By.xpath("//*[@id='id_sc_field_login'][@placeholder='Usu�rio ou Email']")),
				"Usu�rio ou Email");
		assertEquals(
				obterAtributoPlaceholder(By.xpath("//*[@class='scFormObjectOddPwdBox']/input[@placeholder='Senha']")),
				"Senha");

		assertEquals(obterTexto(By.xpath("//label[@class='checkbox checkbox-outline checkbox-white text-white m-0']")),
				"Mantenha-me conectado");

		assertEquals(obterTexto("kt_login_forgot"), "Esqueceu a senha?");

		assertEquals(obterValorCampo("kt_login_signin_submit"), "Acessar");
	}

	public void login() throws InterruptedException {

		digite(By.id("id_sc_field_login"), nomeUsuario);

		digite(By.id("id_sc_field_password"), senha);

		clicarBotao("kt_login_signin_submit");

		// Verifica se o modal de sess�o ativa esta presente.
		Boolean sessaoAtiva = getDriver().findElements(By.xpath("//*[@onclick]")).size() > 0;

		// Caso a sess�o esteja ativa, navega entre os bot�es "Cancelar" e "Continuar" e prossegue clicando em "Continuar"
		if (sessaoAtiva) {

			WebElement cancelar = getDriver().findElement(By.xpath("//a"));
			Actions setBotaoCancelar = new Actions(getDriver()).moveToElement(cancelar);
			setBotaoCancelar.moveToElement(cancelar).perform();

			WebElement continuar = getDriver().findElement(By.xpath("//*[@onclick]"));
			Actions pressionaEnter = new Actions(getDriver()).moveToElement(continuar);
			Thread.sleep(5000);
			pressionaEnter.sendKeys(Keys.ENTER).perform();

		} 
	}

}
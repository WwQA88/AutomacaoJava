package br.ce.wcaquino.tests;

import static br.ce.wcaquino.core.DriverFactory.*;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.ce.wcaquino.pages.MenuPage;
import br.ce.wcaquino.pages.ResumoPage;
import br.ce.wcaquino.core.BaseTest;
import br.ce.wcaquino.core.DriverFactory;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ResumoTestAntigo extends BaseTest {
	
	private MenuPage menuPage = new MenuPage();
	private ResumoPage resumoPage = new ResumoPage();
	
	@Test
	public void test1_ExcluirMovimentacao() {
		
		menuPage.acessarTelaResumo();
		
		resumoPage.excluirMovimentacao();
		assertEquals("Movimentação removida com sucesso!", resumoPage.obterMensagemSucesso());
		
	}
	
	// Aula 91 - Tratar uma exceção de um elemento não existente na tela
	
	// forma 1
	// @Test(expected=org.openqa.selenium.NoSuchElementException.class)
	
	
	@Test	
	public void test2_ResumoMensal() {
		
		menuPage.acessarTelaResumo();
		
		assertEquals("Seu Barriga - Extrato", getDriver().getTitle());
		
		//forma 2
		
		/*try{
		
			
		DriverFactory.getDriver().findElement(By.xpath("//*[@id='tabelaExtrato']/tbody/tr"));
		Assert.fail();
	} catch (org.openqa.selenium.NoSuchElementException e) {
		
	}

} */
		// forma 3
		
		List<WebElement> elementosEncontrados = DriverFactory.getDriver().findElements
				(By.xpath("//*[@id='tabelaExtrato']/tbody/tr"));
		assertEquals(0, elementosEncontrados.size());
	}
}
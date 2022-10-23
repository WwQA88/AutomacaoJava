package br.ce.wcaquino.tests;

import org.junit.Test;

import br.ce.wcaquino.pages.MenuPage;
import br.ce.wcaquino.core.BaseTest;

public class SaldoTestAntigo extends BaseTest {
	
	
	private MenuPage MenuPage = new MenuPage();
	
	@Test
	public void testSaldoConta() {
		
		MenuPage.acessarTelaPrincipal();		
		//assertEquals("500.00", homePage.obterSaldoConta(Propriedades.NOME_CONTA_ALTERADA));
		
	}

}

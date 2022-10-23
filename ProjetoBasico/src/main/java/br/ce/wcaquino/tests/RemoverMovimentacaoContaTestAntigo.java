package br.ce.wcaquino.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.ce.wcaquino.pages.ContasPage;
import br.ce.wcaquino.pages.MenuPage;
import br.ce.wcaquino.core.BaseTest;

public class RemoverMovimentacaoContaTestAntigo extends BaseTest {
	
	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();
	
	@Test
	public void testExcluirContaComMovimentacao() {
		
		menuPage.acessarTelaListarConta();
		
		//contasPage.clicarExcluirConta(Propriedades.NOME_CONTA_ALTERADA);
		
		assertEquals("Conta em uso na movimentações", contasPage.obterMensagemErro());
		
		
	}

}

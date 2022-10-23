package br.ce.wcaquino.tests;

import static org.junit.Assert.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.ce.wcaquino.pages.ContasPage;
import br.ce.wcaquino.pages.MenuPage;
import br.ce.wcaquino.core.BaseTest;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ContaTestAntigo extends BaseTest {
	
	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();
	
	@Test
	public void test1_InserirConta() {
		
		menuPage.acessarTelaInserirConta();
		//contasPage.setNome(Propriedades.NOME_CONTA_ALTERADA);
		contasPage.salvar();
		
		assertEquals("Conta adicionada com sucesso!", contasPage.obterMensagemSucesso());
	}
	
	@Test
	public void test2_AlterarConta() {
		
		menuPage.acessarTelaListarConta();
		//contasPage.clicarAlterarConta(Propriedades.NOME_CONTA_ALTERADA);
		//contasPage.setNome(Propriedades.NOME_CONTA_ALTERADA);
		contasPage.salvar();
		
		assertEquals("Conta alterada com sucesso!", contasPage.obterMensagemSucesso());
		
	}
	
	@Test
	public void test3_InserirContaMesmoNome() {
		
		menuPage.acessarTelaInserirConta();
		//contasPage.setNome(Propriedades.NOME_CONTA_ALTERADA);
		contasPage.salvar();
		
		assertEquals("Já existe uma conta com esse nome!", contasPage.obterMensagemErro());

		
	}

}

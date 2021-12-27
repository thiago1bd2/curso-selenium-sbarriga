package br.com.thiago1bd2.tests;

import static org.junit.Assert.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.thiago1bd2.core.BaseTest;
import br.com.thiago1bd2.pages.MenuPage;
import br.com.thiago1bd2.pages.ResumoPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ResumoTest extends BaseTest {
	
	private MenuPage menuPage = new MenuPage();
	
	@Test
	public void test1removerMovimentacao() {
		ResumoPage rPage = menuPage.acessarResumos();
		rPage.removerMovimentacao();
		
		assertEquals("Movimentação removida com sucesso!", rPage.obterMensagemSucesso());
	}
	
	@Test
	public void test2ResumoMensal() {
		ResumoPage rPage = menuPage.acessarResumos();		
		assertEquals("Seu Barriga - Extrato", rPage.getPageTitle());
	}

}

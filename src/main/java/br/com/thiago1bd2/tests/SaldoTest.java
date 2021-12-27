package br.com.thiago1bd2.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.thiago1bd2.core.BaseTest;
import br.com.thiago1bd2.pages.HomePage;
import br.com.thiago1bd2.pages.MenuPage;

public class SaldoTest extends BaseTest{
	
	private MenuPage mPage = new MenuPage();

	@Test
	public void testSaldoDaConta() {
		HomePage hPage = mPage.acessarHome();
		String valor =  hPage.obterSaldoDaConta("Conta para saldo");
		
		//Must be 100
		assertEquals("534.00", valor);
	}
}

package br.com.thiago1bd2.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.thiago1bd2.core.BaseTest;
import br.com.thiago1bd2.pages.HomePage;

public class SaldoTest extends BaseTest{

	@Test
	public void testSaldoDaConta() {
		HomePage hPage = new HomePage();
		String valor =  hPage.obterSaldoDaConta("Conta Movimentação");
		
		assertEquals("-400.00", valor);
	}
}

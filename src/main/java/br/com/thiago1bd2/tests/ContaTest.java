package br.com.thiago1bd2.tests;

import org.junit.Test;

import br.com.thiago1bd2.core.BaseTest;
import br.com.thiago1bd2.pages.MenuPage;

public class ContaTest extends BaseTest {

	MenuPage menuPage = new MenuPage();	
		
	@Test
	public void adicionarConta() {
		menuPage.adicionarConta();		
	}

}

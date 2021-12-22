package br.com.thiago1bd2.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.thiago1bd2.core.BaseTest;
import br.com.thiago1bd2.pages.ContasPage;
import br.com.thiago1bd2.pages.ListarPage;
import br.com.thiago1bd2.pages.MenuPage;

public class ContaTest extends BaseTest {

	MenuPage menuPage = new MenuPage();

	@Test
	public void adicionarConta() {
		ContasPage contasPage = menuPage.adicionarConta();

		contasPage.setNome("Conta do Teste");
		contasPage.salvarConta();

		assertEquals("Conta adicionada com sucesso!", contasPage.obterMensagemSucesso());
	}

	@Test
	public void editarConta() {
		ListarPage listarPage = menuPage.listarConta();
		
		ContasPage contasPage = listarPage.editarConta("conta 2");
		contasPage.setNome("Outro Nome Para A Conta");
		contasPage.salvarConta();
		
		assertEquals("Conta alterada com sucesso!", contasPage.obterMensagemSucesso());
	}
	
	@Test
	public void adicionarContaJaExistente() {
		ContasPage contasPage = menuPage.adicionarConta();
		
		contasPage.setNome("conta 1");
		contasPage.salvarConta();
		
		assertEquals("Já existe uma conta com esse nome!", contasPage.obterMensagemErro());
	}

}

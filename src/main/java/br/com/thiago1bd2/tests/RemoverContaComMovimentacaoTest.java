package br.com.thiago1bd2.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.thiago1bd2.core.BaseTest;
import br.com.thiago1bd2.pages.ListarPage;
import br.com.thiago1bd2.pages.MenuPage;

public class RemoverContaComMovimentacaoTest extends BaseTest {

	private MenuPage menuPage = new MenuPage();

	@Test
	public void excluirContaComMovimentacao() {
		ListarPage lPage = menuPage.listarConta();
		lPage.removerConta("Conta do Teste Alterada");

		assertEquals("Conta em uso na movimentações", lPage.obterMensagemErro());
	}
}

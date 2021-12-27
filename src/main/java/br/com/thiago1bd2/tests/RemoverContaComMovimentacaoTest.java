package br.com.thiago1bd2.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.thiago1bd2.core.BaseTest;
import br.com.thiago1bd2.core.Properties;
import br.com.thiago1bd2.pages.ListarPage;
import br.com.thiago1bd2.pages.MenuPage;

public class RemoverContaComMovimentacaoTest extends BaseTest {

	private MenuPage menuPage = new MenuPage();

	@Test
	public void excluirContaComMovimentacao() {
		ListarPage lPage = menuPage.listarConta();
		lPage.removerConta(Properties.NOME_DA_CONTA_ALTERADA);

		assertEquals("Conta em uso na movimentações", lPage.obterMensagemErro());
	}
}

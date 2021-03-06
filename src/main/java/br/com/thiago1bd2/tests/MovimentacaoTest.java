package br.com.thiago1bd2.tests;

import static br.com.thiago1bd2.utils.DataUtils.getDataDiferencaEmDias;
import static br.com.thiago1bd2.utils.DataUtils.getDataFormatada;
import static br.com.thiago1bd2.utils.DataUtils.getDataHora;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.thiago1bd2.core.BaseTest;
import br.com.thiago1bd2.pages.MenuPage;
import br.com.thiago1bd2.pages.MovimentacaoPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MovimentacaoTest extends BaseTest {

	MenuPage menuPage = new MenuPage();

	@Test
	public void test1adicionarNovaMovimentacao() {
		MovimentacaoPage movimentacaoPage = menuPage.adicionarMovimentacao();
		movimentacaoPage.setMovimentacaoReceita();
		movimentacaoPage.setDataMovimentacao(getDataFormatada(getDataDiferencaEmDias(0)));
		movimentacaoPage.setDataPagamento(getDataFormatada(getDataDiferencaEmDias(30)));
		movimentacaoPage.setDescricao("Movimentação " + getDataHora());
		movimentacaoPage.setInteressado("Selenium Teste");
		movimentacaoPage.setValor("500");
		movimentacaoPage.setConta("Conta para movimentacoes");
		movimentacaoPage.setSituacaoPago();
		movimentacaoPage.salvar();
	}

	@Test
	public void test2validarCamposObrigatorios() {
		MovimentacaoPage movimentacaoPage = menuPage.adicionarMovimentacao();
		movimentacaoPage.salvar();
		List<String> erros = movimentacaoPage.obterErros();

		assertTrue(erros.containsAll(Arrays.asList("Data da Movimentação é obrigatório",
				"Data do pagamento é obrigatório", "Descrição é obrigatório", "Interessado é obrigatório",
				"Valor é obrigatório", "Valor deve ser um número")));
	}

	@Test
	public void test3validaErroSeMovimentacaoFutura() {
		MovimentacaoPage movimentacaoPage = menuPage.adicionarMovimentacao();

		movimentacaoPage.setDataMovimentacao(getDataFormatada(getDataDiferencaEmDias(1)));

		movimentacaoPage.salvar();

		List<String> erros = movimentacaoPage.obterErros();

		assertTrue(erros.contains("Data da Movimentação deve ser menor ou igual à data atual"));
	}

}

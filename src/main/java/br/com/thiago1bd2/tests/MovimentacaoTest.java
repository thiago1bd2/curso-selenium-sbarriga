package br.com.thiago1bd2.tests;

import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import br.com.thiago1bd2.core.BaseTest;
import br.com.thiago1bd2.pages.MenuPage;
import br.com.thiago1bd2.pages.MovimentacaoPage;

public class MovimentacaoTest extends BaseTest {

	MenuPage menuPage = new MenuPage();

	@Test
	public void adicionarNovaMovimentacao() {
		MovimentacaoPage movimentacaoPage = menuPage.adicionarMovimentacao();
		movimentacaoPage.setMovimentacao("Despesa");
		movimentacaoPage.setDataMovimentacao("01/12/2021");
		movimentacaoPage.setDataPagamento("01/01/2022");
		movimentacaoPage.setDescricao("Movimentação Teste 2");
		movimentacaoPage.setInteressado("Selenium Teste");
		movimentacaoPage.setValor("100");
		movimentacaoPage.setConta("Conta Movimentação");
		movimentacaoPage.setSituacaoPago();
		movimentacaoPage.salvar();
	}

	@Test
	public void validarCamposObrigatorios() {
		MovimentacaoPage movimentacaoPage = menuPage.adicionarMovimentacao();
		movimentacaoPage.salvar();
		List<String> erros = movimentacaoPage.obterErros();

		assertTrue(erros.containsAll(Arrays.asList("Data da Movimentação é obrigatório",
				"Data do pagamento é obrigatório", "Descrição é obrigatório", "Interessado é obrigatório",
				"Valor é obrigatório", "Valor deve ser um número")));
	}
	
	@Test
	public void validaErroSeMovimentacaoFutura() {
		MovimentacaoPage movimentacaoPage = menuPage.adicionarMovimentacao();
		
		LocalDate diaFuturo = LocalDate.now().plusDays(1);
		DateTimeFormatter formatadorBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		movimentacaoPage.setDataMovimentacao(diaFuturo.format(formatadorBarra));
		
		movimentacaoPage.salvar();
		
		List<String> erros = movimentacaoPage.obterErros();
		
		assertTrue(erros.contains("Data da Movimentação deve ser menor ou igual à data atual"));
	}

}

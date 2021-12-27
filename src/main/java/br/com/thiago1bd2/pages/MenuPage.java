package br.com.thiago1bd2.pages;

import org.openqa.selenium.By;

import br.com.thiago1bd2.core.BasePage;

public class MenuPage extends BasePage {

	public ContasPage adicionarConta() {

		clicarElemento(By.linkText("Contas"));
		clicarElemento(By.linkText("Adicionar"));

		return new ContasPage();
	}

	public ListarPage listarConta() {
		clicarElemento(By.linkText("Contas"));
		clicarElemento(By.linkText("Listar"));
		return new ListarPage();
	}

	public MovimentacaoPage adicionarMovimentacao() {
		clicarElemento(By.linkText("Criar Movimentação"));
		return new MovimentacaoPage();
	}

	public ResumoPage acessarResumos() {
		clicarElemento(By.linkText("Resumo Mensal"));
		return new ResumoPage();
	}

	public HomePage acessarHome() {
		clicarElemento(By.linkText("Home"));
		return new HomePage();
	}

}

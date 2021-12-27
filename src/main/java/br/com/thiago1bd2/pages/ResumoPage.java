package br.com.thiago1bd2.pages;

import org.openqa.selenium.By;

import br.com.thiago1bd2.core.BasePage;

public class ResumoPage extends BasePage {

	public void removerMovimentacao() {
		clicarElemento(By.xpath("//span[@class='glyphicon glyphicon-remove-circle']"));
	}

	public String obterMensagemSucesso() {
		return obterTextoElemento(By.xpath("//div[@class='alert alert-success']"));
	}

	public String obterMensagemErro() {
		return obterTextoElemento(By.xpath("//div[@class='alert alert-danger']"));
	}

	public boolean hasElementosTabela() {

		return tabelaPossuiElementos("tabelaExtrato");
	}

}

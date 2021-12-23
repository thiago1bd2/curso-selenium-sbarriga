package br.com.thiago1bd2.pages;

import java.util.List;

import org.openqa.selenium.By;

import br.com.thiago1bd2.core.BasePage;

public class MovimentacaoPage extends BasePage {

	public void setMovimentacao(String tipoMovimentacao) {
		selecionarTextoVisivelCombo("tipo", tipoMovimentacao);
	}

	public void setDataMovimentacao(String data) {
		escreverTexto("data_transacao", data);
	}

	public void setDataPagamento(String data) {
		escreverTexto("data_pagamento", data);
	}

	public void setDescricao(String desc) {
		escreverTexto("descricao", desc);
	}

	public void setInteressado(String interessado) {
		escreverTexto("interessado", interessado);
	}

	public void setValor(String valor) {
		escreverTexto("valor", valor);
	}

	public void setConta(String conta) {
		selecionarTextoVisivelCombo("conta", conta);
	}

	public void setSituacaoPago() {
		clicarElemento("status_pago");
	}

	public void setSituacaoPendente() {
		clicarElemento("status_pendente");
	}

	public String obterMensagemSucesso() {
		return obterTextoElemento(By.className("alert alert-success"));
	}

	public void salvar() {
		clicarElemento(By.xpath("//button[.='Salvar']"));
	}

	public List<String> obterErros() {
//		List<WebElement> findElements = DriverFactory.getDriver().findElements(By.xpath("//div[@class='alert alert-danger']//li"));
//		List<String> elementos = new ArrayList<String>();
//		for (WebElement e : findElements) {
//			elementos.add(e.getText());
//		}
//		
//		return elementos;
		
		return obterListaElementos(By.xpath("//div[@class='alert alert-danger']//li"));
	}

}

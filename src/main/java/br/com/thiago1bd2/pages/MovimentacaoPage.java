package br.com.thiago1bd2.pages;

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
	
	public void setSituacao(String situacao) {
		
	}

}

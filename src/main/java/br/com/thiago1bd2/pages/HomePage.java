package br.com.thiago1bd2.pages;

import br.com.thiago1bd2.core.BasePage;

public class HomePage extends BasePage {

	public String obterSaldoDaConta(String conta) {
		return obterCelula("Conta", conta, "Saldo", "tabelaSaldo").getText();
	}

}

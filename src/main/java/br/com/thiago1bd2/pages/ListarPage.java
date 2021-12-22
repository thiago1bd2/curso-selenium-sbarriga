package br.com.thiago1bd2.pages;

import org.openqa.selenium.By;

import br.com.thiago1bd2.core.BasePage;

public class ListarPage extends BasePage {
	
	public ContasPage editarConta(String conta) {
		obterCelula("Conta", conta, "Ações", "tabelaContas")
			.findElement(By.xpath("./a/span[@class='glyphicon glyphicon-edit']"))
			.click();
		return new ContasPage();
	}

}

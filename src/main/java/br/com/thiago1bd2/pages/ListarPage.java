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
	
	public void removerConta(String conta) {
		obterCelula("Conta", conta, "Ações", "tabelaContas")
		.findElement(By.xpath("./a/span[@class='glyphicon glyphicon-remove-circle']"))
		.click();
	}
	
	public String obterMensagemSucesso() {
		return obterTextoElemento(By.xpath("//div[@class='alert alert-success']"));
	}
	
	public String obterMensagemErro() {
		return obterTextoElemento(By.xpath("//div[@class='alert alert-danger']"));
	}

}

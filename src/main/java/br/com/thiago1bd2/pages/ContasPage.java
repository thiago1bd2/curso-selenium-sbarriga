package br.com.thiago1bd2.pages;

import org.openqa.selenium.By;

import br.com.thiago1bd2.core.BasePage;
import br.com.thiago1bd2.core.Properties;

public class ContasPage extends BasePage {

	public void setNome(String nome) {
		escreverTexto("nome", nome);
	}

	public void salvarConta() {
		clicarElemento(By.xpath("//button[.='Salvar']"));
	}

	public String obterMensagemSucesso() {
		return obterTextoElemento(By.xpath("//div[@class='alert alert-success']"));
	}

	public String obterMensagemErro() {
		return obterTextoElemento(By.xpath("//div[@class='alert alert-danger']"));
	}

}

package br.com.thiago1bd2.pages;

import org.openqa.selenium.By;

import br.com.thiago1bd2.core.BasePage;

public class MenuPage extends BasePage {
	
	public void acessarHome() {
		
	}
	
	public void adicionarConta() {
//		clicarElemento(By.xpath("//a/span"));
//		clicarElemento(By.xpath("//li/a[.='Adicionar']"));
		
		clicarElemento(By.linkText("Contas"));
		clicarElemento(By.linkText("Adicionar"));
	}
	
	public void listarConta() {
		clicarElemento(By.linkText("Contas"));
		clicarElemento(By.linkText("Listar"));
	}
	
	public void criarMovimentacao() {
		
	}
	
	public void movimentacaoMensal() {
		
	}
	
	public void sair() {
		
	}

}

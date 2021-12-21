package br.com.thiago1bd2.pages;

import static br.com.thiago1bd2.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import br.com.thiago1bd2.core.BasePage;

public class LoginPage extends BasePage {
	
	public void acessarTelaInicial() {
		getDriver().get("https://seubarriga.wcaquino.me/login");
	}

	public void setEmail(String email) {
		escreverTexto("email", email);
	}

	public void setPassword(String pasword) {
		escreverTexto("senha", pasword);
	}

	public void logar() {
		clicarElemento(By.xpath("//button[.='Entrar']"));
	}

}

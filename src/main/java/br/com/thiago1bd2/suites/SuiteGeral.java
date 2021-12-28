package br.com.thiago1bd2.suites;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.thiago1bd2.core.DriverFactory;
import br.com.thiago1bd2.pages.LoginPage;
import br.com.thiago1bd2.tests.ContaTest;
import br.com.thiago1bd2.tests.MovimentacaoTest;
import br.com.thiago1bd2.tests.RemoverContaComMovimentacaoTest;
import br.com.thiago1bd2.tests.ResumoTest;
import br.com.thiago1bd2.tests.SaldoTest;

@RunWith(Suite.class)
@SuiteClasses({ 
	ContaTest.class, 
	MovimentacaoTest.class, 
	RemoverContaComMovimentacaoTest.class, 
	SaldoTest.class,
	ResumoTest.class })
public class SuiteGeral {
	
	private static final String email = "st@st.com";
	private static final String password = "123456";
	protected static LoginPage loginPage;
	
	@BeforeClass
	public static void resetarDados() {
		loginPage = new LoginPage();
		loginPage.acessarTelaInicial();
		loginPage.setEmail(email);
		loginPage.setPassword(password);
		loginPage.logar();
		loginPage.resetar();
		
		DriverFactory.killDriver();
	}
}

package br.com.thiago1bd2.core;

import static br.com.thiago1bd2.core.DriverFactory.getDriver;
import static br.com.thiago1bd2.core.DriverFactory.killDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import br.com.thiago1bd2.pages.LoginPage;

public class BaseTest {

	private final String email = "st@st.com";
	private final String password = "123456";
	protected LoginPage loginPage;

	@Rule
	public TestName testName = new TestName();

	@Before
	public void init() {
		loginPage = new LoginPage();
		loginPage.acessarTelaInicial();
		loginPage.setEmail(email);
		loginPage.setPassword(password);
		loginPage.logar();
	}

	@After
	public void finalizar() throws IOException, InterruptedException {
		TakesScreenshot ss = (TakesScreenshot) getDriver();
		File file = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(
				"target" + File.separator + "screenshot" + File.separator + testName.getMethodName() + ".jpg"));
		
		if (Properties.CLOSE_BROWSER) {
			killDriver();
		}
	}
}

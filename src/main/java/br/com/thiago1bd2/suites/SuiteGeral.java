package br.com.thiago1bd2.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

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

}

package br.com.thiago1bd2.core;

public class Properties {

	public static boolean CLOSE_BROWSER = true;
	public static final String NOME_DA_CONTA = "Conta de Teste";
	public static String NOME_DA_CONTA_ALTERADA = "Conta Alterada "+ System.nanoTime();
	public static final String VALOR_MOVIMENTACAO = "100.00";
	
	public static Browsers browser = Browsers.CHROME;

	public enum Browsers {
		CHROME, FIREFOX
	}
}

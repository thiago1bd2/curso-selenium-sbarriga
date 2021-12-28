package br.com.thiago1bd2.core;

public class Properties {

	public static boolean CLOSE_BROWSER = true;
	
	public static Browsers BROWSER = Browsers.CHROME;
	public static  TipoExecucao TIPO_EXECUCACO = TipoExecucao.GRID;

	public enum Browsers {
		CHROME, FIREFOX
	}
	
	public enum TipoExecucao{
		LOCAL,
		GRID
	}
}

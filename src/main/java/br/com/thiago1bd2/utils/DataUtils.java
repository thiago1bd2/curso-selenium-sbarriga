package br.com.thiago1bd2.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataUtils {

	public static LocalDate getDataDiferencaEmDias(int dias) {
		LocalDate data = LocalDate.now().plusDays(dias);
		return data;
	}

	public static String getDataFormatada(LocalDate data) {
		DateTimeFormatter formatadorBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return data.format(formatadorBarra);
	}
	
	public static String getDataHora() {
		return LocalDateTime.now().toString();
	}

}

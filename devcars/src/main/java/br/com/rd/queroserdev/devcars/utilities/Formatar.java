package br.com.rd.queroserdev.devcars.utilities;

public class Formatar {
	public String formatar(String string) {
		String regex = "//d";
		String stringFormatada = string.replaceAll(regex, string);
		return stringFormatada;
	}
}

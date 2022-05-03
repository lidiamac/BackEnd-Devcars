package br.com.rd.queroserdev.devcars.service;

import at.favre.lib.crypto.bcrypt.BCrypt;

public class Encriptar {
	public String encriptar(String senha) {
			String criptografada = BCrypt.withDefaults().hashToString(10, senha.toCharArray());
			return criptografada;
	}
}


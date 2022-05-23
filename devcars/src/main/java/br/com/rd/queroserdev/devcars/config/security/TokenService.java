package br.com.rd.queroserdev.devcars.config.security;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import br.com.rd.queroserdev.devcars.model.Cliente;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class TokenService {
	
	@Value("${forum.jwt.expiration}")
	private String expiration;
	
	@Value("${forum.jwt.secret}")
	private String secret;
	

	public String gerarToken(Authentication authentication) {
		
		Cliente logado = (Cliente) authentication.getPrincipal();
		Date hoje = new Date();
		Date dataExpiracao = new Date(hoje.getTime() + Long.parseLong(expiration));
		
		return Jwts // Convocação da nossa lib jjwt
				.builder() // Mét que cria um obj builder onde posso setar as infos p construir o token
				.setIssuer("API da DEVCARS") // Quem está gerando esse TOKEN
				.setSubject(logado // Quem é o usuário dono desse TOKEN
							.getCodCliente() //Captura seu ID que é único
							.toString()) // Converte o ID em String
							.setIssuedAt(hoje) //Data de geração do TOKEN
							.setExpiration(dataExpiracao) // Data de expiração do TOKEN
							.signWith(SignatureAlgorithm.HS256, //quem é o Algorítmo de criptografia
										secret) //Senha da minha aplicação. Usada p fazer a assinatura e gerar o rest da criptografia do token
							.compact(); //Compacta e transforma todo esse return numa única String.
	}


	public boolean isTokenValido(String token) {
		
		try {
			Jwts.parser().setSigningKey(this.secret).parseClaimsJws(token);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}


	public Integer getIdCliente(String token) {
		Claims claims = Jwts.parser().setSigningKey(this.secret).parseClaimsJws(token).getBody();
		return Integer.parseInt(claims.getSubject());
	}

	
}

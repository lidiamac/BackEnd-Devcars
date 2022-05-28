package br.com.rd.queroserdev.devcars.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import br.com.rd.queroserdev.devcars.repository.ClienteRepository;

@EnableWebSecurity
@Configuration
public class SecurityConfigurations extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private AutenticacaoService autenticacaoService;
	
	@Autowired
	private TokenService tokenService;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	
	@Override
	@Bean
	protected AuthenticationManager authenticationManager() throws Exception {
		return super.authenticationManager();
	}
	
	
	//Configurações de autenticação
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.userDetailsService(autenticacaoService)
		.passwordEncoder(new BCryptPasswordEncoder());
	}
	
	//Configurações de autorização - Controle de acesso
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers(HttpMethod.POST , "/cliente/f").permitAll()
		.antMatchers(HttpMethod.POST , "/cliente/j").permitAll()
		.antMatchers(HttpMethod.POST , "/auth").permitAll()
		.antMatchers(HttpMethod.GET , "/veiculos").permitAll()
		.antMatchers(HttpMethod.GET , "/veiculos/**").permitAll()
		.antMatchers(HttpMethod.GET , "/frete/**").permitAll()
		.antMatchers(HttpMethod.GET , "/enderecos/**").permitAll()
		.antMatchers(HttpMethod.GET , "/cartao/**").permitAll()
		.antMatchers(HttpMethod.POST, "/placeorder/**").permitAll()
		.antMatchers(HttpMethod.GET, "/placeorder/**").permitAll()
		.antMatchers(HttpMethod.GET , "/").permitAll()
		.anyRequest().authenticated().and().cors()
		.and().csrf().disable()
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
		.and().addFilterBefore(new AutenticacaoViaTokenFilter(tokenService, clienteRepository), UsernamePasswordAuthenticationFilter.class);

	}



	
	//Configurações de recursos estáticos (JavaScript, CSS, imagens, etc)
	@Override
	public void configure(WebSecurity web) throws Exception {
		
	}
	
	//Método main para encriptografar qualquer senha
//	public static void main(String[] args) {
//		System.out.println(new BCryptPasswordEncoder().encode("2MksTQqP"));
//	}
	
}

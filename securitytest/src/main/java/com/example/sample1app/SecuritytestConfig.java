package com.example.sample1app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecuritytestConfig {
	
	  
	
	 @Bean
	    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		 
		 
 
    	
			//<p>CSRFトークンの値: <span th:text="${_csrf.token}"></span></p>
    	http.csrf().disable();
    	
    	http
    	.authorizeHttpRequests(customizer -> {customizer
            .requestMatchers("/secret").permitAll()  // /hello は認証不要
            .requestMatchers("/").permitAll()
            .anyRequest().authenticated() ;
        }); // すべてのリクエストを許可)
        
        
        http.formLogin(form -> {
        	form.defaultSuccessUrl("/secret");//.loginPage("/login");
        });

        return http.build();
    }
    
    
    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){
      String username = "user";
      String password = "pass";

      UserDetails user = User.withUsername(username)
        .password(
          PasswordEncoderFactories
            .createDelegatingPasswordEncoder()
            .encode(password))
        .roles("USER")
        .build();
      return new InMemoryUserDetailsManager(user);
    }
}







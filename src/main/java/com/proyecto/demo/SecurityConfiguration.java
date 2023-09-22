package com.proyecto.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // @formatter:off
        http
                .authorizeHttpRequests((authorize) -> authorize
                        //control access privileges
                        .requestMatchers("/camas").authenticated()
                        .requestMatchers( "/administrador").authenticated()
                        .requestMatchers("/comida").authenticated()
                        .requestMatchers("/juguetes").authenticated()
                        .requestMatchers("/ropa").authenticated()
                        .requestMatchers("/aseo").authenticated()
                        .requestMatchers("/servicios").authenticated()
                        .requestMatchers("/index").authenticated()    
                        .anyRequest().permitAll()
                )
                .httpBasic(withDefaults())
                .formLogin(withDefaults());
        // @formatter:on
        return http.build();
    }

    @Bean

    // deepcode ignore HardcodedPassword: <please specify a reason of ignoring this>
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean

    public InMemoryUserDetailsManager userDetailsService() {
        PasswordEncoder passwordEncoder = passwordEncoder();
        UserDetails user = User.builder()
                .username("administrador")
                .password(passwordEncoder.encode("lamascotadeldueño"))
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(user);

    }
}

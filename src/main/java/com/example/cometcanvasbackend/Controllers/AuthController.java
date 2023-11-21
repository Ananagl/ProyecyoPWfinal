package com.example.cometcanvasbackend.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * Clase de configuración para la autenticación y autorización utilizando Spring Security.
 */
@Configuration
@EnableWebSecurity
public class AuthController extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;

    /**
     * Configura las reglas de seguridad HTTP.
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/Home").authenticated() // Requiere autenticación para la ruta "/none"
                .anyRequest().permitAll() // Permite acceso sin autenticación a otras rutas
                .and()
            .formLogin() // Configura la autenticación a través de un formulario de inicio de sesión
                .and()
            .logout() // Configura el manejo del cierre de sesión
                .logoutSuccessUrl("/") // Redirige a "/" después de cerrar sesión
                .permitAll(); // Permite a todos acceder al proceso de cierre de sesión
    }

    /**
     * Configura el codificador de contraseñas.
     *
     * @return El codificador de contraseñas BCrypt.
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    /**
     * Configura el administrador de autenticación global.
     *
     * @param auth El administrador de autenticación.
     * @throws Exception Si hay errores durante la configuración.
     */
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }

    /**
     * Crea un objeto UserDetailsService para gestionar detalles del usuario.
     *
     * @return UserDetailsService para gestionar detalles del usuario en memoria.
     */
    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user = User.withUsername("username")
            .password(passwordEncoder().encode("password"))
            .roles("USER")
            .build();
        return new InMemoryUserDetailsManager(user);
    }
}

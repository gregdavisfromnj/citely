package org.blueclawsoft.citely.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // @formatter:off
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/webjars/**").permitAll()
                .antMatchers("/js/**").permitAll()
                .antMatchers("/css/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .oauth2Login();
        // @formatter:on
    }
}
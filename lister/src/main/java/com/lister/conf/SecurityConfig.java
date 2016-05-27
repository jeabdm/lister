package com.lister.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Autowired
    public void configureGlobal( AuthenticationManagerBuilder auth ) throws Exception  {
      auth
          .jdbcAuthentication()
          .dataSource( dataSource )
          .usersByUsernameQuery( "select username,password,enabled from users where username=?" )
          .authoritiesByUsernameQuery("select u.username, ur.authority from users u, user_roles ur where u.user_id = ur.user_id and u.username =?");
    }



    @Override
    protected void configure( HttpSecurity http ) throws Exception
    {



        http.authorizeRequests()
                .antMatchers("/articulos/**").access("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
                .and()
                .formLogin()
                .defaultSuccessUrl("/Home")
                .loginPage("/login")
                .failureUrl("/login?error")
                .usernameParameter("username")
                .passwordParameter("password")
                .and()
                .logout()
                .logoutSuccessUrl("/login?logout")
                .deleteCookies("JSESSIONID")
                .invalidateHttpSession(true)
                .and()
                .csrf();


    }

}

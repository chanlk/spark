package org.chanlk.spring.db;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Chanlk
 * @date 2022/12/12
 * ~NO BUG MAKE THE WORLD BETTER~
 */
@Configuration
public class H2Cofig  extends WebSecurityConfigurerAdapter  {

    @Override
    public void configure(WebSecurity web) throws Exception {
        web
                .ignoring()
                .antMatchers("/h2-console/**");
    }

}

package com.lxx.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * spring security 配置
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/6/20 9:32
 * @since JDK 1.8
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 设置用户
     *
     * @param auth 认证用户
     * @throws Exception 异常
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
                .withUser("why").password(new BCryptPasswordEncoder().encode("why")).roles("USER")
                .and()
                .withUser("wisely").password(new BCryptPasswordEncoder().encode("wisely")).roles("USER");
        // spring security5升级后，修改了加密格式，不能直接使用下例代码，
//        auth.inMemoryAuthentication()
//                .withUser("why").password("why").roles("USER")
//                .and()
//                .withUser("wisely").password("wisely").roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                // 设置spring security对 "/" 和 "login" 路径不拦截
                .antMatchers("/", "/login").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                // 设置登录页面访问路径为 /login
                .loginPage("/login")
                // 登录成功后跳转 /chat 页面
                .defaultSuccessUrl("/chat")
                .permitAll()
                .and()
                .logout()
                .permitAll();
    }

    /**
     * 设置静态资源不拦截
     *
     * @param web web拦截
     * @throws Exception 异常
     */
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/resources/static/**");
    }
}

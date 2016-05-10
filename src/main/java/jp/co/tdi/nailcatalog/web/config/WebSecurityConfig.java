package jp.co.tdi.nailcatalog.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Webセキュリティ設定
 * @author tdi.co.jp
 *
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	/**
	 * 設定変更を行います。
	 */
	@Override
	public void configure(WebSecurity web) throws Exception {
		// 静的コンテンツに対しては認証認可から除外設定にする
		web.ignoring().antMatchers("/css/**", "/js/**", "/images/**");
	}
}

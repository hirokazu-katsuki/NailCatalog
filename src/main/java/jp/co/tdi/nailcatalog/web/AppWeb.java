package jp.co.tdi.nailcatalog.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("jp.co.tdi.nailcatalog.*")
public class AppWeb {
	public static void main(String[] args) {
		// Spring Bootの起動
		SpringApplication.run(AppWeb.class, args);
	}
}

package com.medinaqenwan.qenwanPhase1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@SpringBootApplication
@EnableR2dbcRepositories
public class QenwanPhase1Application {

	public static void main(String[] args) {
		SpringApplication.run(QenwanPhase1Application.class, args);
	}

}

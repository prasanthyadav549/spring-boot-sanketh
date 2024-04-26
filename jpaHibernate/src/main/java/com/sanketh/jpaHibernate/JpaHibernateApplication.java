package com.sanketh.jpaHibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.sql.Driver;
import java.util.Optional;

@SpringBootApplication
@EnableJpaAuditing
public class JpaHibernateApplication {

	public static void main(String[] args) {

		SpringApplication.run(JpaHibernateApplication.class, args);
	}

}

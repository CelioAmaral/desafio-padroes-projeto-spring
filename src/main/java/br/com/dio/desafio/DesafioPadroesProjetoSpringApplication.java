package br.com.dio.desafio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * DIO - Desafio Padrões de Projeto Java
 * Projeto Spring Boot gerado via Spring Initializr.
 * Os seguintes módulos foram selecionados:
 *  - Spring Data JPA;
 *  - Spring Web;
 *  - H2 Database;
 *  - OpenFeign
 *
 * @author Celio Amaral
 */

@EnableFeignClients
@SpringBootApplication
public class DesafioPadroesProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioPadroesProjetoSpringApplication.class, args);
	}

}

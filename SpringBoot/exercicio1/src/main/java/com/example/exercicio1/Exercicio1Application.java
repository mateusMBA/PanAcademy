package com.example.exercicio1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan(basePackages = {"controller", "com.example.exercicio1"})
@RestController
@SpringBootApplication
public class Exercicio1Application {

	String resposta;
	
	public static void main(String[] args) {
		SpringApplication.run(Exercicio1Application.class, args);
	}

	@GetMapping(path = "/habilidades")
	public String retornoResposta(){
		resposta = "Para conseguir subir o servidor utilizamos conhecimentos adquiridos na aula "
				+ "anterior e troca de ideias (brainstorming) entre os integrantes do grupo. <br/>"
				+ "<br/>Tentamos manter uma mentalidade receptiva, para conseguirmos captar ideias de"
				+ "todos os integrantes sobre a melhor forma de realizar a atividade.<br/>"
				+ "<br/>Optamos inicialmente por um modelo utilizando um Controler para execução da função, "
				+ "não obtivemos sucesso e retornamos ao modelo incial. ";
		return resposta;
	}
}

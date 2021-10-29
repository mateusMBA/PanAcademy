package com.example.api;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.api.model.Produto;
import com.example.api.repositories.ProdutoRepository;

@SpringBootApplication
public class ApiApplicationProduto implements CommandLineRunner{

	@Autowired
	ProdutoRepository produtoRepository; 
	
	public static void main(String[] args) {
		SpringApplication.run(ApiApplicationProduto.class, args);
	}

	//executa os comandos quando o servidor é iniciado
	@Override
	public void run(String... args) throws Exception {
		
		Produto p1 = new Produto("Arroz", 5, 10.0);
		Produto p2 = new Produto("Feijao", 5, 7.0);
		
		//os usuários serão adicionados quando o servidor for iniciado
		produtoRepository.saveAll(Arrays.asList(p1, p2));

	}
}

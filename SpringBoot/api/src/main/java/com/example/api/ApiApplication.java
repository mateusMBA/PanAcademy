package com.example.api;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.api.model.Produto;
import com.example.api.model.Usuario;
import com.example.api.repositories.ProdutoRepository;
import com.example.api.repositories.UsuarioRepository;

@SpringBootApplication
public class ApiApplication implements CommandLineRunner {

	@Autowired
	UsuarioRepository usuarioRepository; 
	
	@Autowired
	ProdutoRepository produtoRepository; 
	
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	//executa os comandos quando o servidor é iniciado
	@Override
	public void run(String... args) throws Exception {
		
		Usuario u1 = new Usuario("Maria Silva", "1234");
		Usuario u2 = new Usuario("Joao da Silva", "1234");
		
		//os usuários serão adicionados quando o servidor for iniciado
		usuarioRepository.saveAll(Arrays.asList(u1, u2));
		
		Produto p1 = new Produto("Arroz", 5, 10.0);
		Produto p2 = new Produto("Feijao", 5, 7.0);
		
		//os usuários serão adicionados quando o servidor for iniciado
		produtoRepository.saveAll(Arrays.asList(p1, p2));

	}
	
	

}

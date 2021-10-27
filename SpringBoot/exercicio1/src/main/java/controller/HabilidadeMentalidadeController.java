package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HabilidadeMentalidadeController {
	
	String resposta;
	
	@GetMapping(path = "/mentalidade")
	public String retornoResposta(){
		resposta = "oi";
		return resposta;
	}

}

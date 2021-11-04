package com.example.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mongodb.model.Agendamento;
import com.example.mongodb.model.Medico;
import com.example.mongodb.repository.AgendamentoRepository;
import com.example.mongodb.repository.MedicoRepository;

@Service
public class AgendamentoServiceImpl implements AgendamentoService {
	
	@Autowired
	AgendamentoRepository agendamentoRepository;
	
	@Autowired
	MedicoRepository medicoRepository;
	
	@Override
	public List<Agendamento> obterTodos(){
		return this.agendamentoRepository.findAll();
	}
	
	@Override
	public Agendamento obterPorCod(String cod) {
		return this.agendamentoRepository
				.findById(cod)
				.orElseThrow(() -> new IllegalArgumentException("Agendamento inexistente!"));
	}
	
	@Override
	public Agendamento criar(Agendamento agendamento) {
		
		Medico medico = this.medicoRepository
				.findById(agendamento.getMedico().getId())
				.orElseThrow(() -> new IllegalArgumentException("médico inexistente"));
		agendamento.setMedico(medico);
				
	}
	
	
}

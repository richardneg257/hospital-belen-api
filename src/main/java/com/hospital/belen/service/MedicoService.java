package com.hospital.belen.service;

import com.hospital.belen.model.Medico;
import com.hospital.belen.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoService {
    @Autowired
    private MedicoRepository medicoRepository;

    public List<Medico> listarTodos(){
        return medicoRepository.findAll();
    }

    public Medico obtenerPorId(Integer id){
        return medicoRepository.findById(id).get();
    }
}

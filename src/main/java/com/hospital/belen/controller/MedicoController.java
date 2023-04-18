package com.hospital.belen.controller;

import com.hospital.belen.model.Medico;
import com.hospital.belen.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/medicos")
public class MedicoController {
    @Autowired
    private MedicoService medicoService;

    @GetMapping // GET localhost:8081/api/v1/medicos
    public List<Medico> listarTodos(){
        return medicoService.listarTodos();
    }

    @GetMapping("/{id}") // GET localhost:8081/api/v1/medicos/5
    public Medico obtenerMedico(@PathVariable Integer id){
        return medicoService.obtenerPorId(id);
    }
}

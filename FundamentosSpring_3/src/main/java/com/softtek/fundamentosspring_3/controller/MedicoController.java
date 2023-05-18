package com.softtek.fundamentosspring_3.controller;

import com.softtek.fundamentosspring_3.model.Medico;
import com.softtek.fundamentosspring_3.service.IMedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/medicos")
public class MedicoController{
    @Autowired
    private IMedicoService service;
    @GetMapping("/listar")
    public List<Medico> listar() throws Exception{
        return service.listar();
    }
}

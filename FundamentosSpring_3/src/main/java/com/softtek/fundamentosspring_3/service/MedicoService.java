package com.softtek.fundamentosspring_3.service;

import com.softtek.fundamentosspring_3.model.Medico;
import com.softtek.fundamentosspring_3.repository.IMedicoRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class MedicoService implements IMedicoService{
    @Autowired
    private IMedicoRepo repo;
    @Override
    public List<Medico> listar() {
        return repo.listar();
    }
}

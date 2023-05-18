package com.softtek.fundamentosspring_3.repository;


import com.softtek.fundamentosspring_3.model.Medico;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MedicoRepo implements IMedicoRepo {
    @Override
    public List<Medico> listar() {
        List<Medico> medicos = List.of(
                new Medico(1, "12345678", "Juan", 30),
                new Medico(2, "87654321", "Pedro", 40),
                new Medico(3, "12345678", "Maria", 50)
        );
        return medicos;
    }
}

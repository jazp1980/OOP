package com.ucreativa.vacunacion.repositories;

import com.ucreativa.vacunacion.entities.Persona;

import java.util.Date;
import java.util.List;

public class FileRepository implements Repository{
    @Override
    public void save(Persona persona, String marca, Date fecha) {

    }

    @Override
    public List<String> get() {
        return null;
    }
}

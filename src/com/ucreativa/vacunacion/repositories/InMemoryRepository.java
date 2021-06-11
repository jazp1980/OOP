package com.ucreativa.vacunacion.repositories;

import com.ucreativa.vacunacion.entities.BitacoraVacunas;
import com.ucreativa.vacunacion.entities.Persona;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InMemoryRepository {

    private List<BitacoraVacunas> db;

    public InMemoryRepository() {

        this.db = new ArrayList<>();
    }

    public void save(Persona persona, String marca, Date fecha) {

        this.db.add(new BitacoraVacunas(persona, marca, fecha));

    }


    public List<String> get() {
        List <String> lines  = new ArrayList<>();
        for(BitacoraVacunas item: db){
            lines.add(item.getPersona().getNombre() + " - " + item.getFecha());
        }
    return lines;
    }

}

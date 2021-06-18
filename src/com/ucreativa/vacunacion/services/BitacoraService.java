package com.ucreativa.vacunacion.services;

import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;
import com.ucreativa.vacunacion.repositories.Repository;

import java.util.Date;
import java.util.List;

public class BitacoraService {

    private Repository repository;

    public BitacoraService(Repository repository) {
        this.repository = repository;
    }

    public void save(String nombre, String cedula, String txtedad, boolean txtriesgo,
                     boolean txtisAmigo, String relacion, String facebook,
                     String parentesco, String marca) {

        int edad = Integer.parseInt(txtedad);
                Persona persona;
        if(txtisAmigo){
            persona = new Amigo(nombre, cedula, edad, txtriesgo, relacion, facebook);
        }else{
            persona = new Familiar(nombre, cedula, edad, txtriesgo, parentesco);
        }
        this.repository.save(persona, marca, new Date());
    }

    public List<String> get(){
        return this.repository.get();
    }

}



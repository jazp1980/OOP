package com.ucreativa;

import com.ucreativa.familia.*;
import com.ucreativa.vacunacion.Amigo;
import com.ucreativa.vacunacion.BitacoraVacunas;
import com.ucreativa.vacunacion.Familiar;
import com.ucreativa.vacunacion.Persona;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Main {

    public static void main(String[] args) {
//      Jorge bueno = new Jorge("Hola", 41,"TV");
//
//      Rebeca esposa = new Rebeca("Hola", 91, "Nadar");
//
//      esposa.setAge();
//
//      int age = esposa.getAge();
//
//      System.out.println("Adios " + age);

        Familiar Mama  = new Familiar("Mary", "6666666",60,true,"Madre");
        Familiar Hermana  = new Familiar("Laura", "5555555",30,true,"Hermana");
        Amigo Compa  = new Amigo("Juan","2442442",35,false, "CompaBrete","JuanPerez");


        List <Persona> familia = new ArrayList<>();
        familia.add(Mama);
        familia.add(Hermana);
        familia.add(Compa);


        List <BitacoraVacunas> bitacora = new ArrayList<>();
        bitacora.add(new BitacoraVacunas(Mama,"Pfizer",new Date()));
        bitacora.add(new BitacoraVacunas(Hermana,"Aztrazeneca",new Date()));
        bitacora.add(new BitacoraVacunas(Compa,"Johnson",new Date()));
    }


}

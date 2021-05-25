package com.ucreativa;

import com.ucreativa.familia.*;


public class Main {

    public static void main(String[] args) {
      Jorge bueno = new Jorge();
      Rebeca esposa = new Rebeca("Hola");
      esposa.setAge();
      int age = esposa.getAge();
      System.out.println("Adios " + age);
    }


}

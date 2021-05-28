package com.ucreativa;

import com.ucreativa.familia.*;


public class Main {

    public static void main(String[] args) {
      Jorge bueno = new Jorge("Hola", 41,"TV");

      Rebeca esposa = new Rebeca("Hola", 91, "Nadar");
      esposa.setAge();
      int age = esposa.getAge();
      System.out.println("Adios " + age);
    }


}

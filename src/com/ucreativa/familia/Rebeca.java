package com.ucreativa.familia;

public class Rebeca {

    private int edad;
    private String Hobby;

public Rebeca (String saludo) {
    this.edad = 40;
    this.Hobby = "Nadar";
    System.out.println(saludo);
}

public int getAge () {
 return this.edad;
}

public void setAge() {
        this.edad = this.edad + 1;
    }

    public String getHobby () {
        return this.Hobby;
    }
}



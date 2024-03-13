/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dz1;

/**
 *
 * 
 */
public class Autoservice {
    private String name;
    private String newname;

    public Autoservice(String name, String newname) {
        this.name = name;
        this.newname = newname;
    }

    public void modify(){
        this.newname=this.name.replaceAll("a", "o").replaceAll("i", "e").toUpperCase();
    }

    public String getNewname() {
        return newname;
    }
    
    @Override
    public String toString(){
        return "Изначальная марка автомобиля - " + name + ", " + "Новая марка автомобиля - " + newname;
    }
}
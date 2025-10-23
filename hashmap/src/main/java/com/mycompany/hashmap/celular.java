
package com.mycompany.hashmap;

import java.util.Objects;


public class celular {
    private String marca;
    private int modelo;
    private String color;
    
    
    public celular(){
    }
    
    public celular(String marca, int modelo, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Celular{" + "Marca:'" + marca + '\'' + ", Modelo:" + modelo + ", Color:" + color + '}';
    }
    
}

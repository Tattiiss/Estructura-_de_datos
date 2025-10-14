
package com.mycompany.colas;


public class informacion {
    private int edad;
    private String nombre;
    private double estatura;

    public informacion() {
    }

    public informacion(int edad, String nombre, double estatura) {
        this.edad = edad;
        this.nombre = nombre;
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String toString() {
        return "" + nombre + "";
    }
}

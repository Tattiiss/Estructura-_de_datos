
package com.mycompany.clinica;

public class Nodos<T> {
    private T datos;
    private Nodos<T> siguiente;
    
    public int algo(T valor){
        return -1;
    }
    public Nodos(){
    }
    public Nodos(T datos){
        this.datos=datos;
    }
    public T getDatos(){
        return datos;
    }
    public Nodos setDatos(){
        this.datos = datos;
        return null;
    }
    public Nodos (T datos, Nodos<T> siguiente){
        this.datos =datos;
        this.siguiente = siguiente;
    }
    public Nodos<T> getSiguiente(){
        return siguiente;
    }
    public void setSiguiente(Nodos<T> siguiente){
        this.siguiente = siguiente;
    }
    public String toString(){
        return "|"+ this.datos+"|->";
    }
}

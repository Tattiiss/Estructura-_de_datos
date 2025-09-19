
package com.mycompany.nodoss;

public class noditos<T> {
    private T datos;
    private noditos<T> siguiente;
    
    public int algo(T valor){
        return -1;
    }
    public noditos(){
    }
    public noditos(T datos){
        this.datos = datos;
    }

    public T getDatos() {
        return datos;
    }
    public noditos setDatos(T datos){
        this.datos = datos;
        return null;
    }
    public noditos(T datos, noditos<T> siguiente){
        this.datos = datos;
        this.siguiente = siguiente;
    } 
    public noditos<T> getSiguiente(){
        return siguiente;
    }
    public void setSiguiente(noditos<T> siguiente){
        this.siguiente = siguiente;
    }
    public String toString(){
        return "|"+ this.datos+"|->";
    }
    
   
    
    
}

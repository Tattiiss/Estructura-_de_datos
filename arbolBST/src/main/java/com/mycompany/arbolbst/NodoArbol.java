
package com.mycompany.arbolbst;

import java.util.Objects;


public class NodoArbol<T> {
    private T data;
    private NodoArbol<T> izquierdo;
    private NodoArbol<T> derecho;

    public NodoArbol() {
    }

    public NodoArbol(T data) {
        this.data = data;
        this.izquierdo = izquierdo;
        this.derecho = derecho;
    }

    public NodoArbol(T data, NodoArbol<T> izquierdo) {
        this.data = data;
        this.izquierdo = izquierdo;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public NodoArbol<T> getIzquierdo() {
        return izquierdo;
    }
    
    public void setIzquierdo(NodoArbol<T> izquierdo) {
        this.izquierdo = izquierdo;
    }
    
    public NodoArbol<T> getDerecho() {
        return derecho;
    }
    
    public void setDerecho(NodoArbol<T> derecho) {
        this.derecho = derecho;
    }

   
    
    

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NodoArbol<?> that = (NodoArbol<?>) o;
        return Objects.equals(data, that.data) && Objects.equals(izquierdo, that.izquierdo) && Objects.equals(derecho, that.derecho);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, izquierdo, derecho);
    }

    @Override
    public String toString() {
        return "NodoArbolBinario{" +
                "data=" + data +
                ", izquierdo=" + izquierdo +
                ", derecho=" + derecho +
                '}';
    }
    
}

package com.mycompany.colas;

import java.util.ArrayList;
import java.util.Objects;

public class queqe<T> {
    private ArrayList<T> data;
    private int size;
    
    public queqe(){
        this.data = new ArrayList<>();
        this.size = 0;
    }
    public boolean estaVacia(){
        return data == null;
    }
    public int longitud(){
        return size;
    }
    public T frente(){
        if (estaVacia()){
            System.out.println("Esta vacia");
            return null;
        } else {
            T paciente = this.data.get(0);
            
        if (paciente instanceof informacion) {
            informacion info = (informacion) paciente;
                System.out.println("Atendiendo: " + info.getNombre() + ", Edad: " + info.getEdad() + ", Estatura: " + info.getEstatura());
            } 
            this.data.remove(0);
            return paciente;
        }
        
    }
    public void encolar(T valor) {
        this.data.add(valor);
        this.size++;
    }
    public T desEncolar (){
         if (estaVacia()) {
            System.out.println("Esta vacia");
            return null;
        }
        T eliminado = this.data.remove(0);
        this.size--;
        return eliminado;
    }
    public int getSize() {
        return this.size;
    }
    public void transversal() {
        System.out.print("Lista de espera: ");
        for (int i = 0; i < this.size; i++) {
            System.out.print(Objects.toString(this.data.get(i)) + " -> ");
        }
        System.out.println();
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = 0; i < this.size; i++) {
            sb.append(Objects.toString(this.data.get(i)));
            if (i < this.size - 1) sb.append(", ");
        }
        sb.append(" ]");
        return sb.toString();
    }
    
    
}

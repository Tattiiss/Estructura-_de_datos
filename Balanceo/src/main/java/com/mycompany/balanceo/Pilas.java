
package com.mycompany.balanceo;

import java.util.ArrayList;

public class Pilas<T> {
    private ArrayList<T> datos;

    public Pilas(T base) {
        datos = new ArrayList<>();
        datos.add (base);
    }

    public boolean isEmpty(){
        return this.datos.size() == 1;
    }

    public int longitud(){
        return this.datos.size();
    }

    public void push(T dato){
        this.datos.add(dato);
    }

    public T pop(){
        if (datos.size() > 1) { 
            return datos.remove(datos.size() - 1);
        } else {
            return null;
        }
    }

    public T peek(){
        return this.datos.get(this.datos.size()-1);
    }
    

    @Override
    public String toString(){
        String str= "";
        for (int i = 0; i < datos.size(); i++) {
            System.out.println(datos.get(i)+" ");
        }
        return str;
    }

    
}

package com.mycompany.colas;

public class Colas {

    public static void main(String[] args) {
        queqe<Object> qq = new queqe<>();
        
        qq.encolar(new informacion(26, "Yeonjun", 1.82));
        qq.encolar(new informacion(24, "Soobin", 1.85));
        qq.encolar(new informacion(24, "Beomgyu", 1.80));
        qq.encolar(new informacion(23, "Taehyun", 1.77));
        
        qq.transversal();
        System.out.println("Al frente: " + qq.frente());
        
        qq.desEncolar();
        qq.transversal();
        
        qq.encolar(new informacion(23, "Kai", 1.83));
        
        System.out.println("Esta vacia? " + qq.estaVacia());
    }
}

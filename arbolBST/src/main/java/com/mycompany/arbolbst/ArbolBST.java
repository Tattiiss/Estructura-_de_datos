
package com.mycompany.arbolbst;

public class ArbolBST<T> {

    public static void main(String[] args) {
        ArbolBin<Integer> arbol = new ArbolBin<>();
        
        arbol.insertar(4);
        arbol.insertar(1);
        arbol.insertar(8);
        arbol.insertar(7);
        arbol.insertar(3);
        System.out.println("Inorden");
        arbol.transversal("inorden");
        
        System.out.println("PostOrden");
        arbol.transversal("postorden");

        arbol.eliminar(7);
        System.out.println("Eliminar 7");
        arbol.transversal("inorden");
        
        NodoArbol<Integer> encontrado = arbol.buscar(4);
        if (encontrado != null) {
            System.out.println("Valor encontrado: " + encontrado.getData());
        } else {
            System.out.println("Valor no encontrado.");
        }
    }
}

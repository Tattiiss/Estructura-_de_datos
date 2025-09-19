
package com.mycompany.nodoss;


public class Nodoss {

    public static void main(String[] args) {
        ListaLigada<Integer> ll = new ListaLigada<>();
        System.out.println("Esta vacia ? = " + ll.estaVacia() );
        ll.agregar(5);
        ll.agregar(10);
        ll.agregar(15);
        ll.agregar(25);
        ll.agregar(35);
        ll.trasversal();
        System.out.println(ll.buscar(25));
        System.out.println(ll.actualizar(15,16));
        ll.trasversal();

        System.out.println("Se elimina el primero:");
        ll.eliminarInicio();
        ll.trasversal();
        
        System.out.println("Eliminar el final");
        ll.eliminarFinal();
        ll.trasversal();
        
        System.out.println("Agregar al inicio 45:");
        ll.agregarInicio(45);
        ll.trasversal();
        
        System.out.println("Agregar en posicion 2:");
        ll.agregarPosición(2, 55);
        ll.trasversal();
        
        System.out.println("Eliminar posicion 1:");
        ll.eliminarPosicion(1);
        ll.trasversal();
        
        System.out.println("Agregar al final 65:");
        ll.agregar(65);
        ll.trasversal();
    }
}

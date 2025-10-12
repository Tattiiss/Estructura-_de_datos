
package com.mycompany.clinica;

public class Clinica {

    public static void main(String[] args) {
        ListLig<Object> ll = new ListLig<>();
        System.out.println("Lista de Pacientes " + ll.estaVacia() );
        
        // Registrar
        ll.agregar(new Informacion(26, "Yeonjun", 1.82));
        ll.agregar(new Informacion(24, "Soobin", 1.85));
        ll.agregar(new Informacion(24, "Beomgyu", 1.80));
        ll.agregar(new Informacion(23, "Taehyun", 1.77));
        
        //Agregar
        System.out.println("Agregar Paciente:");
        ll.agregar(new Informacion(23, "Kai", 1.83));
        ll.trasversal();
        
        //Atender primero
        System.out.println("En consulta");
        ll.atenderPac();
        
        //Mostrar todos
        System.out.println("Lista de Espera");
        ll.trasversal();
        
        //Atender
        System.out.println("En consulta");
        ll.atenderPac();
        System.out.println("En consulta");
        ll.atenderPac();
        System.out.println("En consulta");
        ll.atenderPac();
        System.out.println("En consulta");
        ll.atenderPac();
        ll.trasversal();
        
        //Verificar cola
        System.out.println("Lista de Pacientes " + ll.estaVacia() );
        
        ll.atenderPac();
    }
}

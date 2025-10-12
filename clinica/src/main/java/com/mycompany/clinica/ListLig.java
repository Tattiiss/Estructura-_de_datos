
package com.mycompany.clinica;

public class ListLig<T> {
    Nodos<T> head;
    int tamanio = 0;
    Nodos<T> currNode;
    
    public ListLig(){
    }
    public boolean estaVacia(){
        return head == null;
    }
    public void agregar(T valor){
        if (this.head == null){
            // head = nuevo
            this.head = new Nodos<>(valor);
            this.tamanio++;
        }else {
            // encontrar el iultimo y agregar en nuevo
            currNode = this.head;
            while (currNode.getSiguiente() != null){
                currNode = currNode.getSiguiente();
            }
            currNode.setSiguiente(new Nodos<>(valor));
            this.tamanio++;
        }
    }
    public void trasversal(){
        currNode = this.head;
        while (currNode != null){
            System.out.print(currNode);
            currNode = currNode.getSiguiente();
        }
        System.out.println();
    }
    public void atenderPac(){
        if (estaVacia()){
            System.out.println("No hay pacientes");
        } else {
            Informacion atendido = (Informacion) head.getDatos();
            System.out.println("Nombre: " + atendido.getNombre() + ", Edad: " + atendido.getEdad() + ", Estatura: " + atendido.getEstatura() + "");
            head = head.getSiguiente();
            tamanio--;
        }
    }
}

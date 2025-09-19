package com.mycompany.nodoss;


public class ListaLigada<T> {
    noditos<T> head;
    int tamanio = 0;
    noditos<T> currNode;

    public ListaLigada() {
    }

    public boolean estaVacia(){
        return head == null;
    }

    public int getTamanio(){
        return this.tamanio;
    }

    public void agregar(T valor){
        if (this.head == null){
            // head = nuevo
            this.head = new noditos<>(valor);
            this.tamanio++;
        }else {
            // encontrar el iultimo y agregar en nuevo
            currNode = this.head;
            while (currNode.getSiguiente() != null){
                currNode = currNode.getSiguiente();
            }
            currNode.setSiguiente(new noditos<>(valor));
            this.tamanio++;
        }
    }
    
    public void agregarInicio(T valor){
        if (this.head==null){
            this.head=new noditos(valor);
            this.tamanio++;
        } else {
            this.head= new noditos(valor, this.head);
        }
    }
    
    public void agregarPosición(int posicion, T valor){
        currNode=head;
        for(int i=0; i< posicion -1;i++){
            currNode = currNode.getSiguiente();
        }
        
        noditos<T> n = new noditos<>(valor);
        n.setSiguiente(currNode.getSiguiente());
        currNode.setSiguiente(n);
        tamanio++;
    }

    public int buscar(T valor){
        currNode = this.head;
        int contador = 0;
        while (currNode != null){
            if(currNode.getDatos() == valor){
                return contador;
            }
            contador++;
            currNode = currNode.getSiguiente();
        }
        return -1;
    }

    public boolean actualizar(T actual, T nuevo){
        currNode = this.head;
        while (currNode != null){
            if(currNode.getDatos() == actual){
                currNode.setDatos(nuevo);
                return true;
            }
            currNode = currNode.getSiguiente();
        }
        return false;
    }
    public void trasversal(){
        currNode = this.head;
        while (currNode != null){
            System.out.print(currNode);
            currNode = currNode.getSiguiente();
        }
        System.out.println();
    }
    // Eliminar el primer nodo
    public void eliminarInicio() {
        head = head.getSiguiente();
        tamanio--;
    }

// Eliminar el último nodo
    public void eliminarFinal() {
        if (head.getSiguiente() == null) {
            head = null;
        } else {
            currNode = head;
            while (currNode.getSiguiente().getSiguiente() != null){
                currNode = currNode.getSiguiente();
            }
            currNode.setSiguiente(null);
        }
        tamanio--;
    }


    public void eliminarPosicion(int posicion) {
        if (posicion == 0) {
            head=head.getSiguiente();
            return; // si la posición es igual a 0 sería lo mismo que el Inicio
        } else{
            currNode =head;
            for(int i=0;i<posicion -1 ;i++){
                currNode= currNode.getSiguiente();
            }
            currNode.setSiguiente(currNode.getSiguiente().getSiguiente());
        }
        tamanio--;
    }
}

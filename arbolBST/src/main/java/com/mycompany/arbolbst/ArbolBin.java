
package com.mycompany.arbolbst;


public class ArbolBin<T extends Comparable<T>>{
    private NodoArbol<T> raiz;
    
    
    public ArbolBin(){
        raiz = null;
    }
    
    public void insertar(T data){
        raiz = insertarRe(raiz, data);
    }
    private NodoArbol<T> insertarRe(NodoArbol<T> currNode, T data){
        if(currNode == null){
            return new NodoArbol<>(data);
        }
       if (data.compareTo(currNode.getData()) < 0) {
            currNode.setIzquierdo(insertarRe(currNode.getIzquierdo(), data));
        } else if (data.compareTo(currNode.getData()) > 0) {
            currNode.setDerecho(insertarRe(currNode.getDerecho(), data));
        }

        return currNode;
    }
    public NodoArbol<T> buscar(T data){
        return buscarRe(this.raiz, data);
    }
    private NodoArbol<T> buscarRe(NodoArbol<T> currNode, T valor){
        if (currNode == null || valor.compareTo(currNode.getData()) == 0) {
            return currNode;
        }

        if (valor.compareTo(currNode.getData()) < 0) {
            return buscarRe(currNode.getIzquierdo(), valor);
        } else {
            return buscarRe(currNode.getDerecho(), valor);
        }
    }
    public void eliminar(T valor){
        this.raiz = eliminarRe(this.raiz, valor);
    }
    private NodoArbol eliminarRe(NodoArbol<T> currNode, T valor){
        if (currNode == null){
            return currNode;
        }
        
        if (valor.compareTo(currNode.getData()) < 0) {
            currNode.setIzquierdo(eliminarRe(currNode.getIzquierdo(), valor));
        } else if (valor.compareTo(currNode.getData()) > 0) {
            currNode.setDerecho(eliminarRe(currNode.getDerecho(), valor));
        } else {
            if (currNode.getIzquierdo() == null && currNode.getDerecho() == null) {
                return null;
            }
            else if (currNode.getIzquierdo() == null) {
                return currNode.getDerecho();
            } else if (currNode.getDerecho() == null) {
                return currNode.getIzquierdo();
            }
            else {
                T smallestValue = valC(currNode.getDerecho());
                currNode.setData(smallestValue);
                currNode.setDerecho(eliminarRe(currNode.getDerecho(), smallestValue));
            }
        }
        return currNode;
    }
    private T valC (NodoArbol<T> nodo) {
        T menor = nodo.getData();
        while (nodo.getIzquierdo() != null) {
            nodo = nodo.getIzquierdo();
            menor = nodo.getData();
        }
        return menor;
    }
    public void transversal(String formato) {
        if (formato.equals("inorden")) {
            recorridoIn(this.raiz);
        } else if (formato.equals("preorden")) {
            recorridoPre(this.raiz);
        } else if (formato.equals("postorden")) {
            recorridoPos(this.raiz);
        } 
    }
    private void recorridoIn(NodoArbol<T> currNode) {
        if (currNode != null) {
            recorridoIn(currNode.getIzquierdo());
            System.out.println(currNode.getData());
            recorridoIn(currNode.getDerecho());
        }
    }
    private void recorridoPre(NodoArbol<T> currNode) {
        if (currNode != null) {
            System.out.println(currNode.getData());
            recorridoPre(currNode.getIzquierdo());
            recorridoPre(currNode.getDerecho());
        }
    }
    private void recorridoPos(NodoArbol<T> currNode) {
        if (currNode != null) {
            recorridoPos(currNode.getIzquierdo());
            recorridoPos(currNode.getDerecho());
            System.out.println(currNode.getData());
        }
    }
}

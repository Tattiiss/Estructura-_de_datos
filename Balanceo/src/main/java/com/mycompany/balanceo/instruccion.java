
package com.mycompany.balanceo;


public class instruccion<T> {
    public static boolean verificar(String entrada) {
        Pilas<Character> pila = new Pilas<>('#'); 

        for (char c : entrada.toCharArray()) {
            System.out.println(pila);
            if (c == '{') {
                pila.push(c);
                System.out.println("Push: " + c);
            } 
            else if (c == '}') {
                if (pila.isEmpty() || pila.pop() != '{') {
                    System.out.println("Pop: " + c);
                    System.out.println("No balnceado :(");
                    return false;
                } else {
                    System.out.println("Pop: " + c);
                }
            }
        }
        System.out.println(pila);
        
        if (pila.isEmpty()) {
            System.out.println("Balanceado :)");
            return true;
        } else {
            System.out.println("No balanceado :(");
            return false;
        }
    }
}

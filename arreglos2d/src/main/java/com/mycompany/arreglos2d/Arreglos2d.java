package com.mycompany.arreglos2d;

public class Arreglos2d <T>{
    public static void main(String[] args) {
        System.out.println("Prueba de la clase Array2D");
        
        ArrayADT<String> data = new ArrayADT<>(8, 8);
        
        String[] pNegras = {"\u265C", "\u265E", "\u265D", "\u265B", "\u265A", "\u265D", "\u265E", "\u265C"};
        for (int c = 0; c < 8; c++) {
            data.establecerElemento(pNegras[c], c, 0);
        }

        for (int c = 0; c < 8; c++) {
            data.establecerElemento("\u265F", c, 1);
        }

        String[] pBlancas = {"\u2656", "\u2658", "\u2657", "\u2655", "\u2654", "\u2657", "\u2658", "\u2656"};
        for (int c = 0; c < 8; c++) {
            data.establecerElemento(pBlancas[c], c, 7);
        }

        for (int c = 0; c < 8; c++) {
            data.establecerElemento("\u2659", c, 6);
        }

        for (int r = 2; r <= 5; r++) {
            for (int c = 0; c < 8; c++) {
                data.establecerElemento(" ", c, r);
            }
        }

        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                System.out.print(data.obtenerElemento(r, c) + " ");
            }
            System.out.println();
        }
    }
}

    
    

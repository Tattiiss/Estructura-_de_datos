package com.mycompany.arreglos2d;

class ArrayADT<T> {
    private T[][] tablero;
    private  int ren;
    private int col;
    
    public ArrayADT(int ren, int col) {
        this.ren = ren;
        this.col = col;
        this.tablero = (T[][]) new Object[ren][col];
    }

    ArrayADT(int r) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public  T obtenerElemento(int r, int c){
        if(r >= 0 && r < ren && c >= 0 && c < col) {
            return (T) tablero[r][c];
        }else {
            return null;
        }
    }

    public void establecerElemento(T dato, int r, int c){
        if(r >= 0 && r < ren && c >= 0 && c < col){ 
            tablero[r][c] = dato; 
        }else  { 
            System.out.println("No existe esa posicion en el array"); 
        } 
    }

    public int longitud(){
        return this.ren;
    }

    public void limpiar(T dato){
        for(int i=0; i<ren; i++){
            for (int j=0; j<col; j++){
                tablero[i][j] = dato;
            }
        }
    }

    public int getRowSize(){
        return ren;
    }
    
    public int getColSize(){
        return col;
    }

    public String toString() {
        String res = "";
        for (int r = 0; r < getRowSize(); r++) {
        for (int c = 0; c < getColSize(); c++) {
            res += (tablero[r][c] == null ? " " : tablero[r][c]) + " ";
        }
        res += "\n"; 
    }
    return res;
    }

}

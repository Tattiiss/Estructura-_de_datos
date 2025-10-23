
package com.mycompany.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

    public static void main(String[] args) {
        Map <Integer, celular> celu = new HashMap <>(); 
        
        celu.put(1, new celular("Patito", 128, "negro"));
        celu.put(2, new celular("Redmi", 743, "blanco"));
        celu.put(3,new celular("Acme", 456, "verde"));
        celu.put(4, new celular("Moto", 432, "azul"));
        celu.put(5, new celular("Huawei", 126, "amarillo"));
        celu.put(6, new celular("Samsung", 875, "negro"));
        celu.put(7, new celular("Nokia", 934, "rosa"));
        celu.put(8, new celular("BlackBerry", 523, "blanco"));
        celu.put(9, new celular("alcatel", 197, "celeste"));
        celu.put(10, new celular("Sony Ericson", 638, "plata"));
        System.out.println("Contenido del HashMap: ");
        for (Integer val : celu.keySet()) {
            celular cla = celu.get(val);
            System.out.println( val + " -> " + cla);
        }
        
        System.out.println();
        System.out.println("Obtener valores");
        celular num = celu.get(2);
        System.out.println("Valor obtenido: " + num);
        celular er = celu.get(7);
        System.out.println("Valor obtenido: " + er);
        
        System.out.println();
        celu.remove(1);
        celu.remove(3);
        for (Integer val : celu.keySet()) {
            celular cla = celu.get(val);
            System.out.println( val + " -> " + cla);
        }
    }
}

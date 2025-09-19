//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main<T> {
    public static void main(String[] args) {
        SetADT<Integer> conjunto = new SetADT<>();
        SetADT<Integer> conjuntoD = new SetADT<>();

        conjunto.agregar(2);
        conjuntoD.agregar(2);
        conjunto.agregar(23);
        conjuntoD.agregar(23);
        conjunto.agregar(11);
        conjunto.agregar(22);
        conjuntoD.agregar(13);
        conjunto.agregar(12);
        conjunto.agregar(15);
        conjunto.agregar(15);
        conjuntoD.agregar(16);
        conjuntoD.agregar(7);
        System.out.println(conjunto);


        System.out.println("D es subconjunto de 1? " + conjuntoD.subConjunto(conjunto));


        SetADT<Integer> union = conjunto.union(conjuntoD);
        System.out.println("Unión 1UD: " + union);


        SetADT<Integer> interseccion = conjunto.intersecion(conjuntoD);
        System.out.println("Intersección 1 y D: " + interseccion);


        SetADT<Integer> diferencia = conjunto.diferencia(conjuntoD);
        System.out.println("Diferencia 1-D: " + diferencia);


        SetADT<Integer> conjuntoT = new SetADT<>();
        conjuntoT.agregar(5);
        conjuntoT.agregar(11);
        conjuntoT.agregar(21);
        System.out.println("1 es igual a T? " + conjunto.equals(conjuntoT));

    }
}
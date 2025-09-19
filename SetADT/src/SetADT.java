import java.util.ArrayList;

public class SetADT<T> {
    public ArrayList<T> data;

    public SetADT(){
        data = new ArrayList<>();
    }
    public int longitud(){
        return data.size();
    }
    public boolean contiene (T elemento){
        return data.contains(elemento);
    }
    public void agregar (T elemento){
        if(!this.contiene(elemento)){
            data.add(elemento);
        }
    }
    public void eliminar(T elemento){
        data.remove(elemento);
    }
    public String toString(){
        String resultado = "";
        for (T t: data){
            resultado += "," +t.toString();
        }
        return resultado;
    }
    public boolean equals(SetADT<T> otroConjunto){
        for (T elemento : this.data) {
            if (!otroConjunto.contiene(elemento)) {
                return false;
            }
        }
        return true;
    }
    public boolean subConjunto(SetADT<T> otroConjunto){
        for (T elemento : this.data){
            if (otroConjunto.contiene(elemento))
                return false;
        }
        return true;
    }
    public SetADT<T> union(SetADT<T> otroConjunto){
        SetADT<T> resultado = new SetADT<>();
        for (T elemento : this.data) {
            resultado.agregar(elemento);
        }
        for (T elemento : otroConjunto.data) {
            resultado.agregar(elemento);
        }
        return resultado;
    }

    public SetADT<T> intersecion(SetADT<T> otroConjunto){
        SetADT<T> resultado = new SetADT<>();
        for (T elemento : this.data) {
            if (otroConjunto.contiene(elemento)) {
                resultado.agregar(elemento);
            }
        }
        return resultado;
    }
    public SetADT<T> diferencia(SetADT<T> otroConjunto) {
        SetADT<T> resultado = new SetADT<>();
        for (T elemento : this.data) {
            if (!otroConjunto.contiene(elemento)) {
                resultado.agregar(elemento);
            }
        }
        return resultado;
    }

}


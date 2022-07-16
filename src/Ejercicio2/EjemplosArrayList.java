
package Ejercicio2;

import java.util.ArrayList;

public class EjemplosArrayList {
    
    public static void main(String[] args) {
        
        //Entre diamantes recibe cualquier cosa
        ArrayList<Object> lista = new ArrayList<>();
        //agregando elementos
        lista.add(1);
        lista.add("Nicolas");
        lista.add(true);
        
        System.out.println(lista);
        
        //Obtener datos especificos
        System.out.println(lista.get(1));
        
        //Traer todos los datos con for
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));  
        }
        
        //Limpiar la lista
        lista.clear();
        System.out.println(lista);
        
    }
}

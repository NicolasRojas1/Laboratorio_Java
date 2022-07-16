
package Ejercicio2;

import java.util.ArrayList;
import laboratoriofundamentos2.Atleta;

public class Ejemplo2 {
    
    public static void main(String[] args) {
        
        //Creo el atleta
        Atleta atleta1 = new Atleta();
        atleta1.setNombre("David");
        atleta1.setPais("Colombia");
        atleta1.setTiempo(15);
        
        Atleta atleta2 = new Atleta();
        atleta2.setNombre("Nicolas");
        atleta2.setPais("Panama");
        atleta2.setTiempo(25);
        
        //Creo la lista
        ArrayList<Atleta> atletas = new ArrayList<>();
        //Lo agrego
        atletas.add(crearAtleta(atleta1));
        atletas.add(crearAtleta(atleta2));
        //imprimo la lista
        System.out.println(atletas);
         
    }
    //intento metodo
    //void --> no retorna nada
    //object --> retorna el objeto enviado
    
    public static Atleta crearAtleta(Atleta a){
        a.setNombre("nombre");
        return a;
    }
}

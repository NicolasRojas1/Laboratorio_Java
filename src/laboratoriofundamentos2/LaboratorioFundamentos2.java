
package laboratoriofundamentos2;
import java.util.Scanner;

public class LaboratorioFundamentos2 {


    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        //5. Creando el arreglo para Atleta
        System.out.println("Ingrese la cantidad de atletas");
        int n = teclado.nextInt();
        Atleta[] atleta = new Atleta[n];
        
        
        
        //6. Ingresando datos
        for(int i = 0; i < atleta.length; i++){
            //Toca colocarlo para que no se llene el espacio
            teclado.nextLine();
            atleta[i] = new Atleta(); //creo un atleta en cada ciclo 
            System.out.println("Ingrese el nombre");
            atleta[i].setNombre(teclado.nextLine());
            System.out.println("Ingrese el pais");
            atleta[i].setPais(teclado.nextLine());
            System.out.println("Ingrese el tiempo");
            atleta[i].setTiempo(teclado.nextDouble());
            
        }
//        Metodo burbuja, pueden buscar metodos de ordenamiento vectorial
//        for (int i = 0; i < A.length - 1; i++) {
//            for (int j = 0; j < A.length - i - 1; j++) {                                                              
//                if (A[j + 1] < A[j]) {
//                    aux = A[j + 1];
//                    A[j + 1] = A[j];
//                    A[j] = aux;
//                }
//            }
//        }

        //Metodo burbuja
        Atleta aux; 
        for (int i = 0; i < atleta.length - 1; i++) {
            for (int j = 0; j < atleta.length - i - 1; j++) {
                //aqui les bota de menor a mayor
                if (atleta[j + 1].getTiempo() < atleta[j].getTiempo()) {
                    aux = atleta[j + 1];
                    atleta[j + 1] = atleta[j];
                    atleta[j] = aux;
                }
            }
        }
     
        //Imprimiendo con for each
        for(Atleta a: atleta){
            System.out.println(a);
        }
        
        System.out.println(atleta[0].getNombre()+" es el de menor tiempo, con un registro de: "+atleta[0].getTiempo());
        System.out.println(atleta[atleta.length - 1].getNombre()+" es el de mayor tiempo, con un registro de: "+atleta[atleta.length - 1].getTiempo());
    }
    
}

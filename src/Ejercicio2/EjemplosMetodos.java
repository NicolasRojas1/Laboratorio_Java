
package Ejercicio2;

public class EjemplosMetodos {
    
    public static void main(String[] args) {
        
        int j = 3;
        int m = 5;
        
        double s = Sumar(j, m);
        Mostrar(s);
        
    }
    
    //static --> solo se puede llamar con la clase
    public static double Sumar(int a, int b){
        int resultado = a + b; 
        return resultado;
    }
    
    public static void Mostrar(double x){
        System.out.println("El resultado es: "+ x);
    }
    
}


package laboratoriofundamentos2;

public class Atleta {
    
    //1. Se crean los atributos de la clase "plantilla"
    private String nombre;
    private String pais;
    private double tiempo;
    
    //2. Se crea un constructor () --> para crear el objeto 
    public Atleta() {
    }
    
    public Atleta (String nombre) {
        this.nombre = nombre;
    }
    
    //3. Metodos get y set para acceder a los atributos 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }
    
    //4. Metodo to String para poder ver la informacion del objeto creado
    @Override
    public String toString() {
        return "nombre= " + nombre + ", pais= " + pais + ", tiempo= " + tiempo + '}';
    }  
}

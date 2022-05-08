
package problema1;

public class Estudiante {
    private double calMateria1;
    private double calMateria2;
    private double calMateria3;
    private double promedio;
    private String nombreEstudiante;
    
    public Estudiante(double cal){
        calMateria1 = cal;
    }
    
    public Estudiante(double cal, String n){
        calMateria1 = cal;
        nombreEstudiante = n;
    }
    public void establecerNombreEstudiante(String n){
        nombreEstudiante = n;
    }
    public String obtenerNombreEstudiante(){
        return nombreEstudiante;
    }
    public void establecerCalMateria1(double cal){
        calMateria1 = cal;  
    }
    public double obtenerCalMateria1(){
        return calMateria1;
    }
    
    public void establecerCalMateria2(double cal){
        calMateria2 = cal;  
    }
    public double obtenerCalMateria2(){
        return calMateria2;
    }
    
    public void establecerCalMateria3(double cal){
        calMateria3 = cal;  
    }
    public double obtenerCalMateria3(){
        return calMateria3;
    }
    
    public void calcularPromedio(){
        promedio = (calMateria1 
                + obtenerCalMateria2() 
                + obtenerCalMateria3())/3;
    }
    public double obtenerPromedio(){
        return promedio;
    }
    
    public String toString() {
        String cadena = String.format("Datos del estudiante\n" + "Nombre: %s\n" + "Calificacion materia 1: %.2f\n" + "Calificacion materia 2: %.2f\n" + "Calificacion materia 3: %.2f\n"+ "Promedio de calificaciones: %.2f\n",
                obtenerNombreEstudiante(),calMateria1,obtenerCalMateria2(),obtenerCalMateria3(),obtenerPromedio());
        return cadena;
    }
    
}

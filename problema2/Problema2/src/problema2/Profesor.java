/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

public class Profesor {

    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;
    
    public Profesor(double suelBa){
        sueldoBasico = suelBa;
    }
    
    public Profesor(double suelBa, String ced){
        sueldoBasico = suelBa;
        cedula = ced;
    }
    
    public void estbalecerNombre(String nom){
        nombre = nom;
    }
    public String obtenerNombre(){
        return nombre;
    }
    
    public void estbalecerApellido(String ape){
        apellido= ape;
    }
    public String obtenerApellido(){
        return apellido;
    }
    
    public void establecerSueldoBasico(double suelBa){
        sueldoBasico = suelBa;
    }
    public double obtenerSueldoBasico(){
        return sueldoBasico;
    }
    
    public void establecerSueldoTotal(){
        sueldoTotal = obtenerSueldoBasico() + obtenerSueldoBasico() * 0.20;
    }
    public double obtenerSueldoTotal(){
        return sueldoTotal;
    }
    
    public void establecerCedula(String ced){
        cedula = ced;
    }
    public String obtenerCedula(){
        return cedula;
    }
    
    public String toString() {
        String cadena = String.format("Datos del profesor\n" + "Nombre: %s\n" + "Apellido: %s\n" + "Sueldo Basico : %.2f\n" + "Sueldo Total: %.2f\n" + "Cedula: %s\n",
                obtenerNombre(), obtenerApellido(),obtenerSueldoBasico(),obtenerSueldoTotal(),obtenerCedula());
        return cadena;
    }

}

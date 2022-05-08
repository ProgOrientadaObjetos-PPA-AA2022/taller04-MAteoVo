/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

public class Automotor {
    private String cedulaDuenio;
    private String marcaVehiculo;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;
    private int anioActual;
    
    public Automotor(String marca){
        marcaVehiculo = marca;
    }
    public Automotor(String marca, int anioAct){
        marcaVehiculo = marca;
        anioActual = anioAct;
    }
    
    public void establecerCedulaDuenio(String cedu){
        cedulaDuenio = cedu;
    }
    public String obtenerCedulaDuenio(){
        return cedulaDuenio;
    }
    
    public void establecerMarcaVehiculo(String marca){
        marcaVehiculo = marca;
    }
    public String obtenerMarcaVehiculo(){
        return marcaVehiculo;
    }
    
    public void establecerAnioFabricacion(int anioFac){
        anioFabricacion = anioFac;
    }
    public int obtenerAnioFabricacion(){
        return anioFabricacion;
    }
    
    public void establecerAnioActual(int anioAct){
        anioActual = anioAct;
    }
    public int obtenerAnioActual(){
        return anioActual;
    }
    
    public void establecerValorVehiculo(double valVei){
        valorVehiculo = valVei;
    }
    public double obtenerValorVehiculo(){
        return valorVehiculo;
    }
    
    public void establecerValorMatricula(){
        valorMatricula = ((obtenerValorVehiculo() * 0.002)/100)*(obtenerAnioActual() - obtenerAnioFabricacion());
    }
    public double obtenerValorMatricula(){
        return valorMatricula;
    }
    
    public String toString() {
        String cadena = String.format("Datos del automotor\n" + "Cedula dueño: %s\n" + "Marca Vehiculo: %s\n" + "Año Fabricacion : %d\n" + "Valor Vehiculo: %.2f\n" + "Valor Matricula: %.2f\n",
                obtenerCedulaDuenio(), obtenerMarcaVehiculo(),obtenerAnioFabricacion(),obtenerValorVehiculo(),obtenerValorMatricula());
        return cadena;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema3;

public class Ejecutor {
    public static void main(String[] args) {
        Automotor au = new Automotor("Chevrolete");
        au.establecerCedulaDuenio("1104984214");
        au.establecerAnioFabricacion(2019);
        au.establecerValorVehiculo(25999);
        au.establecerAnioActual(2022);
        au.establecerValorMatricula();
        System.out.printf("%s\n", au);
        
        Automotor au2 = new Automotor("Kia",2022);
        au2.establecerCedulaDuenio("1184900234");
        au2.establecerAnioFabricacion(2009);
        au2.establecerValorVehiculo(49999);
        au2.establecerValorMatricula();
        System.out.printf("%s\n", au2);
               
    }
}

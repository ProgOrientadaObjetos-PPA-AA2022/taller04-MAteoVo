/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;

public class Ejecutable {
    public static void main(String[] args){
        Estudiante e = new Estudiante(7);
        e.establecerNombreEstudiante("Juan");
        e.establecerCalMateria2(5.99);
        e.establecerCalMateria3(9.99);
        e.calcularPromedio();
        System.out.printf("%s\n", e);
        
        Estudiante e2 = new Estudiante(10, "Diego");
        e2.establecerCalMateria2(9.99);
        e2.establecerCalMateria3(6.78);
        e2.calcularPromedio();
        System.out.printf("%s\n", e2);
        
    } 
}

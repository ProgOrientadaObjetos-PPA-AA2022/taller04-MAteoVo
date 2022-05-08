/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;


public class Ejecutable {
    public static void main(String[] args) {
        Profesor pr = new Profesor(400);
        Profesor pr2 = new Profesor(1200, "1104984214");
        
        pr.estbalecerNombre("Julia");
        pr.estbalecerApellido("Perez");
        pr.establecerSueldoTotal();
        pr.establecerCedula("1105635187");
        System.out.printf("%s\n", pr);
        
        pr2.estbalecerNombre("Carlos");
        pr2.estbalecerApellido("Rodriguez");
        pr2.establecerSueldoTotal();
        System.out.printf("%s\n", pr2);
    }
    
}

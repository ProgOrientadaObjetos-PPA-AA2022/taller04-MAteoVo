/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema4;

/**
 *
 * @author mateovalarezoojeda
 */
public class Ejecutor {
    public static void main(String[] args) {
        Financiera fi = new Financiera("Banco de Loja");
        fi.establecerNombreCliente("Carlos");
        fi.establecerValorCheque(3600);
        fi.establecerComision();
        
        System.out.printf("%s\n", fi);
        
        Financiera fi2 = new Financiera("Banco de Guayaquil", 9999);
        fi2.establecerNombreCliente("Martha");
        fi2.establecerComision();
        System.out.printf("%s\n", fi2);
    }
}

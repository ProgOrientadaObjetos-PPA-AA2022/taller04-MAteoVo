/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

/**
 *
 * @author mateovalarezoojeda
 */
public class Financiera {
    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comision;
    
    public Financiera(String nomBan){
        nombreBanco = nomBan;
    }
    public Financiera(String nomBan, double valChe){
        nombreBanco = nomBan;
        valorCheque = valChe;
    }
    
    public void establecerNombreCliente(String nomCli){
        nombreCliente = nomCli;
    }
    public String obtenerNombreCliente(){
        return nombreCliente;
    }
    
    public void establecerNombreBanco(String nomBan){
        nombreBanco = nomBan;
    }
    public String obtenerNombreBanco(){
        return nombreBanco;
    }
    
    public void establecerValorCheque(double valChe){
        valorCheque = valChe;
    }
    public double obtenerValorCheque(){
        return valorCheque;
    }
    
    public void establecerComision(){
        comision = ((obtenerValorCheque()*0.003)/100) * obtenerValorCheque();
    }
    public double obtenerComision(){
        return comision;
    }
    
    public String toString() {
        String cadena = String.format("Datos del cheque\n" + "Nombre cliente: %s\n" + "Nombre banco: %s\n" + "Valor cheque : %.2f\n" + "Valor comsion: %.2f\n",
                obtenerNombreCliente(), obtenerNombreBanco(),obtenerValorCheque(),obtenerComision());
        return cadena;
    }
}

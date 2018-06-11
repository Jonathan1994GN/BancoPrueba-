/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author I7
 */
public abstract class CuentaBancaria {
   private String nbanco;
   private int clienteid;
   private String nombre;
   private String apellido;
   private int ncuenta;
   private String tipocuenta;
   private double monto;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int clienteid, String nombre, String apellido, String tipocuenta, double monto) {
        this.clienteid = clienteid;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipocuenta = tipocuenta;
        this.monto = monto;
    }

    public String getNbanco() {
        return nbanco;
    }

    public void setNbanco(String nbanco) {
        this.nbanco = nbanco;
    }

    public int getClienteid() {
        return clienteid;
    }

    public void setClienteid(int clienteid) {
        this.clienteid = clienteid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNcuenta() {
        return ncuenta;
    }

    public void setNcuenta(int ncuenta) {
        this.ncuenta = ncuenta;
    }

    public String getTipocuenta() {
        return tipocuenta;
    }

    public void setTipocuenta(String tipocuenta) {
        this.tipocuenta = tipocuenta;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }


  

   public void mostrar(){
        
        System.out.println(String.format("El cliente es %s, %s", nombre, apellido + " su tipo de cuenta es : " + tipocuenta ));
    }
   
    
}

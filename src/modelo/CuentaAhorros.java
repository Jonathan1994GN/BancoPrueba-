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
public class CuentaAhorros extends CuentaBancaria{
    private double deposito;
    private double retiro;
    private double saldo;
    private String estado;

    public CuentaAhorros() {
    }

    public CuentaAhorros(double deposito, double retiro, double saldo, String estado, int clienteid, String nombre, String apellido, String tipocuenta, double monto) {
        super(clienteid, nombre, apellido, tipocuenta, monto);
        this.deposito = deposito;
        this.retiro = retiro;
        this.saldo = saldo;
        this.estado = estado;
    }


    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getRetiro() {
        return retiro;
    }

    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
      @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("El estado de la cuenta es : " +this.getEstado());
  
    }   
    
}

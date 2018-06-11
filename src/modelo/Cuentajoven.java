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
public class Cuentajoven extends CuentaAhorros {
    
    private int medad;

    public Cuentajoven() {
    }

    public Cuentajoven(int medad, double deposito, double retiro, double saldo, String estado, int clienteid, String nombre, String apellido, String tipocuenta, double monto) {
        super(deposito, retiro, saldo, estado, clienteid, nombre, apellido, tipocuenta, monto);
        this.medad = medad;
    }


    public int getMedad() {
        return medad;
    }

    public void setMedad(int medad) {
        this.medad = medad;
    }
    
   @Override
    public void mostrar() {
        super.mostrar();
        System.out.print(this.getNombre()+" " +this.getApellido());
        System.out.println(" es menor de Edad tiene " + this.getMedad() + " años");
    } 
    
}

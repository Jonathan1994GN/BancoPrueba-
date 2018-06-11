/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancopacificoprueba;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.CuentaAhorros;
import modelo.CuentaBancaria;
import modelo.CuentaCorriente;
import modelo.Cuentajoven;

/**
 *
 * @author I7
 */
public class BancoPacificoPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CuentaAhorros ca1= new CuentaAhorros();
        ca1.setNombre("Marcos");
        ca1.setApellido("Ordoñez");
        ca1.setClienteid(00345321);
        ca1.setTipocuenta("Cuenta de ahorros");
        ca1.setEstado("Activo");
        
        CuentaCorriente cc1= new CuentaCorriente();
        cc1.setNombre("Ignacio");
        cc1.setApellido("Dominguez");
        cc1.setClienteid(01033455);
        cc1.setTipocuenta("Cuenta corriente");
        cc1.setSaldo(1005.78);
         
        Cuentajoven cj1= new Cuentajoven();
        cj1.setNombre("Martha");
        cj1.setApellido("Ordoñez");
        cj1.setMedad(16);
        cj1.setClienteid(0450);
        cj1.setTipocuenta("Cuenta de ahorros joven");
        cj1.setEstado("Activo");
        
       List<CuentaBancaria> cuentabancarias = new ArrayList<CuentaBancaria>();
       cuentabancarias.add(ca1);
       cuentabancarias.add(cc1);
       cuentabancarias.add(cj1);
        
       cuentabancarias.forEach((persona) -> {
            persona.mostrar();
        });
        
        Scanner s = new Scanner(System.in);
        s.nextLine();
       
    } 
    
}

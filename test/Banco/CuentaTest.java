/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class CuentaTest {
        Cuenta auxCuenta;
    public CuentaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        auxCuenta = new Cuenta("0001.0002.12.1234567890", "Fulano de Tal");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }


    @Test
    public void testIngresar1() {
        // Escenario normal. Saco dinero y el saldo disminuye en esa cantidad
        // Excepcion 1. Ingreso una cantidad negativa de dinero
        auxCuenta.ingresar(1000);
        assertTrue(cuenta.getSaldo==1000);
 
    }
    @Test
    public void testIngresar2() {
        // Escenario normal. Saco dinero y el saldo disminuye en esa cantidad
        // Excepcion 1. Ingreso una cantidad negativa de dinero
        auxCuenta.ingresar(-1000);
        assertTrue(cuenta.getSaldo==1000);

    }
    @Test
    public void testRetirar1() {
        //Pruebas a realizar
        // Escenario normal. Saco dinero y el saldo disminuye en esa cantidad
        auxCuenta.retirar(500);
        assertTrue(cuenta.getSaldo==500);

    }
    @Test
    public void testRetirar2() {
        //Pruebas a realizar
        // Excepcion 1. Retiro una cantidad negativa de dinero
        auxCuenta.retirar(-500);
        assertTrue(cuenta.getSaldo==500);
    }
    
    @Test
    public void testRetirar3() {
        //Pruebas a realizar
        // Excepcion 2. Retiro una cantidad superior al saldo

        auxCuenta.retirar(1000);
        assertTrue(cuenta.getSaldo==500);
    }
    
}

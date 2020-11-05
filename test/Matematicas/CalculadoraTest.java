/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matematicas;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testSuma() {
        int total=8;
        int sum = Calculadora.suma (5, 3);
        assertEquals(sum, 8);    }
     @Test
    public void testResta() {
        int total=8;
        int res = Calculadora.resta (10, 2);
        assertEquals(res, total);    }
    }
    
    
}

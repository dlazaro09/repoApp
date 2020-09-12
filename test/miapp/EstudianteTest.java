/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miapp;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.String;


/**
 *
 * @author Dou
 */
public class EstudianteTest {
    
    
    public EstudianteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("EstudianteTest: Before method SetUp()");
        
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("EstudianteTest: After method tearDown()");
        
    }

    /**
     * Test of ingresarNombre method, of class Estudiante.
     */
    @Test
    public void testIngresarNombre() {
        System.out.println("ingresarNombre");
        String nombre = "pepito";
        Estudiante instance = new Estudiante();
        instance.ingresarNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        if("".equals(nombre)){
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getNombre method, of class Estudiante.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Estudiante instance = new Estudiante();
        instance.ingresarNombre("pepito");
        String expResult = "pepito";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!result.equals(expResult)){
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of main method, of class Estudiante.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Estudiante.main(args);
        // TODO review the generated test code and remove the default call to fail.
        if(args != null){
        fail("The test case is a prototype.");
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_BD;

import javax.swing.table.DefaultTableModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rocio
 */
public class fusuarioTest {
    
    public fusuarioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of mostrar_inicial method, of class fusuario.
     */
    @Test
    public void testMostrar_inicial() {
        System.out.println("mostrar_inicial");
        fusuario instance = new fusuario();
        DefaultTableModel expResult = null;
        DefaultTableModel result = instance.mostrar_inicial();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of mostrar method, of class fusuario.
     */
    @Test
    public void testMostrar() {
        System.out.println("mostrar");
        String buscar = "";
        fusuario instance = new fusuario();
        DefaultTableModel expResult = null;
        DefaultTableModel result = instance.mostrar(buscar);
  //      assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
          }

    /**
     * Test of insertar method, of class fusuario.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        vusuario dts = null;
        fusuario instance = new fusuario();
        boolean expResult = false;
        boolean result = instance.insertar(dts);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of editar method, of class fusuario.
     */
    @Test
    public void testEditar() {
        System.out.println("editar");
        vusuario dts = null;
        fusuario instance = new fusuario();
        boolean expResult = false;
        boolean result = instance.editar(dts);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
           }

    /**
     * Test of eliminar method, of class fusuario.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        vusuario dts = null;
        fusuario instance = new fusuario();
        boolean expResult = false;
        boolean result = instance.eliminar(dts);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of login method, of class fusuario.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String usuario = "";
        String pasword = "";
        fusuario instance = new fusuario();
        DefaultTableModel expResult = null;
        DefaultTableModel result = instance.login(usuario, pasword);
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

   
    
}

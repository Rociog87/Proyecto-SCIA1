/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
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
public class CerrarConexionesTest {
    
    public CerrarConexionesTest() {
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
     * Test of metodoCerrarConexiones method, of class CerrarConexiones.
     */
    @Test
    public void testMetodoCerrarConexiones() {
        System.out.println("metodoCerrarConexiones");
        Connection conexion = null;
        Statement sentencia = null;
        ResultSet resultado = null;
        PreparedStatement ps = null;
        CerrarConexiones.metodoCerrarConexiones(conexion, sentencia, resultado, ps);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_BD;

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
public class Control_ProveedorTest {
    
    public Control_ProveedorTest() {
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
     * Test of agregarProveedor method, of class Control_Proveedor.
     */
    @Test
    public void testAgregarProveedor() {
        System.out.println("agregarProveedor");
        String nombre = "";
        String telefono = "";
        String direccion = "";
        String producto = "";
        Control_Proveedor instance = new Control_Proveedor();
        instance.agregarProveedor(nombre, telefono, direccion, producto);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of listarTodosProveedores method, of class Control_Proveedor.
     */
    @Test
    public void testListarTodosProveedores() {
        System.out.println("listarTodosProveedores");
        Control_Proveedor instance = new Control_Proveedor();
        instance.listarTodosProveedores();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of CargarModificarProveedor method, of class Control_Proveedor.
     */
    @Test
    public void testCargarModificarProveedor() {
        System.out.println("CargarModificarProveedor");
        Control_Proveedor instance = new Control_Proveedor();
        instance.CargarModificarProveedor();
        // TODO review the generated test code and remove the default call to fail.
            }

    /**
     * Test of CargarEliminarProveedor method, of class Control_Proveedor.
     */
    @Test
    public void testCargarEliminarProveedor() {
        System.out.println("CargarEliminarProveedor");
        Control_Proveedor instance = new Control_Proveedor();
        instance.CargarEliminarProveedor();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of CargarProveedor method, of class Control_Proveedor.
     */
    @Test
    public void testCargarProveedor() {
        System.out.println("CargarProveedor");
        Control_Proveedor instance = new Control_Proveedor();
        instance.CargarProveedor();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of ejecutarConsultaTodaTabla method, of class Control_Proveedor.
     */
    @Test
    public void testEjecutarConsultaTodaTabla() {
        System.out.println("ejecutarConsultaTodaTabla");
        Control_Proveedor instance = new Control_Proveedor();
        instance.ejecutarConsultaTodaTabla();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of buscarProveedor method, of class Control_Proveedor.
     */
    @Test
    public void testBuscarProveedor() {
        System.out.println("buscarProveedor");
        String parametroBusqueda = "";
        boolean buscarPorCodigo = false;
        boolean buscarPorNombre = false;
        boolean buscarPordireccion = false;
        Control_Proveedor instance = new Control_Proveedor();
        instance.buscarProveedor(parametroBusqueda, buscarPorCodigo, buscarPorNombre, buscarPordireccion);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of buscarListaProveedor method, of class Control_Proveedor.
     */
    @Test
    public void testBuscarListaProveedor() {
        System.out.println("buscarListaProveedor");
        String parametroBusqueda = "";
        Control_Proveedor instance = new Control_Proveedor();
        instance.buscarListaProveedor(parametroBusqueda);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of buscarModificarProveedor method, of class Control_Proveedor.
     */
    @Test
    public void testBuscarModificarProveedor() {
        System.out.println("buscarModificarProveedor");
        String parametroBusqueda = "";
        Control_Proveedor instance = new Control_Proveedor();
        instance.buscarModificarProveedor(parametroBusqueda);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscarEliminarProveedor method, of class Control_Proveedor.
     */
    @Test
    public void testBuscarEliminarProveedor() {
        System.out.println("buscarEliminarProveedor");
        String parametroBusqueda = "";
        Control_Proveedor instance = new Control_Proveedor();
        instance.buscarEliminarProveedor(parametroBusqueda);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of buscarRegistrocodigoOnombre method, of class Control_Proveedor.
     */
    @Test
    public void testBuscarRegistrocodigoOnombre() {
        System.out.println("buscarRegistrocodigoOnombre");
        String parametroBusqueda = "";
        Control_Proveedor instance = new Control_Proveedor();
        instance.buscarRegistrocodigoOnombre(parametroBusqueda);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of buscarRegistroCodigoONombre method, of class Control_Proveedor.
     */
    @Test
    public void testBuscarRegistroCodigoONombre() {
        System.out.println("buscarRegistroCodigoONombre");
        String parametroBusqueda = "";
        boolean buscarPorcodigo = false;
        boolean buscarPorNombre = false;
        boolean buscarPordireccion = false;
        Control_Proveedor instance = new Control_Proveedor();
        instance.buscarRegistroCodigoONombre(parametroBusqueda, buscarPorcodigo, buscarPorNombre, buscarPordireccion);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of EliminarProveedor method, of class Control_Proveedor.
     */
    @Test
    public void testEliminarProveedor() {
        System.out.println("EliminarProveedor");
        String code = "";
        Control_Proveedor instance = new Control_Proveedor();
        instance.EliminarProveedor(code);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of ModificarProveedor method, of class Control_Proveedor.
     */
    @Test
    public void testModificarProveedor() {
        System.out.println("ModificarProveedor");
        String code = "";
        String nombre = "";
        String telefono = "";
        String direccion = "";
        String producto = "";
        Control_Proveedor instance = new Control_Proveedor();
        instance.ModificarProveedor(code, nombre, telefono, direccion, producto);
        // TODO review the generated test code and remove the default call to fail.
       ;
    }
    
}

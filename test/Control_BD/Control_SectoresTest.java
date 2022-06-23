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
public class Control_SectoresTest {
    
    public Control_SectoresTest() {
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
     * Test of agregarSector method, of class Control_Sectores.
     */
    @Test
    public void testAgregarSector() {
        System.out.println("agregarSector");
        String nombre = "";
        String razon_social = "";
        String ruc = "";
        String direccion = "";
        String telefono = "";
        String correo = "";
        Control_Sectores instance = new Control_Sectores();
        instance.agregarSector(nombre, razon_social, ruc, direccion, telefono, correo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarTodosSectores method, of class Control_Sectores.
     */
    @Test
    public void testListarTodosSectores() {
        System.out.println("listarTodosSectores");
        Control_Sectores instance = new Control_Sectores();
        instance.listarTodosSectores();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CargarModificarSectores method, of class Control_Sectores.
     */
    @Test
    public void testCargarModificarSectores() {
        System.out.println("CargarModificarSectores");
        Control_Sectores instance = new Control_Sectores();
        instance.CargarModificarSectores();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CargarEliminarSectores method, of class Control_Sectores.
     */
    @Test
    public void testCargarEliminarSectores() {
        System.out.println("CargarEliminarSectores");
        Control_Sectores instance = new Control_Sectores();
        instance.CargarEliminarSectores();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CargarSectores method, of class Control_Sectores.
     */
    @Test
    public void testCargarSectores() {
        System.out.println("CargarSectores");
        Control_Sectores instance = new Control_Sectores();
        instance.CargarSectores();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CargarSectoresPedidos method, of class Control_Sectores.
     */
    @Test
    public void testCargarSectoresPedidos() {
        System.out.println("CargarSectoresPedidos");
        Control_Sectores instance = new Control_Sectores();
        instance.CargarSectoresPedidos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ejecutarConsultaTodaTabla method, of class Control_Sectores.
     */
    @Test
    public void testEjecutarConsultaTodaTabla() {
        System.out.println("ejecutarConsultaTodaTabla");
        Control_Sectores instance = new Control_Sectores();
        instance.ejecutarConsultaTodaTabla();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarSector method, of class Control_Sectores.
     */
    @Test
    public void testBuscarSector() {
        System.out.println("buscarSector");
        String parametroBusqueda = "";
        boolean buscarPorCedula = false;
        boolean buscarPorNombre = false;
        boolean buscarPorRazon_s_sector = false;
        Control_Sectores instance = new Control_Sectores();
        instance.buscarSector(parametroBusqueda, buscarPorCedula, buscarPorNombre, buscarPorRazon_s_sector);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarListaSector method, of class Control_Sectores.
     */
    @Test
    public void testBuscarListaSector() {
        System.out.println("buscarListaSector");
        String parametroBusqueda = "";
        Control_Sectores instance = new Control_Sectores();
        instance.buscarListaSector(parametroBusqueda);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarModificarSector method, of class Control_Sectores.
     */
    @Test
    public void testBuscarModificarSector() {
        System.out.println("buscarModificarSector");
        String parametroBusqueda = "";
        Control_Sectores instance = new Control_Sectores();
        instance.buscarModificarSector(parametroBusqueda);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarEliminarSector method, of class Control_Sectores.
     */
    @Test
    public void testBuscarEliminarSector() {
        System.out.println("buscarEliminarSector");
        String parametroBusqueda = "";
        Control_Sectores instance = new Control_Sectores();
        instance.buscarEliminarSector(parametroBusqueda);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarRegistrodniOnombreOrazon_s_sector method, of class Control_Sectores.
     */
    @Test
    public void testBuscarRegistrodniOnombreOrazon_s_sector() {
        System.out.println("buscarRegistrodniOnombreOrazon_s_sector");
        String parametroBusqueda = "";
        Control_Sectores instance = new Control_Sectores();
        instance.buscarRegistrodniOnombreOrazon_s_sector(parametroBusqueda);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarRegistroCedulaONombreOrazon_s_sector method, of class Control_Sectores.
     */
    @Test
    public void testBuscarRegistroCedulaONombreOrazon_s_sector() {
        System.out.println("buscarRegistroCedulaONombreOrazon_s_sector");
        String parametroBusqueda = "";
        boolean buscarPorCedula = false;
        boolean buscarPorNombre = false;
        boolean buscarPorrazon_s_sector = false;
        Control_Sectores instance = new Control_Sectores();
        instance.buscarRegistroCedulaONombreOrazon_s_sector(parametroBusqueda, buscarPorCedula, buscarPorNombre, buscarPorrazon_s_sector);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EliminarSector method, of class Control_Sectores.
     */
    @Test
    public void testEliminarSector() {
        System.out.println("EliminarSector");
        String code = "";
        Control_Sectores instance = new Control_Sectores();
        instance.EliminarSector(code);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ModificarSector method, of class Control_Sectores.
     */
    @Test
    public void testModificarSector() {
        System.out.println("ModificarSector");
        String code = "";
        String nombre = "";
        String razon_social = "";
        String ruc = "";
        String direccion = "";
        String telefono = "";
        String correo = "";
        Control_Sectores instance = new Control_Sectores();
        instance.ModificarSector(code, nombre, razon_social, ruc, direccion, telefono, correo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

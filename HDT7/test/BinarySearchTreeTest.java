/**
 * @author Pablo Argueta, Carnet: 13028
 * @author Héctor Möller, Carnet: 09002
 * @author Brandon Mendez, Carnet: 13087
 * 
 * @ Prueba unitaria de los métodos de agregar y buscar asociaciones del  BinarySearchTreeTest
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bicimotoca
 */
public class BinarySearchTreeTest {
    
    public BinarySearchTreeTest() {
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
     * Prueba unitaria de la funcion para insertar al arbol
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Association<String,String> nuevaAsoc = new Association<String,String>("hello","hola");
        BinarySearchTree instance = new BinarySearchTree();
        instance.add(nuevaAsoc);
        Object resultado =instance.get(nuevaAsoc);
        assertEquals(nuevaAsoc, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Prueba unitaria de la funcion para buscar una asociación en el arbol
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Association<String,String> nuevaAsoc = new Association<String,String>("house","casa");
        BinarySearchTree instance = new BinarySearchTree();
        Association<String,String> expResult = new Association<String,String>("house","casa");
        instance.add(nuevaAsoc);
        Object result = instance.get(nuevaAsoc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
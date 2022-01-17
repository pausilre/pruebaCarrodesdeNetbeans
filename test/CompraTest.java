
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author paula
 * @version 13.02
 */
public class CompraTest {
    
    public CompraTest() {
    }
    
    /**
     * Test of getPantalones method, of class Compra.
     */
    @Test
    public void testGetPantalones() {
        System.out.println("getPantalones");
        Compra carrito1 = new Compra();
        int expResult = 0;
        int result = carrito1.getPantalones();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCamisas method, of class Compra.
     */
    @Test
    public void testGetCamisas() {
        System.out.println("getCamisas");
        Compra carrito2 = new Compra();
        carrito2.realizarCompra();
        carrito2.realizarCompra();
        assertEquals(carrito2.getCamisas(), 2);
    }

    /**
     * Test of getSudaderas method, of class Compra.
     */
    @Test
    public void testGetSudaderas() {
        System.out.println("getSudaderas");
        Compra carrito3 = new Compra();
        carrito3.realizarCompra();
        carrito3.realizarCompra();
        int expResult = 2;
        int result = carrito3.getSudaderas();
        assertEquals(expResult, result);
    }
    
}

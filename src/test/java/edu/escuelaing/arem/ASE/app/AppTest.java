package edu.escuelaing.arem.ASE.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
        LinkedList lista = new LinkedList();
        lista.addFirs(159.847);
        lista.addFirs(0.379);lista.addFirs(753);lista.addFirs(15.5);
        lista.addFirs(33.5);lista.addFirs(88.78);lista.addFirs(99.0);
        assertEquals(99.0, ((Nodo) lista.removeFirst()).getData(),0.1);
        assertEquals(88.78, ((Nodo) lista.removeFirst()).getData(),0.01);
        assertEquals(33.5, ((Nodo) lista.removeFirst()).getData(),0.1);
        assertEquals(15.5, ((Nodo) lista.removeFirst()).getData(),0.1);
        assertEquals(753, ((Nodo) lista.removeFirst()).getData(),0.1);
        assertEquals(0.379, ((Nodo) lista.removeFirst()).getData(),0.001);
    }



    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	 LinkedList lista = new LinkedList();
         lista.addFirs(159.847);
         lista.addFirs(0.379);lista.addFirs(753);lista.addFirs(15.5);
         lista.addFirs(33.5);lista.addFirs(88.78);lista.addFirs(99.0);
         double mean = App.mean(lista);
         double deviation = App.standardDeviation(lista);
         
         assertEquals( 164.286,mean,0.001);	
         assertEquals(245.727,deviation, 0.001);
    }
}

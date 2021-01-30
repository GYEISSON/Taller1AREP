package edu.escuelaing.arem.ASE.app;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello LinkedList!" );
        LinkedList lista = new LinkedList();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0;i<n;i++) {
        	lista.addFirs(scan.nextDouble());
        }
        System.out.println("The mean of values: "+mean(lista));
        System.out.println("The standard Deviation of values: "+standardDeviation(lista));
    }
    
    public static double mean(LinkedList lista) {
    	double mean = 0;
    	for(int i=0;i<lista.size();i++) {
    		mean+=lista.getIndex(i);
    	}
    	mean = (mean/lista.size());
    	
    	return mean;
    }
    
    public static double standardDeviation(LinkedList lista) {
    	double sDeviation = 0;
    	double mean = mean(lista);
    	for(int i=0;i<lista.size();i++) {
    		sDeviation += Math.pow((lista.getIndex(i)-mean), 2);
    	}
    	sDeviation=sDeviation/lista.size();
    	sDeviation = Math.sqrt(sDeviation);
    	
    	return sDeviation;
    }
}

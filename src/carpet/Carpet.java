/*
 * Kaia Mac
 * This program shows the cost of a carpet
 * September 18th, 2018
 */

package carpet;

/**
 *
 * @author kamac8665
 */
public class Carpet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double length = 8.5;
        double width = 6;
        double cost = 19.95;
        double carpetcost = 0.0;
        carpetcost = length*width*cost;
        
        System.out.println("The cost of the carpet is " + carpetcost);
        
                
    }
    
}

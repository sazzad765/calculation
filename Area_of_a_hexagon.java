/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area_of_a_hexagon;

import java.util.Scanner;

/**
 *
 * @author sazzad
 */
public class Area_of_a_hexagon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Enter the side: ");
        double side= input.nextDouble();
        
        double Area =((3*Math.pow(3,0.5))/2)*Math.pow(side,2);
        
        System.out.printf("The area of the hexagon is %.4f ", +Area);
    }
    
}

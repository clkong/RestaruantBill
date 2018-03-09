/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package restaurantbill;

/**
 *
 * @author toluo7449
 */
public class RestaurantBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //a represent the cost of the meal before taxes       
        double a=8.95;        
        //b reprensent the harmonized sales tax        
        double b=a*0.13;    
        //c repremsent th the cost of the meal including taxes       
        double c=a+b;               



        System.out.println("Restaruant  Bill");  
        System.out.println("Meal:       $"+a); 
        System.out.println("Tax:        $"+b);
        System.out.println("Total:      $"+c);                  



              
    }
    
}

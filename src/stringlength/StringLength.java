/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringlength;

import java.util.Scanner;
public class StringLength {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {   
        
        System.out.println("Enter a string : ");
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(s.length());   
    }
    
}


 
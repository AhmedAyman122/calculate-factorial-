/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ahmed;

import java.util.Scanner;

/**
 *
 * @author user
 */

    
    class Calc {
    public int Factorial(int number) {
    
        int num  = 1;
        
        for (int i =1; i <= number; i++) {
        
            num *= i;

        }
            return num;
        }
    }
    
public class Ahmed {
    public static void main(String[] args) {
       System.out.println("Enter Your Calculate Factorial:");
    
       Calc calculator  = new Calc();
       
       Scanner in = new Scanner(System.in);  
       
       int x = in.nextInt();
       
       int myNumber = calculator.Factorial(x);
       
       
        System.out.print(myNumber);
      
    }
}

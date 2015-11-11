/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MiscPackage;

import java.util.ArrayList;

/**
 * 
 * @author Sergio Martín Santana <sergio.ms.91@gmail.com>
 */
public class Printer {
    
    public static void print_Array (ArrayList <Integer> list)
    {
        for(int i:list){
            System.out.print(i);
            System.out.print(" ");
        }

    System.out.println("");
    
    }
}

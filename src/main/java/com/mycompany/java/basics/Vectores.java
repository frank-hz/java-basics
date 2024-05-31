/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java.basics;

import java.util.Scanner;

/**
 *
 * @author Frank-Hz
 */
public class Vectores {

    public static void main(String[] args){
        
        int vectorInt [] = new int [2];
        String vectorString [] = new String [2];       
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("VECTOR INT");
        System.out.println("****************");
        for(int i=0; i<vectorInt.length; i++){
            System.out.println("Ingrese valor ["+ (i+1)+ "]: ");
            vectorInt[i] = scanner.nextInt();
        }
        System.out.println("VECTOR STRING");
        System.out.println("****************");
        for(int i=0; i<vectorString.length; i++){
            System.out.println("Ingrese valor ["+ (i+1)+ "]: ");
            vectorString[i] = scanner.next();
        }
        
        for(int i=0; i<vectorInt.length; i++){
            System.out.println("VectorInt - Item ["+ (i+1)+ "]: " + vectorInt[i]);
        }
        for(int i=0; i<vectorString.length; i++){
            System.out.println("VectorString - Item ["+ (i+1)+ "]: " + vectorString[i]);
        }
        
    }
}

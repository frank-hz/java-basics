/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.basics;

import java.util.Scanner;

/**
 *
 * @author Frank-Hz
 */
public class Matrices {
    public static void main(String[] args){
        String team_members [][] = new String [2][3];
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("TORNEO");
        System.out.println("*************************");
        
        for(int i=0; i<team_members.length; i++){
            for(int j=0; j<team_members[i].length; j++){
                System.out.println("Team "+(i+1)+" - miembro "+(j+1));
                team_members[i][j] = scanner.next();
            }
        }
        
        System.out.println("*************************");
        for(int i=0; i<team_members.length; i++){
            for(int j=0; j<team_members[i].length; j++){
                System.out.println("Team "+ (i+1)+": "+ team_members[i][j]);
            }
        }
    }
}

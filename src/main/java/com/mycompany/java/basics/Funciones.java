/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.basics;

/**
 *
 * @author Frank-Hz
 */
public class Funciones {
    public static void main(String[] args){
        //execMessage();
        String create = createMessage();
        String custom = customMessage("Jordan");
        int prox_age = processAge(15);
        
        System.out.println("create: "+create);
        System.out.println("custom: "+custom);
        System.out.println("Tu edad dentro de 2 años sera "+prox_age+" años");
    }
    
    static void execMessage(){
        System.out.println("HOLLA!");
    }
    
    static String createMessage(){
        return "Hola, que tal?!";
    }
    
    static String customMessage(String name){
        return "Hola "+name+", como estas?";
    }
    static int processAge(int age){
        return age + 2;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.derekvonk.kofferslot;

/**
 *
 * @author Vonk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Letter letter1 = new Letter();
        Letter letter2 = new Letter();
        Cijfer cijfer1 = new Cijfer();
        
        Kofferslot test = new Kofferslot(letter1.getLetter(), letter2.getLetter(), cijfer1.getCijfer());
        
        test.setCombinatie('A', 'B', 2);
        System.out.println(test.toString() + " " + "de volgende moet zijn: " 
                + test.volgende());
        
        test.setCombinatie('B', 'R', 9);
        System.out.println(test.toString() + " " + "de volgende moet zijn: " 
                + test.volgende());
        
        test.setCombinatie('D', 'Z', 9);
        System.out.println(test.toString() + " " + "de volgende moet zijn: " 
                + test.volgende());
        
        test.setCombinatie('Z', 'Z', 9);
        System.out.println(test.toString() + " " + "de volgende moet zijn: " 
                + test.volgende());
    }
    
}

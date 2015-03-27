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
public class Letter {
    
    private char letter;
    private String[] alpha = {"A","B","C"};
    private int currentLetter =0;
    
        
    
    public Letter() {
        
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }
    
    public String volgende() {
        currentLetter++;
        //maar check eerst dat currentLetter < alpha.length
        return alpha[currentLetter];
        
    }
    
}


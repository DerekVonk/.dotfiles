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

    public Letter() {
       this.letter = 'A';
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }
    
    public char volgende() {
        letter++;
        if (letter == 'Z') {
            letter = 'A';
        }
        return letter;
    }
    
    @Override
    public String toString() {
        return Character.toString(getLetter());
    }
}


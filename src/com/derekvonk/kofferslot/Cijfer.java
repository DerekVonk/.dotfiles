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
public class Cijfer {

    private int cijfer;
    
    public Cijfer() {
        this.cijfer = 0;
    }

    public int getCijfer() {
        return cijfer;
    }

    public void setCijfer(int cijfer) {
        this.cijfer = cijfer;
    }
    
    public int volgende() {
        cijfer++;
        // check eerst dat currentLetter < alpha.length
        if (cijfer > 9) {
            cijfer = 0;
        }
        return cijfer;
    }
}

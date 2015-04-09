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
public class Kofferslot {

    private Letter[] letterLijst;
    private Cijfer cijfer;

    public Kofferslot() {
        letterLijst = new Letter[]{new Letter(), new Letter()};
        this.cijfer = new Cijfer();
    }

    public Kofferslot(char letter1, char letter2, int cijfer) {
        letterLijst = new Letter[]{new Letter(), new Letter()};
        this.cijfer = new Cijfer();
        letterLijst[0].setLetter(letter1);
        letterLijst[1].setLetter(letter2);
        this.cijfer.setCijfer(cijfer);

    }

    public void setCombinatie(char letter1, char letter2, int cijfer) {
        letterLijst[0].setLetter(letter1);
        letterLijst[1].setLetter(letter2);
        this.cijfer.setCijfer(cijfer);
    }

    public String volgende() {
        //maak stringbuilder object
        StringBuilder sb = new StringBuilder();

        //eerst cijfer volgende aanroepen
        if (cijfer.getCijfer() != 9) {
            cijfer.setCijfer(cijfer.volgende());
        } else if (cijfer.getCijfer() == 9 && letterLijst[1].getLetter() != 'Z') {
            cijfer.setCijfer(0);
            letterLijst[1].volgende();
        } else if (cijfer.getCijfer() == 9 && letterLijst[1].getLetter() == 'Z' 
                && letterLijst[0].getLetter() != 'Z') {
            cijfer.setCijfer(0);
            letterLijst[1].setLetter('A');
            letterLijst[0].volgende();
        } else if (cijfer.getCijfer() == 9 && letterLijst[1].getLetter() != 'Z'
                && letterLijst[0].getLetter() != 'Z') {
            cijfer.setCijfer(0);
            letterLijst[1].volgende();
            letterLijst[0].volgende();
        } else if (cijfer.getCijfer() == 9 && letterLijst[1].getLetter() == 'Z'
                && letterLijst[0].getLetter() == 'Z') {
            cijfer.setCijfer(0);
            letterLijst[1].setLetter('A');
            letterLijst[0].setLetter('A');
        }

        sb.append(Character.toString(letterLijst[0].getLetter()));
        sb.append(Character.toString(letterLijst[1].getLetter()));
        sb.append(Integer.toString(cijfer.getCijfer()));

        return sb.toString();

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(Character.toString(letterLijst[0].getLetter()));
        sb.append(Character.toString(letterLijst[1].getLetter()));
        sb.append(Integer.toString(cijfer.getCijfer()));

        return sb.toString();
    }
}

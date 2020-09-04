/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generalise;

import annotation.Colonne;

/**
 *
 * @author manohisoa
 */
public class Test {

    @Colonne("etat")
    private int etat;

    public Test() {
    }

    public Test(int etat) {
        this.etat = etat;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

}

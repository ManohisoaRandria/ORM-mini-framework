/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generalise;

import annotation.Cacheable;
import annotation.Colonne;
import annotation.Entite;
import annotation.PrimaryKey;
import java.sql.Timestamp;

/**
 *
 * @author manohisoa
 */
@Entite(table = "trosa")
@Cacheable(dureeenminute = 2)
public class Trosa extends Test {

    @PrimaryKey
    @Colonne("id")
    private String id;
    @Colonne("descri")
    private String descri;
    @Colonne("ananana")
    private String ananana;
    @Colonne("manana")
    private String manana;
    @Colonne("montant")
    private Double montant;
    @Colonne("daty")
    private Timestamp daty;

    public Trosa(String id, String descri, String ananana, String manana, Double montant, Timestamp daty, int etat) {
        super(etat);
        this.id = id;
        this.descri = descri;
        this.ananana = ananana;
        this.manana = manana;
        this.montant = montant;
        this.daty = daty;
    }

    public Trosa() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public String getAnanana() {
        return ananana;
    }

    public void setAnanana(String ananana) {
        this.ananana = ananana;
    }

    public String getManana() {
        return manana;
    }

    public void setManana(String manana) {
        this.manana = manana;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public Timestamp getDaty() {
        return daty;
    }

    public void setDaty(Timestamp daty) {
        this.daty = daty;
    }

}

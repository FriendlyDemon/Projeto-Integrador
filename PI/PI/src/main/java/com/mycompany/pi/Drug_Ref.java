/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pi;

/**
 *
 * @author Aluno
 */
public class Drug_Ref {

    private int id;
    private int drug_id;
    private double quantity;
    private String expiry_date;

    public int getId() {
        return this.id;
    }

    public void setId(int Id) {
        this.id = Id;
    }

    public int getDrug_id() {
        return this.drug_id;
    }

    public void setDug_id(int Drug_id) {
        this.drug_id = Drug_id;
    }

    public double getQuantity() {
        return this.quantity;
    }

    public void setQuantity(double Quantity) {
        this.quantity = Quantity;
    }

    public String getExpiry() {
        return this.expiry_date;
    }

    public void setExpiry(String Expiry) {
        this.expiry_date = Expiry;
    }

    public Drug_Ref(int ID, int Drug, double Quantity, String Expiry) {
        id = ID;
        drug_id = Drug;
        quantity = Quantity;
        expiry_date = Expiry;
    }
}

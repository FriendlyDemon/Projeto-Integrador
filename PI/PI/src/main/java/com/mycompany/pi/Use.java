/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pi;

/**
 *
 * @author Aluno
 */
public class Use {

    private int id;
    private String user_id;
    private int drug_id;
    private double quantity;
    private int interval;
    private String beginning;
    private boolean active;

    public int getId() {
        return this.id;
    }

    public void setId(int Id) {
        this.id = Id;
    }

    public String getUser() {
        return this.user_id;
    }

    public void setUser(String User) {
        this.user_id = User;
    }

    public int getDrug() {
        return this.drug_id;
    }

    public void setDrug(int Drug) {
        this.drug_id = Drug;
    }

    public double getQuantity() {
        return this.quantity;
    }

    public void setQuantity(double Quantity) {
        this.quantity = Quantity;
    }

    public int getInterval() {
        return this.interval;
    }

    public void setInterval(int Interval) {
        this.interval = Interval;
    }

    public String getBeginning() {
        return this.beginning;
    }

    public void setBeginning(String Beginning) {
        this.beginning = Beginning;
    }

    public boolean getActive() {
        return this.active;
    }

    public void setActive(boolean Active) {
        this.active = Active;
    }

    public Use(int ID, String User, int Drug, double Quantity, int Interval, String Beginning, boolean Active) {
        id = ID;
        user_id = User;
        drug_id = Drug;
        quantity = Quantity;
        interval = Interval;
        beginning = Beginning;
        active = Active;
    }
}

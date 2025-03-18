/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pi;

/**
 *
 * @author Aluno
 */
public class History_Drugs {

    private int id;
    private String user_id;
    private int drug_id;
    private String date_use;
    private boolean taken;

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

    public String getDate_use() {
        return this.date_use;
    }

    public void setDate_use(String Date_use) {
        this.date_use = Date_use;
    }

    public boolean getTaken() {
        return this.taken;
    }

    public void setTaken(boolean Taken) {
        this.taken = Taken;
    }

    public History_Drugs(int ID, String User, int Drug, String Date_use, boolean Taken) {
        id = ID;
        user_id = User;
        drug_id = Drug;
        date_use = Date_use;
        taken = Taken;
    }

}

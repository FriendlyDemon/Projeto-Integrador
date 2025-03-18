/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pi;

/**
 *
 * @author Aluno
 */
public class Drug_Base {

    private int id;

    private String name;

    private String comsumption;

    public int getId() {
        return this.id;
    }

    public void setId(int Id) {
        this.id = Id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getComsumption() {
        return this.comsumption;
    }

    public void setConsumption(String Comsumption) {
        this.comsumption = Comsumption;
    }

    public Drug_Base(int ID, String Name, String Comsumption) {
        id = ID;
        name = Name;
        comsumption = Comsumption;
    }
}

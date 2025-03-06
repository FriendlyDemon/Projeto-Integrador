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

    Use(int ID, String User, int Drug, double Quantity, int Interval, String Beginning, boolean Active) {
        id = ID;
        user_id = User;
        drug_id = Drug;
        quantity = Quantity;
        interval = Interval;
        beginning = Beginning;
        active = Active;
    }
}

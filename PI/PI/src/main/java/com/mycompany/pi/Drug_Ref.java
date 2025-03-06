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

    Drug_Ref(int ID, int Drug, double Quantity, String Expiry) {
        id = ID;
        drug_id = Drug;
        quantity = Quantity;
        expiry_date = Expiry;
    }
}

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

    History_Drugs(int ID, String User, int Drug, String Date_use, boolean Taken) {
        id = ID;
        user_id = User;
        drug_id = Drug;
        date_use = Date_use;
        taken = Taken;
    }

}

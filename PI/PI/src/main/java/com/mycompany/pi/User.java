/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pi;

/**
 *
 * @author Aluno
 */
public class User {

    private String email;
    private String name;
    private String phone;

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String Phone) {
        this.phone = Phone;
    }

    User(String Email, String Name, String Phone) {
        email = Email;
        name = Name;
        phone = Phone;
    }
}

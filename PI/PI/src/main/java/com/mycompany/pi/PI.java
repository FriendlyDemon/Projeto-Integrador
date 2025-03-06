/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pi;

/**
 *
 * @author Aluno
 */
public class PI {

    public static void main(String[] args) {

        Drug_Base omeprasol = new Drug_Base(1, "Omeprasol", "oral");
        Drug_Base paracetamol = new Drug_Base(2, "Paracetamol", "oral");
        Drug_Base dipirona = new Drug_Base(3, "Dipirona", "oral");

        User henrique = new User("henrique@gmail.com", "henrique michel", "(51)99887-7665");

        Drug_Ref remedio = new Drug_Ref(1, 1, 30, "28/02/2030");
        Drug_Ref remedio2 = new Drug_Ref(2, 2, 12, "25/02/2025");
        Drug_Ref remedio3 = new Drug_Ref(3, 3, 10, "25/05/2028");

        Use alerta1 = new Use(1, "henrique@gmail.com", 1, 2, 24, "01/01/2024", true);
        Use alerta2 = new Use(2, "henrique@gmail.com", 2, 1, 12, "22/02/2025", true);
        Use alerta3 = new Use(3, "henrique@gmail.com", 3, 1, 24, "24/02/2025", false);
    }
}

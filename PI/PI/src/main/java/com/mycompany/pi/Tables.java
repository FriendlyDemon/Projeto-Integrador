/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pi;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author HENRIQUEMICHEL
 */
public class Tables {

    public static void createTables(Connection conexao) {
        createUserTable(conexao);
        createDrugBaseTable(conexao);
        createDrugRefTable(conexao);
        createUseTable(conexao);
        createHistoryTable(conexao);
    }

    public static void createUserTable(Connection conexao) {
        String sql = "CREATE TABLE IF NOT EXISTS users (name VARCHAR(255) NOT NULL, email VARCHAR(255) PRIMARY KEY  NOT NULL UNIQUE, password INTEGER NOT NULL)";
        try (Statement stmt = conexao.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela 'usuarios' criada ou já existente.");
        } catch (Exception e) {
            System.out.println("Erro ao criar tabela: " + e.getMessage());
        }
    }

    public static void createDrugBaseTable(Connection conexao) {
        String sql = "CREATE TABLE IF NOT EXISTS drugbase (id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR(255) NOT NULL, consumption VARCHAR(255)";
        try (Statement stmt = conexao.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela 'remedios base' criada ou já existente.");
        } catch (Exception e) {
            System.out.println("Erro ao criar tabela: " + e.getMessage());
        }
    }

    public static void createDrugRefTable(Connection conexao) {
        String sql = "CREATE TABLE IF NOT EXISTS drugref (id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR(255) NOT NULL, baseid INTEGER, quantity FLOAT, expiry DATE, FOREIGN KEY (baseid) REFERENCES drugbase (id)";
        try (Statement stmt = conexao.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela 'remedios referencia' criada ou já existente.");
        } catch (Exception e) {
            System.out.println("Erro ao criar tabela: " + e.getMessage());
        }
    }

    public static void createUseTable(Connection conexao) {
        String sql = "CREATE TABLE IF NOT EXISTS use (id INTEGER PRIMARY KEY AUTOINCREMENT, userid VARCHAR(255), drugid INTEGER, quantity FLOAT, interval INTEGER, begining DATE, active BOOLEAN, FOREIGN KEY (userid) REFERENCES users (id), FOREIGN KEY (baseid) REFERENCES drugbase (id)";
        try (Statement stmt = conexao.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela 'usos' criada ou já existente.");
        } catch (Exception e) {
            System.out.println("Erro ao criar tabela: " + e.getMessage());
        }
    }

    public static void createHistoryTable(Connection conexao) {
        String sql = "CREATE TABLE IF NOT EXISTS history (id INTEGER PRIMARY KEY AUTOINCREMENT, userid VARCHAR(255), drugid INTEGER, dateused DATE, taken BOOLEAN, FOREIGN KEY (userid) REFERENCES users (id), FOREIGN KEY (baseid) REFERENCES drugbase (id)";
        try (Statement stmt = conexao.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela 'usos' criada ou já existente.");
        } catch (Exception e) {
            System.out.println("Erro ao criar tabela: " + e.getMessage());
        }
    }
}

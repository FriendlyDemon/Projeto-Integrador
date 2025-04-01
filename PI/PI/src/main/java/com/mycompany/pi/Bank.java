/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author HENRIQUEMICHEL
 */
public class Bank {

    public static Connection conect() {
        Connection conexao = null;
        String url = "jdbc:sqlite:pharma.db";
        try {
            conexao = DriverManager.getConnection(url);
            System.out.println("Conexão com SQLite estabelecida!");

        } catch (SQLException e) {
            System.out.print("Erro ao conectar ao banco" + e.getMessage());
        }
        return conexao;
    }

    public static void disconect(Connection conexao) {
        try {
            if (conexao != null) {
                conexao.close();
                System.out.println("Conexao fechada.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao fechar a conexão:" + e.getMessage());
        }
    }

    public static void addUser(Connection conexao, String name, String email, int password) {

        String sql = "INSERT INTO usuarios (name, email, password) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setInt(3, password);

            pstmt.executeUpdate();

            System.out.println("Usuário inserido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir usuário: " + e.getMessage());
        }
    }

    public static void changeName(Connection conexao, String email, String newName) {

        String sql = "UPDATE usuarios SET name = ? WHERE email = ?";

        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setString(1, newName);
            pstmt.setString(2, email);

            int rowsUpdated = pstmt.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Usuário atualizado com sucesso!");
            } else {
                System.out.println("Nenhum usuário encontrado com o ID fornecido.");
            }

        } catch (SQLException e) {
            System.out.println("Erro ao conectar ou executar SQL: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro ao atualizar usuário: " + e.getMessage());
        }
    }

    public static void changeEmail(Connection conexao, String oldEmail, String newEmail) {

        String sql = "UPDATE usuarios SET email = ? WHERE email = ?";

        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setString(1, newEmail);
            pstmt.setString(2, oldEmail);

            int rowsUpdated = pstmt.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Usuário atualizado com sucesso!");
            } else {
                System.out.println("Nenhum usuário encontrado com o ID fornecido.");
            }

        } catch (SQLException e) {
            System.out.println("Erro ao conectar ou executar SQL: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro ao atualizar usuário: " + e.getMessage());
        }
    }

    public static void changePassword(Connection conexao, String email, String password) {
        String sql = "UPDATE usuarios SET password = ? WHERE email = ?";
        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setString(1, password);
            pstmt.setString(2, email);

            int rowsUpdated = pstmt.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Usuário atualizado com sucesso!");
            } else {
                System.out.println("Nenhum usuário encontrado com o ID fornecido.");
            }

        } catch (SQLException e) {
            System.out.println("Erro ao conectar ou executar SQL: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro ao atualizar usuário: " + e.getMessage());
        }
    }
}

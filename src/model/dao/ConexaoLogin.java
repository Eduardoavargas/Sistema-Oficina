/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoLogin {

    private static final String URL = "jdbc:mysql://localhost:3306/caheva";
    private static final String USUARIO = "root";
    private static final String SENHA = "";

    public static Connection conexao() throws SQLException {
        try {
            System.out.println("Conectado com sucesso");
            return DriverManager.getConnection(URL, USUARIO, SENHA);

        } catch (SQLException e) {
            throw new SQLException("Erro ao conectar o banco de dados " + e.getMessage());

        }

    }

}

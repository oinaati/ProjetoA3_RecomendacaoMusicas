/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import bd.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author natim
 */
public class Genero {

    private String nome;

    public Genero(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void inserirGenero() throws Exception {

        String sql = "INSERT INTO tb_genero (nome) VALUES (?)";

        try (Connection c = new ConnectionFactory().obterConexao()) {

            PreparedStatement ps = c.prepareStatement(sql);

            ps.setString(1, nome);

            ps.execute();
        }
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import bd.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author natim
 */
public class Genero {

    private String nome;
    private int id;

    public Genero(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Genero(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
        public static List<Genero> listar() {
        List<Genero> generos = new ArrayList<>();

        String sql = "SELECT * FROM tb_genero limite 10";

        try (Connection c = new ConnectionFactory().obterConexao()) {

            PreparedStatement ps = c.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                
                Genero p = new Genero(id, nome);
                generos.add(p);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return generos;
    }

    public String toString() {
        return this.nome;
    }
}

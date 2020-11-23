/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.Connection;
import bd.ConnectionFactory;
import java.sql.PreparedStatement;

/**
 *
 * @author natim
 */
public class Usuario {
    private String nome;
    private String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }
    
    public void cadastroUsuario() throws Exception {
         String sql = "INSERT INTO tb_usuario (nome, senha) VALUES (?, ?)";
         
         try (Connection c = new ConnectionFactory().obterConexao()){
             
             PreparedStatement ps = c.prepareStatement(sql);
             
             ps.setString(1, nome);
             ps.setString(2, senha);
             
             ps.execute();
         }
    }
    
}

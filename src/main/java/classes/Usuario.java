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
    private String email;

    public Usuario(String nome, String email, String senha) {
        this(nome, senha);
        this.email = email;
    }
    
    public Usuario(String nome, String senha){
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }
    
    
}

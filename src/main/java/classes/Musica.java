/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import bd.ConnectionFactory;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author natim
 */
public class Musica {

    private String nome;
    private int avaliacao, id;
    private String genero;

    public Musica(String nome, String genero, int avaliacao) {
        this.nome = nome;
        this.avaliacao = avaliacao;
        this.genero = genero;
    }
    
    public Musica(){
        
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public int getId() {
        return id;
    }
    
    

    @Override
    public String toString() {
        return nome;
    }

}

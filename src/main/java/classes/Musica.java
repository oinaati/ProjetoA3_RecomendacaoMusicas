/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import bd.ConnectionFactory;

/**
 *
 * @author natim
 */
public class Musica {
    private String nome;
    private int avaliacao;

    public Musica(String nome, int avaliacao) {
        this.nome = nome;
        this.avaliacao = avaliacao;
    }

}

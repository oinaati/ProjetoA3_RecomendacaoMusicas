/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import classes.Musica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author natim
 */
public class DAOMusica {
    
        public static List<Musica> listar() {
        List<Musica> musicas = new ArrayList<>();

        String sql = "SELECT * FROM tb_musicas";

        try (Connection c = new ConnectionFactory().obterConexao()) {

            PreparedStatement ps = c.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String nome = rs.getString("nome");
                String genero = rs.getString("genero");
                Integer avaliacao = rs.getInt("avaliacao");

                Musica p = new Musica(nome, genero, avaliacao);
                musicas.add(p);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return musicas;
    }
        
        public static void avaliar(Musica musica){
            
            String sql = "UPDATE tb_musicas SET avaliacao=? WHERE id =  ?";
            
            try (Connection c = new ConnectionFactory().obterConexao()) {
                PreparedStatement ps = c.prepareStatement(sql);
                
                ps.setInt(1, musica.getAvaliacao());
                ps.setInt(2, musica.getId());
                ps.execute();
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possivel avaliar as músicas.");
                e.printStackTrace();
            }
        }
}

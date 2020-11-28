/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import classes.Genero;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import classes.Usuario;

/**
 *
 * @author natim
 */
public class DAO {

    public static boolean existe(Usuario usuario) throws Exception {
        String sql = "SELECT * FROM tb_usuario WHERE nome = ? and senha =?";

        try (Connection conexao = ConnectionFactory.obterConexao();
                PreparedStatement ps = conexao.prepareStatement(sql)) {

            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSenha());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }

    public static void cadastroUsuario(Usuario usuario) throws Exception {
        String sql = "INSERT INTO tb_usuario (nome, email, senha) VALUES (?, ?, ?)";

        try (Connection c = new ConnectionFactory().obterConexao();
                PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getEmail());
            ps.setString(3, usuario.getSenha());

            ps.execute();
        }
    }

    public static void inserirGenero(Genero genero) throws Exception {
        String sql = "INSERT INTO tb_genero (nome) VALUES (?)";

        try (Connection c = new ConnectionFactory().obterConexao();
                PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, genero.getNome());
            ps.execute();
        }
    }

}

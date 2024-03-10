package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.Conexao;
import tabela.Usuario;

public class usuarioDAO {
    public void cadastrarUsuario(Usuario usuario){
        String sql = "INSERT INTO CARROS (NOME, MARCA) VALUES (?, ?)";

        PreparedStatement ps = null; 

        try{
            ps = Conexao.getConexao().prepareStatement(sql);

            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getMarca());

            ps.execute();
            ps.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void verDados(){
        String sql = "SELECT * FROM CARROS";
        
        PreparedStatement ps = null;

        try{
            ps = Conexao.getConexao().prepareStatement(sql);
            ResultSet data = ps.executeQuery();
            while(data.next()){
                String nome = data.getString("nome");
                String marca = data.getString("marca");

                System.out.println("Nome: " + nome + " -  Marca: " + marca);
            }
            System.out.println();
            ps.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void editarDado(Usuario usuario){
        String sql = "UPDATE CARROS SET Marca = ? WHERE ID = ?";

        PreparedStatement ps = null;

        try{
            ps = Conexao.getConexao().prepareStatement(sql);

            ps.setString(1, usuario.getMarca());
            ps.setInt(2, usuario.getId());

            ps.execute();
            ps.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void deletarDado(Usuario usuario){
        String sql = "DELETE FROM CARROS WHERE ID = ?";

        PreparedStatement ps = null;

        try{
            ps = Conexao.getConexao().prepareStatement(sql);

            ps.setInt(1, usuario.getId());

            ps.execute();
            ps.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}

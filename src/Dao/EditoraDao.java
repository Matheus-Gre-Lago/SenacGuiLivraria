/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;



import Conexao.Conexao;
import Model.ModelCliente;
import Model.ModelEditora;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EditoraDao {
    public void cadastrarEditora(ModelEditora eVO) {   
        try(Connection con = Conexao.getConexao();
            Statement stat = con.createStatement();){
       
            String sql;
            sql = "insert into editora values "
                    + "(null, '"
                    + eVO.getNomeEditora()+ "', '"
                    + eVO.getEndereco()+ "', '"
                    + eVO.getTelefone()+ "', '"
                    + eVO.getGerente()+ "');";
            stat.execute(sql);
            
        }catch (SQLException e){
        JOptionPane.showMessageDialog(null,
                    "Erro ao inserir.\n" + e.getMessage(),
                    "Erro",JOptionPane.ERROR_MESSAGE);        
        }
    }
    
    public ArrayList<ModelEditora> listarEditoras() throws SQLException{
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        
        try{
            String sql;
            sql = "select * from editora";
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<ModelEditora> editora = new ArrayList<>();
            while(rs.next()){
                ModelEditora e = new ModelEditora();
                //lado do java |x| lado do BD
                e.setIdEditora(rs.getInt("ideditora"));
                e.setNomeEditora(rs.getString("nomeEditora"));
                e.setEndereco(rs.getString("endereco"));
                e.setTelefone(rs.getString("telefone"));
                e.setGerente(rs.getString("gerente"));
                editora.add(e);
            } 
            
            return editora;
        }catch (SQLException e) {
           throw new SQLException("Erro ao buscar clientes!\n" +
                    e.getMessage()); 
        } finally {
            con.close();
            stat.close();
        }
    }
    
     public void atualizarEditora (ModelEditora pVO) throws SQLException{
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
               
        try {
           String sql;
           sql = "update editora set "
                    + "nomeEditora = '" + pVO.getNomeEditora()+ "', "
                    + "endereco = '" + pVO.getEndereco()+ "', "
                    + "telefone = '" + pVO.getTelefone()+ "', "
                    + "gerente = '" + pVO.getGerente()+ "', "
                    + "where ideditora= " + pVO.getIdEditora();
            stat.executeUpdate(sql);   
        } catch (SQLException e) {
            throw new SQLException("Erro ao atualizar Cliente. \n"
                    +e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
}

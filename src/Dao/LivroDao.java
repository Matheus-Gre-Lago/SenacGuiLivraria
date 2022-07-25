/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Conexao.Conexao;
import Model.ModelCliente;
import Model.ModelLivro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 55519
 */
public class LivroDao {
    
    public void cadastrarLivro(ModelLivro lVO) { 
        try {
            Connection con = Conexao.getConexao();
            Statement stat = con.createStatement();
            con = Conexao.getConexao();
            
             String sql;
            sql = "insert into livro values "
                    + "(null, '"
                    + lVO.getTitulo()+ "', '"
                    + lVO.getIsbn()+ "', '"
                    + lVO.getAssunto()+ "', '"
                    + lVO.getAutor()+ "', '"
                    + lVO.getEstoque()+ "', '"
                    + lVO.getPreco()+ "', '"
                    + lVO.getIdEditora()+ "');";
            stat.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(LivroDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void atualizarLivro(ModelLivro lVO) throws SQLException{  
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        
        try{
            String sql;
            sql = "update livro set " 
                    + "tituloLivro ='" + lVO.getTitulo() + "', "
                    + "isbn ='" + lVO.getIsbn() + "', "
                    + "assunto ='" + lVO.getAssunto() +  "', "
                    + "autor ='" + lVO.getAutor() +  "', "
                    + "estoque ='" + lVO.getEstoque() +  "', "
                    + "valor ='" + lVO.getPreco() + "', "
                    + "ideditora ='" + lVO.getIdEditora() + "', "
                    + "where idlivro=" + lVO.getIdLivro();
             stat.executeUpdate(sql);      
        }catch(SQLException e){
            throw new SQLException("Erro ao atualizar Cliente. \n"
            +e.getMessage());
        }finally{
            con.close();
            stat.close();
        }
    }
       
    public ArrayList<ModelLivro> listarLivro() throws SQLException{
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;
            sql = "select * from livro";
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<ModelLivro> livro = new ArrayList<>();
            while(rs.next()){
                ModelLivro l = new ModelLivro();
                l.setIdLivro(rs.getInt("idlivro"));
                l.setTitulo(rs.getString("tituloLivro"));
                l.setIsbn(rs.getString("isbn"));
                l.setAssunto(rs.getString("assunto"));
                l.setAutor(rs.getString("autor"));
                l.setEstoque(Integer.parseInt(rs.getString("estoque"))); 
                l.setPreco(Float.parseFloat(rs.getString("valor"))); 
                l.setIdEditora(Integer.parseInt(rs.getString("ideditora"))); 
                livro.add(l);
            }
            //retorna arrayList
            return livro;
        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar clientes!\n" +
                    e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }
}


package Dao;

import Conexao.Conexao;
import Model.ModelCliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClienteDao {
    public void cadastrarCliente(ModelCliente cVO) {
        
        try(Connection con = Conexao.getConexao();
            Statement stat = con.createStatement();){
            
            String sql;
            sql = "insert into cliente values "
                    + "(null, '"
                    + cVO.getNomeCliente()+ "', '"
                    + cVO.getEndereco() + "', '"
                    + cVO.getTelefone() + "', '"
                    + cVO.getCpf() + "', '"
                    + cVO.getCnpj()+ "');";
            stat.execute(sql);
        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,
                    "Erro ao inserir.\n" + e.getMessage(),
                    "Erro",JOptionPane.ERROR_MESSAGE);
        }
    }
    

    
    public ArrayList<ModelCliente> listarClientes() throws SQLException{
        //Busca conexão do BD
        Connection con = Conexao.getConexao();
        //cria espaço de trabalho sql, é a área no Java onde
        //vamos executar os scripts SQL
        Statement stat = con.createStatement();

        try {
            String sql;
            sql = "select * from cliente";
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<ModelCliente> clientes = new ArrayList<>();
            while(rs.next()){
                ModelCliente p = new ModelCliente();
                //lado do java |x| lado do BD
                p.setIdCliente(rs.getInt("idCliente"));
                p.setNomeCliente(rs.getString("nome"));
                p.setEndereco(rs.getString("enderecoCompleto"));
                p.setTelefone(rs.getString("telefone"));
                p.setCpf(rs.getString("cpf"));
                p.setCnpj(rs.getString("cnpj")); 
                //popula arrayList
                clientes.add(p);
            }
            //retorna arrayList
            return clientes;
        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar clientes!\n" +
                    e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }

    public boolean verCPF(String cpf) throws SQLException{
        //Busca conexão do BD
        Connection con = Conexao.getConexao();
        //cria espaço de trabalho sql, é a área no Java onde
        //vamos executar os scripts SQL
        Statement stat = con.createStatement();

        boolean verCPF = false;

        try {
            String sql;
            sql = "select cpf from cliente where cpf = '" + cpf + "'";
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                verCPF = rs.wasNull();
            }
        } catch (SQLException e) {
            throw new SQLException("Cliente com este CPF não existe! \n"
                    + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
        return verCPF;
    }

    public ModelCliente getByDoc(String cpf) throws SQLException{
        //Busca conexão do BD
        Connection con = Conexao.getConexao();
        //cria espaço de trabalho sql, é a área no Java onde
        //vamos executar os scripts SQL
        Statement stat = con.createStatement();
        ModelCliente p = new ModelCliente();

        try {
            String sql;
            sql = "select * from cliente where cpf = '" + cpf + "'";
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                //lado do java |x| lado do banco
                p.setIdCliente(rs.getInt("idCliente"));
                p.setNomeCliente(rs.getString("nome"));
                p.setEndereco(rs.getString("enderecoCompleto"));
                p.setTelefone(rs.getString("telefone"));
                p.setCpf(rs.getString("cpf"));
                p.setCnpj(rs.getString("cnpj"));
            }
        } catch (SQLException e) {
            throw new SQLException("Cliente com este cpf não existe!\n"
                    + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
        return p;
    }

    public void deletarCliente(int id) throws SQLException{
        //Busca conexão do BD
        Connection con = Conexao.getConexao();
        //cria espaço de trabalho sql, é a área no Java onde
        //vamos executar os scripts SQL
        Statement stat = con.createStatement();

        try {
            String sql;
            sql = "delete from cliente where idCliente = " + id;
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao deletar Cliente. \n"
                    + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }

    public void atualizarCliente (ModelCliente pVO) throws SQLException{
        //Busca conexão do BD
        Connection con = Conexao.getConexao();
        //cria espaço de trabalho sql, é a área no Java onde
        //vamos executar os scripts SQL
        Statement stat = con.createStatement();
               
        try {
           String sql;
           sql = "update cliente set "
                    + "nome = '" + pVO.getNomeCliente() + "', "
                    + "enderecoCompleto = '" + pVO.getEndereco()+ "', "
                    + "telefone = '" + pVO.getTelefone()+ "', "
                    + "cpf = '" + pVO.getCpf()+ "', "
                    + "cnpj = '" + pVO.getCnpj()+ "', "
                    + "where idcliente = " + pVO.getIdCliente();
     
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

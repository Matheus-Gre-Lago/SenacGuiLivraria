/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Dao.ClienteDao;
import Dao.DaoFactory;
import java.util.ArrayList;
import java.sql.SQLException;
import Model.ModelCliente;



public class ServicosCliente {
    
    ArrayList<ModelCliente> clientes = new ArrayList<>();
    
    private final ClienteDao clienteDAO = DaoFactory.getClienteDAO();

    public void cadCliente(ModelCliente cVO) throws SQLException {
        clienteDAO.cadastrarCliente(cVO);
    }

    public ArrayList<ModelCliente> getClientes() throws SQLException {
        return clienteDAO.listarClientes();
    }

    public boolean verCpfBD(String cpf) throws SQLException {
        ClienteDao pDAO = DaoFactory.getClienteDAO();
        return pDAO.verCPF(cpf);
    }

    public ModelCliente buscarCliente(String cpf) throws SQLException {
        ClienteDao pDAO = DaoFactory.getClienteDAO();
        return pDAO.getByDoc(cpf);
    }

    public void deletarClienteBD(int id) throws SQLException{
        ClienteDao pDAO = DaoFactory.getClienteDAO();
        pDAO.deletarCliente(id);
    }

    public void atualizarClienteBD(ModelCliente cVO)throws SQLException{
        clienteDAO.atualizarCliente(cVO);
    }
    
     public ModelCliente pesquisaCliente(int cpfCNPJ, String pesq) {
        ModelCliente c = new ModelCliente();
        switch (cpfCNPJ) {
            case 1:
                for (ModelCliente cli : clientes) {
                    if (cli.getCpf() != null && cli.getCpf().equals(pesq)) {
                        c = cli;
                    break;
                    }
                }
            break;
            case 2:
                for (ModelCliente cli : clientes) {
                    if (cli.getCnpj() != null && cli.getCnpj().equals(pesq)) {
                        c = cli;
                        break;
                    }
                }
            break;
            default:
                System.out.println("Cliente não Encontrado!!!");
            break;
        }
        return c;
    }


}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Dao.DaoFactory;
import Dao.EditoraDao;
import Model.ModelEditora;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 55519
 */
public class ServicosEditora {
    
    ArrayList<ModelEditora> editora = new ArrayList<>();
    private final EditoraDao editoraDAO = DaoFactory.getEditoraDAO();
    
     public void cadEditora(ModelEditora eVO){
        editoraDAO.cadastrarEditora(eVO);
    }
    
     public void atualizarEditoraBD(ModelEditora eVO) throws SQLException{
        editoraDAO.atualizarEditora(eVO);
    }
     
      
    public ArrayList<ModelEditora> getEditoras() throws SQLException {
        return editoraDAO.listarEditoras();
    }
}

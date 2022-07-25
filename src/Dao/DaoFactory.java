/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

/**
 *
 * @author 55519
 */
public class DaoFactory {

    private static final ClienteDao cDAO = new ClienteDao();
    private static final LivroDao lDao = new LivroDao();
    private static final EditoraDao eDao = new EditoraDao();
    
    public static ClienteDao getClienteDAO(){
        return cDAO;
    }
    
    public static LivroDao getLivroDAO(){
        return lDao;
    }
    
    public static EditoraDao getEditoraDAO(){
        return eDao;
    }
}

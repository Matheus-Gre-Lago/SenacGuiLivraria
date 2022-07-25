package Services;

import Dao.DaoFactory;
import Dao.LivroDao;
import Model.ModelLivro;
import java.sql.SQLException;
import java.util.ArrayList;


public class ServicosLivro {
    
    ArrayList<ModelLivro> livros = new ArrayList<>();
    private final LivroDao livroDAO = DaoFactory.getLivroDAO();
    
    public void cadLivro(ModelLivro lVO){
        livroDAO.cadastrarLivro(lVO);
    }
    
    public ArrayList<ModelLivro> getLivros() throws SQLException {
        return livroDAO.listarLivro();
    }
    
    public void atualizarLivroBD(ModelLivro lVO) throws SQLException{
        livroDAO.atualizarLivro(lVO);
    }
}

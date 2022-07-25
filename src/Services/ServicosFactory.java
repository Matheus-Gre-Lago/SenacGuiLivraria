package Services;

public class ServicosFactory {
    
    private static ServicosCliente clienteServicos = new ServicosCliente();
    private static ServicosLivro livroServicos = new ServicosLivro();
    private static ServicosEditora editoraServicos = new ServicosEditora();
    
    public static ServicosCliente getClienteServicos(){
        return clienteServicos;
    }

    public static ServicosLivro getLivroServicos(){
        return livroServicos;
    }
    
    public static ServicosEditora getEditoraServicos(){
        return editoraServicos;
    }
}

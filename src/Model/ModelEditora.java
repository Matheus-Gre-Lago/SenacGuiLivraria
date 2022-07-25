/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author 55519
 */
public class ModelEditora {
    private int idEditora = 1;
    private String nmEditora;
    private String endereco;
    private String telefone;
    private String gerente;


    public ModelEditora() {
    }

    public ModelEditora(int idEditora, String nmEditora, String endereco, String telefone, String gerente) {
        this.idEditora = idEditora;
        this.nmEditora = nmEditora;
        this.endereco = endereco;
        this.telefone = telefone;
        this.gerente = gerente;
    }
    
    public int getIdEditora() {
        return idEditora;
    }
    
    public void setIdEditora(int idEditora) {
        this.idEditora = idEditora;
    }

    public String getNomeEditora() {
        return nmEditora;
    }

    public void setNomeEditora(String nmEditora) {
        this.nmEditora = nmEditora;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return "editora{" + "idEditora=" + idEditora + ", nmEditora=" + 
                nmEditora + ", endereco=" + endereco + ", telefone=" + 
                telefone + ", gerente=" + gerente + '}';
    }
    
   
}

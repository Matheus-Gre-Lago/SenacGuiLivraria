
package View.Livro;

import Model.ModelCliente;
import Model.ModelLivro;
import Services.ServicosCliente;
import Services.ServicosFactory;
import Services.ServicosLivro;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.FocusEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;


public class ViewLivroVenda extends javax.swing.JDialog {
    
       
    public ViewLivroVenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        atualizarTabelaLivro();
    }

    public ViewLivroVenda() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void atualizarTabelaLivro(){
        DefaultTableModel modelTable = (DefaultTableModel) tableVendaLivro.getModel();
        modelTable.getDataVector().removeAllElements();
        modelTable.fireTableDataChanged();
        
        Object rowData[] = new Object[6];
        ServicosLivro livroServicos =  ServicosFactory.getLivroServicos();
        

        try {
            for(ModelLivro livro : livroServicos.getLivros()){
                rowData[0] = livro.getIdLivro();
                rowData[1] = livro.getTitulo();
                rowData[2] = livro.getAutor();
                rowData[3] = livro.getAssunto();
                rowData[4] = livro.getPreco();
                rowData[5] = livro.getEstoque();
                modelTable.addRow(rowData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViewLivroVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVendaLivro = new javax.swing.JTable();
        buttonVender = new javax.swing.JButton();
        comboBoxClienteVenda = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textFieldQuantidade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Venda Livro");

        tableVendaLivro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Titulo Livro", "Autor", "Assunto", "Preço", "Quantidade"
            }
        ));
        jScrollPane1.setViewportView(tableVendaLivro);

        buttonVender.setText("Vender");
        buttonVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVenderActionPerformed(evt);
            }
        });

        comboBoxClienteVenda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        comboBoxClienteVenda.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                comboBoxClienteVendaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel2.setText("Cliente");

        jLabel3.setText("Quantidade");

        textFieldQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldQuantidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonVender, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(comboBoxClienteVenda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldQuantidade))))
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(287, 287, 287))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboBoxClienteVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonVender))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void buttonVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVenderActionPerformed
        int id = tableVendaLivro.getSelectedRow();
        
        if(id >= 0){
            if(comboBoxClienteVenda.getSelectedIndex() > 0){
                if(textFieldQuantidade.getText().equals("") || textFieldQuantidade.getText().equals("0")){
                    JOptionPane.showMessageDialog(this, "Escolha a quantidade que deseja comprar");
                }else{
                    int quantidaCompra = Integer.parseInt(textFieldQuantidade.getText());
                    int quantidadeEstoque = (int) tableVendaLivro.getValueAt(id, 5);
  
                    if(quantidadeEstoque >= quantidaCompra){
              
                    ServicosLivro livroServicos = ServicosFactory.getLivroServicos();
                    ModelLivro livro = new ModelLivro();
                    
                    livro.setIdLivro((int) tableVendaLivro.getValueAt(id, 0));
                    livro.setEstoque(quantidadeEstoque - quantidaCompra);

                    try {
                        JOptionPane.showMessageDialog(this, "Venda realizada com sucesso. " + textFieldQuantidade.getText() + " unidades do livro " +  tableVendaLivro.getValueAt(id, 1)+ " foram vendidas");
                        livroServicos.atualizarLivroBD(livro);
                    } catch (SQLException ex) {
                        Logger.getLogger(ViewLivroVenda.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    atualizarTabelaLivro();
                    }else{
                        JOptionPane.showMessageDialog(this, "Numero maximo do estoque ultrapassado");
                    }
                }
            }else{
                JOptionPane.showMessageDialog(this, "Escolha o cliente que vai realizar a venda");
            }            
        }else{
            JOptionPane.showMessageDialog(this, "Escolha um Livro para realizar a venda");
        }
    }//GEN-LAST:event_buttonVenderActionPerformed

    private void comboBoxClienteVendaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_comboBoxClienteVendaAncestorAdded
        ServicosCliente editoraServicos = ServicosFactory.getClienteServicos();
        ArrayList<ModelCliente> modelEditora = null;

        try {
            modelEditora = editoraServicos.getClientes();
        } catch (SQLException ex) {
            Logger.getLogger(ViewLivroVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        comboBoxClienteVenda.removeAll();

        for(ModelCliente cliente : modelEditora){
            comboBoxClienteVenda.addItem(cliente.getNomeCliente());
        } 
    }//GEN-LAST:event_comboBoxClienteVendaAncestorAdded

    private void textFieldQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldQuantidadeActionPerformed
  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewLivroVenda dialog = new ViewLivroVenda(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonVender;
    private javax.swing.JComboBox comboBoxClienteVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableVendaLivro;
    private javax.swing.JTextField textFieldQuantidade;
    // End of variables declaration//GEN-END:variables
}

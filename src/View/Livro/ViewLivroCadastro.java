/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.Livro;

import Dao.EditoraDao;
import Model.ModelEditora;
import Model.ModelLivro;
import Services.ServicosEditora;
import Services.ServicosFactory;
import Services.ServicosLivro;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.List;
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


public class ViewLivroCadastro extends javax.swing.JFrame {

    JTextArea output;
    JScrollPane scrollPane;
    
    public ViewLivroCadastro() {
        initComponents();
        atualizarTabelaLivro();
    }
    
    public void atualizarTabelaLivro(){
        DefaultTableModel modelTable = (DefaultTableModel) tableCadastroLivro.getModel();
        modelTable.getDataVector().removeAllElements();
        modelTable.fireTableDataChanged();
        
        Object rowData[] = new Object[8];
        ServicosLivro livroServicos =  ServicosFactory.getLivroServicos();
        
      
        try {
            for(ModelLivro livro : livroServicos.getLivros()){
                rowData[0] = livro.getIdLivro();
                rowData[1] = livro.getTitulo();
                rowData[2] = livro.getAutor();
                rowData[3] = livro.getIsbn();
                rowData[4] = livro.getAssunto();
                rowData[5] = livro.getEstoque();
                rowData[6] = livro.getPreco();
                rowData[7] = livro.getIdEditora();
                modelTable.addRow(rowData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViewLivroCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboBoxEditora = new javax.swing.JComboBox();
        textFieldTituloLivro = new javax.swing.JTextField();
        textFieldAutor = new javax.swing.JTextField();
        textFieldIsbn = new javax.swing.JTextField();
        textFieldAssunto = new javax.swing.JTextField();
        textFieldEstoque = new javax.swing.JTextField();
        textFieldPreco = new javax.swing.JTextField();
        buttonSalvar = new javax.swing.JButton();
        buttonLimpar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCadastroLivro = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelLogo.setText("Cadastro Livro");

        jLabel1.setText("Titulo Livro");

        jLabel2.setText("Autor");

        jLabel3.setText("ISBN");

        jLabel4.setText("Assunto");

        jLabel5.setText("Estoque");

        jLabel6.setText("Preço");

        jLabel7.setText("Editora");

        comboBoxEditora.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        comboBoxEditora.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                comboBoxEditoraAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        comboBoxEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxEditoraActionPerformed(evt);
            }
        });
        comboBoxEditora.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                comboBoxEditoraPropertyChange(evt);
            }
        });

        textFieldAssunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldAssuntoActionPerformed(evt);
            }
        });

        textFieldEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEstoqueActionPerformed(evt);
            }
        });

        buttonSalvar.setText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        buttonLimpar.setText("Limpar");
        buttonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimparActionPerformed(evt);
            }
        });

        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        tableCadastroLivro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Titulo Livro", "Autor", "ISBN", "Assunto", "Estoque", "Preço", "Editora"
            }
        ));
        jScrollPane1.setViewportView(tableCadastroLivro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(comboBoxEditora, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(buttonSalvar)
                                        .addGap(18, 18, 18)
                                        .addComponent(buttonLimpar)
                                        .addGap(18, 18, 18)
                                        .addComponent(buttonCancelar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel3))
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(textFieldPreco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                            .addComponent(textFieldIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textFieldAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textFieldEstoque, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(textFieldAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                            .addComponent(textFieldTituloLivro)))
                                    .addComponent(jLabel7))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(464, 464, 464)
                        .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(labelLogo)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(textFieldTituloLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(textFieldIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(textFieldAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(textFieldEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(textFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(comboBoxEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonSalvar)
                            .addComponent(buttonLimpar)
                            .addComponent(buttonCancelar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxEditoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxEditoraActionPerformed

    private void textFieldAssuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldAssuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldAssuntoActionPerformed

    private void textFieldEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEstoqueActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        ServicosLivro livroServicos = ServicosFactory.getLivroServicos();
        ModelLivro modelLivro = new ModelLivro();
        
        if(textFieldTituloLivro.getText().equals("") || 
           textFieldAutor.getText().equals("")       ||
           textFieldIsbn.getText().equals("")        ||
           textFieldAssunto.getText().equals("")     ||
           textFieldEstoque.getText().equals("")     ||
           textFieldPreco.getText().equals("")       ||
           comboBoxEditora.getSelectedIndex() == 0){
        
            JOptionPane.showMessageDialog(this, "Cadastro incompleto.");
            textFieldTituloLivro.requestFocus();
        } else {
            modelLivro.setTitulo(textFieldTituloLivro.getText().toUpperCase());
            modelLivro.setAutor(textFieldAutor.getText());
            modelLivro.setIsbn(textFieldIsbn.getText().toUpperCase());
            modelLivro.setAssunto(textFieldAssunto.getText());
            modelLivro.setEstoque(Integer.parseInt(textFieldEstoque.getText()));
            modelLivro.setPreco( Float.parseFloat(textFieldPreco.getText()));
            modelLivro.setIdEditora(comboBoxEditora.getSelectedIndex());
            
            livroServicos.cadLivro(modelLivro);
            JOptionPane.showMessageDialog(this, modelLivro.getTitulo()+ " cadastrado com sucesso!");
            atualizarTabelaLivro(); 

            buttonLimpar.doClick();
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void comboBoxEditoraPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_comboBoxEditoraPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxEditoraPropertyChange

    private void buttonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimparActionPerformed
        textFieldTituloLivro.setText("");
        textFieldAutor.setText("");   
        textFieldIsbn.setText("");
        textFieldAssunto.setText("");
        textFieldEstoque.setText("");
        textFieldPreco.setText("");
        comboBoxEditora.setSelectedIndex(0);
        textFieldTituloLivro.requestFocus();
    }//GEN-LAST:event_buttonLimparActionPerformed

    private void comboBoxEditoraAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_comboBoxEditoraAncestorAdded
       
       ServicosEditora editoraServicos = ServicosFactory.getEditoraServicos();
       ArrayList<ModelEditora> modelEditora = null;
       try {
            modelEditora = editoraServicos.getEditoras();
       } catch (SQLException ex) {
            Logger.getLogger(ViewLivroCadastro.class.getName()).log(Level.SEVERE, null, ex);
       }
      
       comboBoxEditora.removeAll();
       
       for(ModelEditora editora : modelEditora){
           comboBoxEditora.addItem(editora.getNomeEditora());
       }
    }//GEN-LAST:event_comboBoxEditoraAncestorAdded
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Painel Principal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ViewLivroCadastro demo = new ViewLivroCadastro();
        frame.setContentPane(demo.createContentPane());

        //Display the window.
        frame.setSize(450, 260);
        frame.setVisible(true);
    }
    
    
    public Container createContentPane() {
        //Create the content-pane-to-be.
        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.setOpaque(true);

        //Create a scrolled text area.
        output = new JTextArea(5, 30);
        output.setEditable(false);
        scrollPane = new JScrollPane(output);

        //Add the text area to the content pane.
        contentPane.add(scrollPane, BorderLayout.CENTER);

        return contentPane;
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewLivroCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewLivroCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewLivroCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewLivroCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonLimpar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JComboBox comboBoxEditora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JTable tableCadastroLivro;
    private javax.swing.JTextField textFieldAssunto;
    private javax.swing.JTextField textFieldAutor;
    private javax.swing.JTextField textFieldEstoque;
    private javax.swing.JTextField textFieldIsbn;
    private javax.swing.JTextField textFieldPreco;
    private javax.swing.JTextField textFieldTituloLivro;
    // End of variables declaration//GEN-END:variables
}

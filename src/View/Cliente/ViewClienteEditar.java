/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.Cliente;

import Model.ModelCliente;
import Services.ServicosCliente;
import Services.ServicosFactory;
import static java.lang.System.out;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 55519
 */
public class ViewClienteEditar extends javax.swing.JFrame {

    /**
     * Creates new form ViewClienteEditar
     */
    public ViewClienteEditar() {
        initComponents();
        atualizarTabelaCliente();
    }
    
     public void atualizarTabelaCliente() {
        DefaultTableModel modelTable = (DefaultTableModel) tableClienteCadastro.getModel();
        modelTable.getDataVector().removeAllElements();
        modelTable.fireTableDataChanged();
        
        Object rowData[] = new Object[6];
        ServicosCliente clienteServicos =  ServicosFactory.getClienteServicos();
        
        try {
            for(ModelCliente cliente : clienteServicos.getClientes()){
                rowData[0] = cliente.getIdTabela();
                rowData[1] = cliente.getNomeCliente();
                rowData[2] = cliente.getCpf();
                rowData[3] = cliente.getCnpj();
                rowData[4] = cliente.getTelefone();
                rowData[5] = cliente.getEndereco();
                modelTable.addRow(rowData);
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ViewClienteEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelEndereco = new javax.swing.JLabel();
        textFieldNome = new javax.swing.JTextField();
        textFieldTelefone = new javax.swing.JTextField();
        textFieldEndereco = new javax.swing.JTextField();
        radioButtonCpf = new javax.swing.JRadioButton();
        radioButtonCnpj = new javax.swing.JRadioButton();
        textFieldCpfCnpj = new javax.swing.JTextField();
        buttonEditarSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableClienteCadastro = new javax.swing.JTable();
        buttonExcluir = new javax.swing.JButton();
        buttonLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Editar Cliente");

        labelNome.setText("Nome Cliente");

        jLabel3.setText("Telefone");

        labelEndereco.setText("Endereço");

        textFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeActionPerformed(evt);
            }
        });

        radioButtonCpf.setText("CPF");
        radioButtonCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonCpfActionPerformed(evt);
            }
        });

        radioButtonCnpj.setText("CNPJ");

        textFieldCpfCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCpfCnpjActionPerformed(evt);
            }
        });

        buttonEditarSalvar.setText("Editar");
        buttonEditarSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarSalvarActionPerformed(evt);
            }
        });

        buttonCancelar.setText("Cancelar");

        tableClienteCadastro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Cpf", "CNPJ", "Telefone", "Endereço"
            }
        ));
        jScrollPane1.setViewportView(tableClienteCadastro);

        buttonExcluir.setText("Excluir");
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });

        buttonLimpar.setText("Limpar");
        buttonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(radioButtonCpf)
                        .addGap(71, 71, 71)
                        .addComponent(radioButtonCnpj))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNome)
                                    .addComponent(jLabel3)
                                    .addComponent(labelEndereco))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textFieldEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(textFieldTelefone)
                                    .addComponent(textFieldNome)))
                            .addComponent(textFieldCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonEditarSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEndereco)
                    .addComponent(textFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonCpf)
                    .addComponent(radioButtonCnpj))
                .addGap(18, 18, 18)
                .addComponent(textFieldCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEditarSalvar)
                    .addComponent(buttonCancelar))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonExcluir)
                    .addComponent(buttonLimpar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
    
    private void textFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeActionPerformed

    private void radioButtonCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonCpfActionPerformed

    private void textFieldCpfCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCpfCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCpfCnpjActionPerformed

    private void buttonEditarSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarSalvarActionPerformed
       if(tableClienteCadastro.getSelectedRow() >= 0){
           if(buttonEditarSalvar.getText().equals("Editar")){
                int id = tableClienteCadastro.getSelectedRow();
                textFieldNome.setText(tableClienteCadastro.getValueAt(id, 1).toString());
                textFieldTelefone.setText(tableClienteCadastro.getValueAt(id, 4).toString());
                textFieldEndereco.setText(tableClienteCadastro.getValueAt(id, 5).toString());
                if (radioButtonCpf.isSelected()) {
                    textFieldCpfCnpj.setText(tableClienteCadastro.getValueAt(id, 2).toString());

                } else {
                    textFieldCpfCnpj.setText(tableClienteCadastro.getValueAt(id,3 ).toString());
                }
                buttonEditarSalvar.setText("Salvar");
            }else{
                int id = tableClienteCadastro.getSelectedRow();

                ServicosCliente clienteServicos = ServicosFactory.getClienteServicos();
                ModelCliente modelCliente = new ModelCliente();
                modelCliente.setIdCliente(id);
                modelCliente.setNomeCliente(textFieldNome.getText().toUpperCase());
                modelCliente.setTelefone(textFieldTelefone.getText());
                modelCliente.setEndereco(textFieldEndereco.getText().toUpperCase());

                try {
                    System.out.println(modelCliente.toString());
                    clienteServicos.atualizarClienteBD(modelCliente);
                } catch (SQLException ex) {
                    Logger.getLogger(ViewClienteCadastro.class.getName()).log(Level.SEVERE, null, ex);
                }

                JOptionPane.showMessageDialog(this, modelCliente.getNomeCliente() + " atualizado com sucesso!");
                atualizarTabelaCliente();
            }
       }else{
           JOptionPane.showMessageDialog(this,  " Selecione uma linha para editar ");
       }
    }//GEN-LAST:event_buttonEditarSalvarActionPerformed

    private void buttonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimparActionPerformed
        textFieldNome.setText("");
        textFieldCpfCnpj.setText("");
        textFieldEndereco.setText("");
        textFieldTelefone.setText("");
        textFieldNome.requestFocus();
    }//GEN-LAST:event_buttonLimparActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        
        int id = tableClienteCadastro.getSelectedRow();        
        ModelCliente modelCliente = new  ModelCliente();
        int idUsario = (int) tableClienteCadastro.getValueAt(id, 0);
         
        ServicosCliente clienteServicos = ServicosFactory.getClienteServicos();     
        try {
            clienteServicos.deletarClienteBD(idUsario);
            JOptionPane.showMessageDialog(this,  " Cliente deletado com sucesso!");
            atualizarTabelaCliente();
        } catch (SQLException ex) {
            Logger.getLogger(ViewClienteEditar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonExcluirActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(ViewClienteEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewClienteEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewClienteEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewClienteEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewClienteEditar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonEditarSalvar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelNome;
    private javax.swing.JRadioButton radioButtonCnpj;
    private javax.swing.JRadioButton radioButtonCpf;
    private javax.swing.JTable tableClienteCadastro;
    private javax.swing.JTextField textFieldCpfCnpj;
    private javax.swing.JTextField textFieldEndereco;
    private javax.swing.JTextField textFieldNome;
    private javax.swing.JTextField textFieldTelefone;
    // End of variables declaration//GEN-END:variables
}

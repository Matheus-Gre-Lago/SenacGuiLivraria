/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package View.Cliente;

import Dao.ClienteDao;
import Services.ServicosCliente;
import Services.ServicosFactory;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.ModelCliente;

public class ViewClienteCadastro extends javax.swing.JDialog {

    public ViewClienteCadastro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        atualizarTabelaCliente();
    }

    public ViewClienteCadastro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
                System.out.println(cliente.getIdCliente());
                modelTable.addRow(rowData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViewClienteCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        labelCadastroLogo = new javax.swing.JLabel();
        labelNomeCliente = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        labelEndereco = new javax.swing.JLabel();
        textFieldNome = new javax.swing.JTextField();
        textFieldTelefone = new javax.swing.JTextField();
        textFieldEndereco = new javax.swing.JTextField();
        radioButtonCpf = new javax.swing.JRadioButton();
        radioButtonCnpj = new javax.swing.JRadioButton();
        textFieldCpfCnpj = new javax.swing.JTextField();
        buttonSalvar = new javax.swing.JButton();
        buttonLimpar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableClienteCadastro = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelCadastroLogo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelCadastroLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCadastroLogo.setText("Cadastro Cliente");
        labelCadastroLogo.setToolTipText("");
        labelCadastroLogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelCadastroLogo.setName(""); // NOI18N

        labelNomeCliente.setText("Nome Cliente");

        labelTelefone.setText("Telefone");

        labelEndereco.setText("Endereço");

        textFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeActionPerformed(evt);
            }
        });

        textFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTelefoneActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioButtonCpf);
        radioButtonCpf.setText("CPF");
        radioButtonCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonCpfActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioButtonCnpj);
        radioButtonCnpj.setText("CNPJ");

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

        tableClienteCadastro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Cpf", "Cnpj", "Telefone", "Endereco"
            }
        ));
        jScrollPane2.setViewportView(tableClienteCadastro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(radioButtonCpf)
                        .addGap(65, 65, 65)
                        .addComponent(radioButtonCnpj))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonSalvar)
                                .addGap(35, 35, 35)
                                .addComponent(buttonLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(buttonCancelar))
                            .addComponent(labelCadastroLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNomeCliente)
                                    .addComponent(labelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelEndereco))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldNome)
                                    .addComponent(textFieldTelefone)
                                    .addComponent(textFieldEndereco)))
                            .addComponent(textFieldCpfCnpj)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCadastroLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeCliente)
                    .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefone)
                    .addComponent(textFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEndereco)
                    .addComponent(textFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonCpf)
                    .addComponent(radioButtonCnpj))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSalvar)
                    .addComponent(buttonLimpar)
                    .addComponent(buttonCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeActionPerformed

    private void textFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldTelefoneActionPerformed

    private void radioButtonCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonCpfActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        ServicosCliente clienteServicos = ServicosFactory.getClienteServicos();
        ModelCliente modelCliente = new ModelCliente();
        boolean doc = false;
        int tipoPessoa=0;
               
        if (radioButtonCpf.isSelected() && !radioButtonCnpj.isSelected()) {
                 tipoPessoa = 1;
        } else if (!radioButtonCpf.isSelected() && radioButtonCnpj.isSelected()) {
            tipoPessoa = 2;
        }else{
            JOptionPane.showMessageDialog(this, "Selecione tipo de cliente.");
        }
                
        modelCliente = ServicosFactory.getClienteServicos().pesquisaCliente(tipoPessoa, textFieldCpfCnpj.getText());    
        
        if (radioButtonCpf.isSelected() && modelCliente.getCpf() == null) {
            modelCliente.setCpf(textFieldCpfCnpj.getText());
            modelCliente.setCnpj(null);
            doc = false;
        } else if (radioButtonCnpj.isSelected() && modelCliente.getCnpj() == null) {
            modelCliente.setCpf(null);
            modelCliente.setCnpj(textFieldCpfCnpj.getText());
            doc = false;
        }
        
        try {
            if (ServicosFactory.getClienteServicos().verCpfBD(textFieldCpfCnpj.getText())) {
                JOptionPane.showMessageDialog(null, "Este documento já existe!"
                        + "\nTente novamente!!!");
                doc = true; 
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViewClienteCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        if ((radioButtonCpf.isSelected() || radioButtonCnpj.isSelected()) && !doc && !textFieldNome.getText().isEmpty() && !textFieldCpfCnpj.getText().isEmpty()) {
            modelCliente.setNomeCliente(textFieldNome.getText().toUpperCase());
            modelCliente.setTelefone(textFieldTelefone.getText());
            modelCliente.setEndereco(textFieldEndereco.getText().toUpperCase());
            modelCliente.setCnpj(textFieldCpfCnpj.getText());
            modelCliente.setCpf(textFieldCpfCnpj.getText());
        try {
            clienteServicos.cadCliente(modelCliente);
        } catch (SQLException ex) {
            Logger.getLogger(ViewClienteCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(this, modelCliente.getNomeCliente() + " cadastrado com sucesso!");
        atualizarTabelaCliente(); 

        buttonLimpar.doClick();
         
        } else {
            JOptionPane.showMessageDialog(this, "Cadastro incompleto.");
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimparActionPerformed
        textFieldNome.setText("");
        textFieldCpfCnpj.setText("");
        textFieldEndereco.setText("");
        textFieldTelefone.setText("");
        textFieldNome.requestFocus();
    }//GEN-LAST:event_buttonLimparActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCancelarActionPerformed


    public static void main(String args[]) {

  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewClienteCadastro dialog = new ViewClienteCadastro(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton buttonCancelar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton buttonLimpar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCadastroLogo;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelNomeCliente;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JRadioButton radioButtonCnpj;
    private javax.swing.JRadioButton radioButtonCpf;
    private javax.swing.JTable tableClienteCadastro;
    private javax.swing.JTextField textFieldCpfCnpj;
    private javax.swing.JTextField textFieldEndereco;
    private javax.swing.JTextField textFieldNome;
    private javax.swing.JTextField textFieldTelefone;
    // End of variables declaration//GEN-END:variables
}

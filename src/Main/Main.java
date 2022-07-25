package Main;

import View.Cliente.ViewClienteCadastro;
import View.Cliente.ViewClienteEditar;
import View.Editora.ViewEditoraCadastro;
import View.Editora.ViewEditoraEditar;
import View.Livro.ViewLivroCadastro;
import View.Livro.ViewLivroEditar;
import View.Livro.ViewLivroVenda;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Main extends javax.swing.JFrame {
        JTextArea output;
        JScrollPane scrollPane;

        public JMenuBar createMenuBar(){
             JMenuBar menuBar;
             JMenu menu, submenu,menuEditar, menuVenda;
             JMenuItem menuItem , menuItemEditar, menuItemVenda;

             //Create the menu bar.
             menuBar = new JMenuBar();

             //Build the first menu.
             menu = new JMenu("Cadastros");
             menu.setMnemonic(KeyEvent.VK_C);
             menu.getAccessibleContext().setAccessibleDescription(
                     "The only menu in this program that has menu items");
             menuBar.add(menu);

             
            menuEditar = new JMenu("Editar");
            menuEditar.setMnemonic(KeyEvent.VK_C);
            menuEditar.getAccessibleContext().setAccessibleDescription(
                    "The only menu in this program that has menu items");
            menuBar.add(menuEditar);
            
            menuVenda = new JMenu("Vendas");
            menuVenda.setMnemonic(KeyEvent.VK_C);
            menuVenda.getAccessibleContext().setAccessibleDescription(
                    "The only menu in this program that has menu items");
            menuBar.add(menuVenda);
            
             //Clientes
             menuItem = new JMenuItem("Clientes",
                     KeyEvent.VK_C);       
             menuItem.setActionCommand("mClientes");
             menuItem.addActionListener(null);
             menu.add(menuItem);
             
             menuItemEditar = new JMenuItem("Clientes Editar",KeyEvent.VK_C);
             menuItemEditar.setActionCommand("eClientes");
             menuItemEditar.addActionListener(null);
             menuEditar.add(menuItemEditar);
             
             
             //Editoras
             menuItem = new JMenuItem("Editoras",
                     KeyEvent.VK_E);
             menuItem.setActionCommand("mEditoras");
             menuItem.addActionListener(null);
             menu.add(menuItem);
             
             menuItemEditar = new JMenuItem("Editoras Editar",KeyEvent.VK_C);
             menuItemEditar.setActionCommand("eEditoras");
             menuItemEditar.addActionListener(null);
             menuEditar.add(menuItemEditar);

             //Livros
             menuItem = new JMenuItem("Livros",
                     KeyEvent.VK_L);
             menuItem.setActionCommand("mLivros");
             menuItem.addActionListener(null);
             menu.add(menuItem);

             menuItemEditar = new JMenuItem("Livros Editar",KeyEvent.VK_C);
             menuItemEditar.setActionCommand("eLivros");
             menuItemEditar.addActionListener(null);
             menuEditar.add(menuItemEditar);
             
             menuItemVenda = new JMenuItem("Venda Livros",KeyEvent.VK_C);
             menuItemVenda.setActionCommand("vLivros");
             menuItemVenda.addActionListener(null);
             menuVenda.add(menuItemVenda);
             
             return menuBar;
        }
        
        public void actionPerformed(ActionEvent e) {
            if ("mClientes".equals(e.getActionCommand())) {
                ViewClienteCadastro clienteCadastro = new ViewClienteCadastro();
                clienteCadastro.setVisible(true);
                clienteCadastro.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            }
            if ("mEditoras".equals(e.getActionCommand())) {
                ViewEditoraCadastro editoraCadastro = new ViewEditoraCadastro();
                editoraCadastro.setVisible(true);
                editoraCadastro.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            }
            if ("mLivros".equals(e.getActionCommand())) {
                ViewLivroCadastro liv = new ViewLivroCadastro();
                liv.setVisible(true);
                liv.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            }
            if ("eClientes".equals(e.getActionCommand())) {
                ViewClienteEditar clienteEditar = new ViewClienteEditar();
                clienteEditar.setVisible(true);
                clienteEditar.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            }
            if ("eEditoras".equals(e.getActionCommand())) {
                ViewEditoraEditar editoraEditar = new ViewEditoraEditar();
                editoraEditar.setVisible(true);
                editoraEditar.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            }
            
            if ("eLivro".equals(e.getActionCommand())) {
                ViewLivroEditar livroEditar = new ViewLivroEditar();
                livroEditar.setVisible(true);
                livroEditar.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            }
            
            if ("vLivro".equals(e.getActionCommand())) {
                ViewLivroVenda livroVenda = new ViewLivroVenda();
                livroVenda.setVisible(true);
                livroVenda.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            }
        }
        
        public Container createContentPane() {
            JPanel contentPane = new JPanel(new BorderLayout());
            contentPane.setOpaque(true);
            output = new JTextArea(5, 30);
            output.setEditable(false);
            scrollPane = new JScrollPane(output);

            contentPane.add(scrollPane, BorderLayout.CENTER);

            return contentPane;
        }

        private static void createAndShowGUI() {
            JFrame frame = new JFrame("Painel Principal");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Main demo = new Main();
            frame.setJMenuBar(demo.createMenuBar());
            frame.setContentPane(demo.createContentPane());

            frame.setSize(450, 260);
            frame.setVisible(true);
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        public static void main(String args[]) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

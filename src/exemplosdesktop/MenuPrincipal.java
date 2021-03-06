/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplosdesktop;

/**
 *
 * @author wolfi
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbPrincipal = new javax.swing.JToolBar();
        btClientes = new javax.swing.JButton();
        paStatus = new javax.swing.JPanel();
        lbSistema = new javax.swing.JLabel();
        mbMenu = new javax.swing.JMenuBar();
        mmCadastro = new javax.swing.JMenu();
        miClientes = new javax.swing.JMenuItem();
        mmFornecedores = new javax.swing.JMenu();
        mmProdutos = new javax.swing.JMenu();
        sp1 = new javax.swing.JPopupMenu.Separator();
        mmTabelas = new javax.swing.JMenu();
        miUnidade = new javax.swing.JMenuItem();
        mmMovimentos = new javax.swing.JMenu();
        mmNaoSei = new javax.swing.JMenu();
        mmConfiguracoes = new javax.swing.JMenu();
        mmSobre = new javax.swing.JMenu();
        mmAutor = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Cadastro 1.0z");

        tbPrincipal.setRollover(true);

        btClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exemplosdesktop/imagens/Alien.png"))); // NOI18N
        btClientes.setFocusable(false);
        btClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClientesActionPerformed(evt);
            }
        });
        tbPrincipal.add(btClientes);

        lbSistema.setText("Sistema gerencial de ativiades extraterrestres");

        javax.swing.GroupLayout paStatusLayout = new javax.swing.GroupLayout(paStatus);
        paStatus.setLayout(paStatusLayout);
        paStatusLayout.setHorizontalGroup(
            paStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paStatusLayout.createSequentialGroup()
                .addComponent(lbSistema)
                .addGap(0, 544, Short.MAX_VALUE))
        );
        paStatusLayout.setVerticalGroup(
            paStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paStatusLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbSistema))
        );

        mmCadastro.setText("Cadastros");

        miClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        miClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exemplosdesktop/imagens/Alien.png"))); // NOI18N
        miClientes.setMnemonic('C');
        miClientes.setText("Clientes");
        miClientes.setToolTipText("Cadastra um ser alienígena");
        miClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClientesActionPerformed(evt);
            }
        });
        mmCadastro.add(miClientes);

        mmFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exemplosdesktop/imagens/Boss.png"))); // NOI18N
        mmFornecedores.setMnemonic('F');
        mmFornecedores.setText("Fornecedores");
        mmCadastro.add(mmFornecedores);

        mmProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exemplosdesktop/imagens/Radiation.png"))); // NOI18N
        mmProdutos.setMnemonic('P');
        mmProdutos.setText("Produtos");
        mmCadastro.add(mmProdutos);
        mmCadastro.add(sp1);

        mmTabelas.setMnemonic('T');
        mmTabelas.setText("Tabelas");

        miUnidade.setText("Unidade");
        miUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miUnidadeActionPerformed(evt);
            }
        });
        mmTabelas.add(miUnidade);

        mmCadastro.add(mmTabelas);

        mbMenu.add(mmCadastro);

        mmMovimentos.setText("Movimentos");

        mmNaoSei.setText("jMenu3");
        mmMovimentos.add(mmNaoSei);

        mbMenu.add(mmMovimentos);

        mmConfiguracoes.setText("Configurações");
        mbMenu.add(mmConfiguracoes);

        mmSobre.setText("Sobre");

        mmAutor.setText("Autor");
        mmSobre.add(mmAutor);

        mbMenu.add(mmSobre);

        setJMenuBar(mbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(paStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tbPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 315, Short.MAX_VALUE)
                .addComponent(paStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miUnidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miUnidadeActionPerformed

    private void btClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClientesActionPerformed
        miClientesActionPerformed(evt);
    }//GEN-LAST:event_btClientesActionPerformed

    private void miClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClientesActionPerformed
        System.out.println("A vaca morreu");
    }//GEN-LAST:event_miClientesActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btClientes;
    private javax.swing.JLabel lbSistema;
    private javax.swing.JMenuBar mbMenu;
    private javax.swing.JMenuItem miClientes;
    private javax.swing.JMenuItem miUnidade;
    private javax.swing.JMenu mmAutor;
    private javax.swing.JMenu mmCadastro;
    private javax.swing.JMenu mmConfiguracoes;
    private javax.swing.JMenu mmFornecedores;
    private javax.swing.JMenu mmMovimentos;
    private javax.swing.JMenu mmNaoSei;
    private javax.swing.JMenu mmProdutos;
    private javax.swing.JMenu mmSobre;
    private javax.swing.JMenu mmTabelas;
    private javax.swing.JPanel paStatus;
    private javax.swing.JPopupMenu.Separator sp1;
    private javax.swing.JToolBar tbPrincipal;
    // End of variables declaration//GEN-END:variables
}

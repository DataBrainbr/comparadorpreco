/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.databrain.ui_form;

import br.com.databrain.comparapreco.*;
import br.com.databrain.entities.*;
import java.util.Date;

/**
 *
 * @author Paulo
 */
public class UI_Importar_Arquivo extends javax.swing.JFrame {

    /**
     * Creates new form UI_Importar_Arquivo
     */
    public UI_Importar_Arquivo() {
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

        jButton1 = new javax.swing.JButton();
        txtCaminhoArq = new javax.swing.JTextField();
        btnFonetizar = new javax.swing.JButton();
        txtFoneticaEntrada = new javax.swing.JTextField();
        txtFoneticaSaida = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnCaracEspecial = new javax.swing.JButton();
        txtCaracEspEntrada = new javax.swing.JTextField();
        txtCaracEspSaida = new javax.swing.JTextField();
        btnTratarLink = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtProcInicio = new javax.swing.JTextField();
        txtProcFim = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtCaminhoArq.setText("D:\\Sistemas\\temp\\teste.txt");
        txtCaminhoArq.setToolTipText("");

        btnFonetizar.setLabel("Fonetizar");
        btnFonetizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFonetizarActionPerformed(evt);
            }
        });

        txtFoneticaSaida.setText("jTextField2");

        btnCaracEspecial.setLabel("caracter especial");
        btnCaracEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaracEspecialActionPerformed(evt);
            }
        });

        btnTratarLink.setText("Tratar");
        btnTratarLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTratarLinkActionPerformed(evt);
            }
        });

        jLabel1.setText("Tratar produtos");

        txtProcInicio.setText("inicio proc");

        txtProcFim.setText("fim proc");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtFoneticaSaida)
                            .addComponent(txtFoneticaEntrada)
                            .addComponent(txtCaminhoArq, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(txtCaracEspEntrada))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnFonetizar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCaracEspecial, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTratarLink))
                            .addComponent(txtCaracEspSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtProcInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtProcFim, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(txtCaminhoArq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFonetizar)
                    .addComponent(txtFoneticaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFoneticaSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCaracEspecial)
                    .addComponent(txtCaracEspEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtCaracEspSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTratarLink)
                    .addComponent(jLabel1)
                    .addComponent(txtProcInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProcFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        btnCaracEspecial.getAccessibleContext().setAccessibleName("caracter Especial");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ImportarArquivoSite imp = new ImportarArquivoSite();
        
        try {
            imp.importarArquivoSite(txtCaminhoArq.getText());
        }
        
        catch (Exception e){
            txtCaminhoArq.setText(e.getMessage());
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnFonetizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFonetizarActionPerformed
        Fonetica fn = new Fonetica();
        
        txtFoneticaSaida.setText(fn.Fonetizar(txtFoneticaEntrada.getText()));
    }//GEN-LAST:event_btnFonetizarActionPerformed

    private void btnCaracEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaracEspecialActionPerformed
        Cleasing cs = new Cleasing();
        Produto prd = new Produto();
        
        prd.setDescricaoProduto(txtCaracEspEntrada.getText());
        
        prd = cs.tratarProduto(prd);
        
        txtCaracEspSaida.setText(prd.getDescricaoProduto());
    
    }//GEN-LAST:event_btnCaracEspecialActionPerformed

    private void btnTratarLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTratarLinkActionPerformed
         Cleasing cs = new Cleasing();
         
         Date dt = new Date();
         
         txtProcInicio.setText(dt.toString());
         
         cs.tratarProdutoETL();
         
         txtProcFim.setText(dt.toString());
    }//GEN-LAST:event_btnTratarLinkActionPerformed

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
            java.util.logging.Logger.getLogger(UI_Importar_Arquivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_Importar_Arquivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_Importar_Arquivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_Importar_Arquivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_Importar_Arquivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCaracEspecial;
    private javax.swing.JButton btnFonetizar;
    private javax.swing.JButton btnTratarLink;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtCaminhoArq;
    private javax.swing.JTextField txtCaracEspEntrada;
    private javax.swing.JTextField txtCaracEspSaida;
    private javax.swing.JTextField txtFoneticaEntrada;
    private javax.swing.JTextField txtFoneticaSaida;
    private javax.swing.JTextField txtProcFim;
    private javax.swing.JTextField txtProcInicio;
    // End of variables declaration//GEN-END:variables
}

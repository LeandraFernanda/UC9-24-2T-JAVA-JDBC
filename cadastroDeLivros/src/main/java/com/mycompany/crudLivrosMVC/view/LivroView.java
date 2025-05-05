
package com.mycompany.crudLivrosMVC.view;


import javax.swing.DefaultListModel;

import com.mycompany.crudLivrosMVC.view.LivroView;
import java.sql.Connection;




public class LivroView extends javax.swing.JFrame {
      
        
    
    
    
    private Connection conexao;
    private String idString;
    private Object novoTitulo;
    private Object novoAutor;
    private Object dao;
    private Object LIvroDAO;
    
    public LivroView(Connection conexao, String id, String titulo, String autor) {
        initComponents();
        novoTitulo.equals(titulo);
        novoAutor.equals(autor);
        idString = id;
        conexao = this.conexao;
        this.idString = id;
    }

    private LivroView() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }




 

  
   

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        autor = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        titulo = new javax.swing.JTextField();
        registrar = new javax.swing.JButton();
        listar = new javax.swing.JButton();
        atualizar = new javax.swing.JButton();
        deletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(0, 204, 153));

        lista.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                listaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(lista);

        autor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        autor.setText("Autor");
        autor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autorActionPerformed(evt);
            }
        });

        id.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        id.setText("ID");
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        titulo.setText("Titulo");
        titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloActionPerformed(evt);
            }
        });

        registrar.setBackground(new java.awt.Color(0, 255, 255));
        registrar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        registrar.setForeground(new java.awt.Color(0, 0, 0));
        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        listar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        listar.setForeground(new java.awt.Color(255, 51, 255));
        listar.setText("Listar");
        listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarActionPerformed(evt);
            }
        });

        atualizar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        atualizar.setForeground(new java.awt.Color(0, 102, 255));
        atualizar.setText("Atualizar");
        atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarActionPerformed(evt);
            }
        });

        deletar.setBackground(new java.awt.Color(255, 0, 51));
        deletar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        deletar.setText("Deletar");
        deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(autor)
                                    .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addComponent(registrar)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(atualizar)
                        .addGap(119, 119, 119)
                        .addComponent(listar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addComponent(deletar)
                        .addGap(76, 76, 76))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(autor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atualizar)
                    .addComponent(deletar)
                    .addComponent(listar))
                .addGap(71, 71, 71))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void autorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autorActionPerformed

    }//GEN-LAST:event_autorActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        String idString = null;
        int id = Integer.parseInt(idString);
    }//GEN-LAST:event_idActionPerformed

    private void tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloActionPerformed
        
    }//GEN-LAST:event_tituloActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        String idString = null;
        int id = Integer.parseInt(idString);
        String novoTitulo = titulo.getText();
        String novoAutor = autor.getText();        
    }//GEN-LAST:event_registrarActionPerformed

    private void atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarActionPerformed
        String idString = null;
         int id = Integer.parseInt(idString);
         String novoTitulo = titulo.getText();
         String novoAutor = autor.getText();
                 
                 
                 
                 
    }//GEN-LAST:event_atualizarActionPerformed

    private void listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarActionPerformed
          String idString = null;
         int id = Integer.parseInt(idString);
         String novoTitulo = titulo.getText();
         String novoAutor = autor.getText();          
    }//GEN-LAST:event_listarActionPerformed

    private void deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarActionPerformed
        String idString = null;
        int id = Integer.parseInt(idString);
        String novoTitulo = titulo.getText();
        String novoAutor = autor.getText();
       
    }//GEN-LAST:event_deletarActionPerformed
           
    private void listaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_listaAncestorAdded
       listarLivros();
    }//GEN-LAST:event_listaAncestorAdded

    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(LivroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LivroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LivroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LivroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        DefaultListModel<String> model = new DefaultListModel<>();

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LivroView().setVisible(true);
                 
            }

            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizar;
    private javax.swing.JTextField autor;
    private javax.swing.JButton deletar;
    private javax.swing.JTextField id;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lista;
    private javax.swing.JButton listar;
    private javax.swing.JButton registrar;
    private javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables

    private void listarLivros() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



    
}

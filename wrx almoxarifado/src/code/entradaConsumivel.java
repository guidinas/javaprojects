/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package code;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelosBean.consumivel;
import modelosDAO.consumivelDAO;

/**
 *
 * @author guidi
 */
public class entradaConsumivel extends javax.swing.JInternalFrame {
    private ArrayList<consumivel> cons;
    private consumivel selecionado;
    /**
     * Creates new form entradaConsumivel
     */
    public entradaConsumivel() {
        initComponents();
        try{
             this.cons = consumivelDAO.listaConsumivel();
            
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex);
            JOptionPane.showMessageDialog(rootPane, "Erro de acesso ao Banco de Dados !!");
            this.dispose();
        }
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        digitado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        quantidade = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        jLabel1.setText("Nome Consumivel");

        digitado.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        digitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitadoActionPerformed(evt);
            }
        });
        digitado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                digitadoKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        jLabel2.setText("Consumível: ");

        nome.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        nome.setText("  ");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        jLabel4.setText("Quantidade a ser adicionada ");

        quantidade.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        quantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantidadeActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        jButton1.setText("Adicionar ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(digitado, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(digitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome))
                .addGap(37, 37, 37)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void digitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_digitadoActionPerformed

    private void quantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantidadeActionPerformed

    private void digitadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_digitadoKeyReleased
        // TODO add your handling code here:
        
          String value;
        value =  this.digitado.getText();
        for(consumivel a : this.cons){
            if(a.getNome().toLowerCase().contains(value)){
                this.nome.setText(a.getNome());
                this.selecionado = a;
                return;
            }
        }
        this.nome.setText("Não encontrado");
        this.selecionado = null;
    }//GEN-LAST:event_digitadoKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         int Quantidade;
        Quantidade = Integer.parseInt(this.quantidade.getText());
        if(this.selecionado == null){
            JOptionPane.showMessageDialog(rootPane, "Digite um Nome de Consumivel válido");
            this.digitado.setText("");
            this.quantidade.setText("");
            this.nome.setText(" ");
            this.selecionado = null;
        }else{
            this.selecionado.setQuantidade(Quantidade);
            if (0==JOptionPane.showConfirmDialog(rootPane, "confirma Adição  de " + this.selecionado.getQuantidade() + "\n Ao Consumivel  " + this.selecionado.getNome())){
               if(consumivelDAO.adicionaQuantidadeconsumivel(this.selecionado)){
                   JOptionPane.showMessageDialog(rootPane, "Adicionado com sucesso");
                   
               }else{
                   JOptionPane.showMessageDialog(rootPane, "Erro de Acesso ao Banco de Dados");
               }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Operação Cancelada pelo Usuario!!");
            }
            
                    
        }
         this.digitado.setText("");
         this.quantidade.setText("");
         this.nome.setText(" ");
         this.selecionado = null;
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField digitado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nome;
    private javax.swing.JTextField quantidade;
    // End of variables declaration//GEN-END:variables
}

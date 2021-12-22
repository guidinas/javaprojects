/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package code;

import javax.swing.JOptionPane;
import modelosBean.consumivel;
import modelosDAO.consumivelDAO;

/**
 *
 * @author guidi
 */
public class alteracaoConsumivel extends javax.swing.JInternalFrame {
    private consumivel selected;
    

    /**
     * Creates new form alteracaoConsumivel
     */
    public alteracaoConsumivel() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        quantidade = new javax.swing.JLabel();
        quantidadeD = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        marcaD = new javax.swing.JTextField();
        marca = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nomeD = new javax.swing.JTextField();
        nome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setResizable(true);

        jButton2.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        jButton2.setText("Apagar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        jButton1.setText("Alterar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        quantidade.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        quantidade.setText("jLabel8");

        quantidadeD.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        jLabel7.setText("Quantidade");

        marcaD.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        marcaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaDActionPerformed(evt);
            }
        });

        marca.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        marca.setText("jLabel6");

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        jLabel5.setText("Marca");

        nomeD.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N

        nome.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        nome.setText("jLabel2");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        jLabel2.setText("Todos os Campos devem ser preenchidos!");

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        jLabel1.setText("Nome");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(261, 261, 261)
                        .addComponent(jLabel2)
                        .addGap(0, 327, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(marca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(marcaD, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nomeD, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(quantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quantidadeD, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome)
                    .addComponent(nomeD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(marca)
                    .addComponent(marcaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantidade)
                    .addComponent(quantidadeD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(130, 130, 130))
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
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(rootPane, "Deseja Deletar esse Consumivel ? ")==0){
            if(consumivelDAO.deletaConsumivel(selected)){
                JOptionPane.showMessageDialog(rootPane, "Deletado com Sucesso!");
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(rootPane, "Falha de Banco de Dados!");
            }

        }else{
            JOptionPane.showMessageDialog(rootPane, "Operação cancelada pelo usuário");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(rootPane, "Deseja Salvar essas alterações ?")==0){
            this.selected.setQuantidade(Integer.parseInt(this.quantidadeD.getText()));
            this.selected.setNome(this.nomeD.getText());
            this.selected.setMarca(this.marcaD.getText());
            if(consumivelDAO.alteraConsumivel(selected)){
                JOptionPane.showMessageDialog(rootPane, "Alterado com Sucesso!");
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(rootPane, "Falha de Banco de Dados!");
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Operação cancelada pelo usuário");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void marcaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel marca;
    private javax.swing.JTextField marcaD;
    private javax.swing.JLabel nome;
    private javax.swing.JTextField nomeD;
    private javax.swing.JLabel quantidade;
    private javax.swing.JTextField quantidadeD;
    // End of variables declaration//GEN-END:variables

    void setCons(consumivel fe) {
        this.nome.setText(fe.getNome());
        this.marca.setText(fe.getMarca());
        this.quantidade.setText(Integer.toString(fe.getQuantidade()) );
        this.nomeD.setText(fe.getNome());
        this.marcaD.setText(fe.getMarca());
        this.quantidadeD.setText(Integer.toString(fe.getQuantidade()) );
        this.selected = fe;
    }
}

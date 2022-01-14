
/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package code;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelosBean.funcionario;
import modelosBean.saidaFerramentaCompleta;
import modelosDAO.funcionarioDAO;
import modelosDAO.saidaFerramentaCompletaDAO;

/**
 *
 * @author guidi
 */
public class acompanhaCaixaFerramenta extends javax.swing.JInternalFrame {
    private DefaultTableModel tabela;
    private ArrayList<saidaFerramentaCompleta> ferr;
    private funcionario selected;
    private ArrayList<funcionario> funcs;
    /**
     * Creates new form devolveFerramenta
     */
    public acompanhaCaixaFerramenta() {
        initComponents();
        funcs = funcionarioDAO.listaFuncionarioArray();
         for(funcionario e: funcs){
                this.selecionaFuncionario.addItem(e.getNome());
                
            }
    }
    
private  void atualizaFerramenta() {
       this.ferr = saidaFerramentaCompletaDAO.retornaSaidaFerramentaCompletaArray();
       if(this.ferr == null){
           JOptionPane.showMessageDialog(rootPane, "Erro de acesso ao Banco de Dados");
       }else{
           this.tabela = (DefaultTableModel) this.Jtabela.getModel();
            this.tabela.setRowCount(0);
            SimpleDateFormat form;
            form = new SimpleDateFormat("dd/MM/YYYY");
            int aux = 0;
            for(saidaFerramentaCompleta e : this.ferr){
                this.tabela.setRowCount(aux+1);
                tabela.setValueAt(e.getNomeFuncionario(), aux, 0);
                tabela.setValueAt(e.getNomeFerramenta(), aux, 1);
                tabela.setValueAt(form.format(e.getDataSaida()), aux, 2);
                aux++;
       } 
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
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtabela = new javax.swing.JTable();
        devolve = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        confirmaFunc = new javax.swing.JButton();
        selecionaFuncionario = new javax.swing.JComboBox();

        setClosable(true);
        setResizable(true);
        setTitle("Altera Caixa Ferramenta");

        Jtabela.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        Jtabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Funcionario", "Ferramenta", "Data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Jtabela);

        devolve.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        devolve.setText("Devolver Ferramenta");
        devolve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devolveActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        jLabel1.setText("Selecionar 1 por vez");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        jLabel2.setText("Funcionário");

        confirmaFunc.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        confirmaFunc.setText("Confirmar Funcionário");
        confirmaFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmaFuncActionPerformed(evt);
            }
        });

        selecionaFuncionario.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        selecionaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionaFuncionarioActionPerformed(evt);
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
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(devolve)))
                            .addComponent(jLabel2)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(selecionaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirmaFunc)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(confirmaFunc))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(selecionaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(devolve, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void devolveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devolveActionPerformed
        // TODO add your handling code here:
        int sel;
        sel = this.Jtabela.getSelectedRow();
        if(sel==-1){
            JOptionPane.showMessageDialog(rootPane, "Selecione pelo menos uma linha");
        }else{
           saidaFerramentaCompleta dev;
           dev = this.ferr.get(sel);
           if(saidaFerramentaCompletaDAO.devolveFerramentaCompleta(dev)){
               JOptionPane.showMessageDialog(rootPane, "Devolvido Com sucesso !");
               this.atualizaFerramenta();
           }
           
        }
        
    }//GEN-LAST:event_devolveActionPerformed

    private void confirmaFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmaFuncActionPerformed
        // TODO add your handling code here:
        this.selecionaFuncionario.setEnabled(false);
        this.confirmaFunc.setEnabled(false);
        int ind;
        ind =  this.selecionaFuncionario.getSelectedIndex();
        this.selected = this.funcs.get(ind);
        this.selecionaFuncionario(selected);
    }//GEN-LAST:event_confirmaFuncActionPerformed

    private void selecionaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionaFuncionarioActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_selecionaFuncionarioActionPerformed
    
    private void selecionaFuncionario(funcionario f){
        this.ferr = saidaFerramentaCompletaDAO.retornaCaixaFerramentaFuncionario(f);
       if(this.ferr == null){
           JOptionPane.showMessageDialog(rootPane, "Erro de acesso ao Banco de Dados");
       }else{
           this.tabela = (DefaultTableModel) this.Jtabela.getModel();
            this.tabela.setRowCount(0);
            SimpleDateFormat form;
            form = new SimpleDateFormat("dd/MM/YYYY");
            int aux = 0;
            for(saidaFerramentaCompleta e : this.ferr){
                this.tabela.setRowCount(aux+1);
                tabela.setValueAt(e.getNomeFuncionario(), aux, 0);
                tabela.setValueAt(e.getNomeFerramenta(), aux, 1);
                tabela.setValueAt(form.format(e.getDataSaida()), aux, 2);
                aux++;
       } 
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Jtabela;
    private javax.swing.JButton confirmaFunc;
    private javax.swing.JButton devolve;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox selecionaFuncionario;
    // End of variables declaration//GEN-END:variables
}

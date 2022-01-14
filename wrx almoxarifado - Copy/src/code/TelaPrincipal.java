/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package code;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.Dimension;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelosBean.EPIMarca;
import modelosBean.consumivel;
import modelosBean.ferramenta;

/**
 *
 * @author guidi
 */

public class TelaPrincipal extends javax.swing.JFrame {
    private static int func;
    /**
     * Creates new form TelaPrincipal
     * @throws java.lang.InterruptedException
     */
    public TelaPrincipal() throws InterruptedException {
        
        
        initComponents();
        

    }
    
    
    public  void setFunc(int func){
        TelaPrincipal.func = func;
        
        try{
            if(func == 0 ){
                
            acompanhamentoRequisicoes acomp;
        acomp = new acompanhamentoRequisicoes(desktopPrincipal);
        this.desktopPrincipal.add(acomp);
        acomp.setVisible(true);
        Dimension desktopSize = this.desktopPrincipal.getSize();
        Dimension jInternalFrameSize = acomp.getSize();
        acomp.setLocation(desktopSize.width - jInternalFrameSize.width ,desktopSize.height - jInternalFrameSize.height);
                
        }
        }catch(ClassNotFoundException |SQLException e){
                System.out.println(e);
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

        desktopPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        SaidaEPI = new javax.swing.JMenu();
        saidaEPI = new javax.swing.JMenuItem();
        saidaConsumiveis = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        entradaEPI = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        entradaConsumiveis = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        addFunc = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N

        javax.swing.GroupLayout desktopPrincipalLayout = new javax.swing.GroupLayout(desktopPrincipal);
        desktopPrincipal.setLayout(desktopPrincipalLayout);
        desktopPrincipalLayout.setHorizontalGroup(
            desktopPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1172, Short.MAX_VALUE)
        );
        desktopPrincipalLayout.setVerticalGroup(
            desktopPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N

        SaidaEPI.setText("Saídas ");
        SaidaEPI.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N

        saidaEPI.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        saidaEPI.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        saidaEPI.setText("Saída EPI ");
        saidaEPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saidaEPIActionPerformed(evt);
            }
        });
        SaidaEPI.add(saidaEPI);

        saidaConsumiveis.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        saidaConsumiveis.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        saidaConsumiveis.setText("Saída de Consumíveis ");
        saidaConsumiveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saidaConsumiveisActionPerformed(evt);
            }
        });
        SaidaEPI.add(saidaConsumiveis);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem9.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        jMenuItem9.setText("Saída Ferramenta");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        SaidaEPI.add(jMenuItem9);

        jMenuItem17.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        jMenuItem17.setText("Caixa de Ferramentas");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        SaidaEPI.add(jMenuItem17);

        jMenuBar1.add(SaidaEPI);

        entradaEPI.setText("Entradas ");
        entradaEPI.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jMenuItem1.setText("Entrada EPI");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        entradaEPI.add(jMenuItem1);

        entradaConsumiveis.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        entradaConsumiveis.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        entradaConsumiveis.setText("Entrada Consumíveis ");
        entradaConsumiveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaConsumiveisActionPerformed(evt);
            }
        });
        entradaEPI.add(entradaConsumiveis);

        jMenuItem10.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        jMenuItem10.setText("Entrada Ferramenta");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        entradaEPI.add(jMenuItem10);

        jMenuItem18.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        jMenuItem18.setText("Atualiza Caixa de Ferramenta");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        entradaEPI.add(jMenuItem18);

        jMenuBar1.add(entradaEPI);

        jMenu5.setText("Criar");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jMenuItem5.setText("Criar EPI");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        jMenuItem6.setText("Criar Consumivel");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuItem4.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        jMenuItem4.setText("Cria Ferramenta");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenuBar1.add(jMenu5);

        jMenu4.setText("Devolução");
        jMenu4.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N

        jMenuItem13.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        jMenuItem13.setText("Devolver Ferramenta");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem13);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Alterar");
        jMenu3.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N

        jMenuItem11.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        jMenuItem11.setText("Alterar Ferramenta");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenuItem14.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        jMenuItem14.setText("Alterar EPI");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem14);

        jMenuItem15.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        jMenuItem15.setText("Alterar Consumível");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem15);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Estoque");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N

        jMenuItem8.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        jMenuItem8.setText("Checagem de Estoque");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem12.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        jMenuItem12.setText("Checa EPI ");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem12);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Gerencial");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jMenuItem2.setText("Adicionar Usuário");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jMenuItem7.setText("Adicionar Função");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        addFunc.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        addFunc.setText("Adicionar Funcionário ");
        addFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFuncActionPerformed(evt);
            }
        });
        jMenu1.add(addFunc);

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jMenuItem3.setText("Adicionar Resp Almoxarifado");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem16.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        jMenuItem16.setText("Checar Funcionarios");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem16);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saidaEPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saidaEPIActionPerformed
        // TODO add your handling code here:
        if(func<=1){
             saidaEPI telasaida;
        try {
            telasaida = new saidaEPI();
            desktopPrincipal.add(telasaida);
            telasaida.setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_saidaEPIActionPerformed

    private void entradaConsumiveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaConsumiveisActionPerformed
        // TODO add your handling code here:
        if(func<= 1){
            entradaConsumivel ent;
        ent = new entradaConsumivel();
        this.desktopPrincipal.add(ent);
        ent.setVisible(true);
        }
        
    }//GEN-LAST:event_entradaConsumiveisActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        if(func == 0){
            cadastroUsuario telacad = new cadastroUsuario();
        desktopPrincipal.add(telacad);
        telacad.setVisible(true);
        }
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        if(func<=1){
            cadastroEPI telaEPI = new cadastroEPI();
        desktopPrincipal.add(telaEPI);
        telaEPI.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        if(func==0 || func==2){
            cadastroFuncaoFuncionario cads;
        cads = new cadastroFuncaoFuncionario();
        this.desktopPrincipal.add(cads);
        cads.setVisible(true);
        }
            
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void addFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFuncActionPerformed
        // TODO add your handling code here:
        if(func==0 || func==2){
              cadastroFuncionario cadst;
        try {
            cadst = new cadastroFuncionario();
            this.desktopPrincipal.add(cadst);
            cadst.setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
      
       
      
    }//GEN-LAST:event_addFuncActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        if(func==0){
             cadastroResponsavel cadRes;
        
        cadRes =  new cadastroResponsavel();
        this.desktopPrincipal.add(cadRes);
        cadRes.setVisible(true);
        }
       
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void saidaConsumiveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saidaConsumiveisActionPerformed
        // TODO add your handling code here:
        if(func<=1){
              telaSaidaConsumivel tel;
        try {
            tel = new telaSaidaConsumivel();
            this.desktopPrincipal.add(tel);
            tel.setVisible(true);
        }catch(Exception e){
            System.out.println(e);
        }
        }
      
        
            
            
        
    }//GEN-LAST:event_saidaConsumiveisActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        if(func<=1){
               checaEstoque alt;
        alt = new checaEstoque();
        this.desktopPrincipal.add(alt);
        alt.setVisible(true);
        }
     
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        if(func <= 1){
             entradaEPI entry;
        try {
            entry = new entradaEPI();
            this.desktopPrincipal.add(entry);
            entry.setVisible(true);
        }catch(ClassNotFoundException|SQLException e){
            System.out.println(e);
        }
        }
       
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        if(func<=1){
             cadastroConsumivel cads;
        cads = new cadastroConsumivel();
        this.desktopPrincipal.add(cads);
        cads.setVisible(true);
        }
       
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        if(func<=1){
             criaFerramenta fer;
        fer = new criaFerramenta();
        this.desktopPrincipal.add(fer);
        fer.setVisible(true);
        }
       
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        if(func<=1){
            saidaFerramenta ferr;
            ferr = new saidaFerramenta();
            this.desktopPrincipal.add(ferr);
            ferr.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        entradaFerramenta neo;
        neo = new entradaFerramenta();
        this.desktopPrincipal.add(neo);
        neo.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        alteraFerramenta alt;
        alt = new alteraFerramenta();
        this.desktopPrincipal.add(alt);
        alt.setVisible(true);
        alt.setTel(this);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        checaEstoqueEPI est;
        est = new checaEstoqueEPI();
        this.desktopPrincipal.add(est);
        est.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        devolveFerramenta dev;
        dev = new devolveFerramenta();
        this.desktopPrincipal.add(dev);
        dev.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        alteraEPI es;
        es = new alteraEPI();
        this.desktopPrincipal.add(es);
        es.setVisible(true);
        es.setTel(this);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
        alteraConsumivel alt;
        alt = new alteraConsumivel();
        this.desktopPrincipal.add(alt);
        alt.setVisible(true);
        alt.setTel(this);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:
          if(func==0 || func==2){
            desabilitaFuncionario des;
            des  = new  desabilitaFuncionario();
            this.desktopPrincipal.add(des);
            des.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        // TODO add your handling code here:
         if(func < 2){
        caixaFerramenta cai;
        cai = new caixaFerramenta();
        this.desktopPrincipal.add(cai);
        cai.setVisible(true);
         }
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:
        acompanhaCaixaFerramenta acom;
        acom = new acompanhaCaixaFerramenta();
        this.desktopPrincipal.add(acom);
        acom.setVisible(true);
    }//GEN-LAST:event_jMenuItem18ActionPerformed
      
        public void alterFerr(ferramenta m){
        alteracaoFerramenta lop;
        lop = new alteracaoFerramenta();
        this.desktopPrincipal.add(lop);
        lop.setVisible(true);
        lop.addFerr(m);
    }
        public void alterEPI(EPIMarca m ){
            alteracaoEPI altt;
            altt = new alteracaoEPI();
            this.desktopPrincipal.add(altt);
            altt.setVisible(true);
            altt.addEPI(m);
        }
        public void alterCons(consumivel m){
            alteracaoConsumivel alt;
            alt = new alteracaoConsumivel();
            this.desktopPrincipal.add(alt);
            alt.setVisible(true);
            alt.setCons(m);
            
        }
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new TelaPrincipal().setVisible(true);
            } catch (InterruptedException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu SaidaEPI;
    private javax.swing.JMenuItem addFunc;
    private javax.swing.JDesktopPane desktopPrincipal;
    private javax.swing.JMenuItem entradaConsumiveis;
    private javax.swing.JMenu entradaEPI;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem saidaConsumiveis;
    private javax.swing.JMenuItem saidaEPI;
    // End of variables declaration//GEN-END:variables

   
}
/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package code;


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelosBean.ferramenta;
import modelosBean.funcionario;
import modelosBean.saidaFerramentas;
import modelosDAO.ferramentaDAO;
import modelosDAO.funcionarioDAO;
import modelosDAO.responsavelDAO;
import modelosDAO.saidaFerramentaDAO;

/**
 *
 * @author guidi
 */
public class caixaFerramenta extends javax.swing.JInternalFrame {
    private ArrayList<funcionario> funcs;
    private ArrayList<ferramenta> ferraments;
    private ferramenta selected;
    private ArrayList<saidaFerramentas> itens;
    
    /**
     * Creates new form saidaFerramenta
     */
    public caixaFerramenta() {
        initComponents();
            funcs = funcionarioDAO.listaFuncionarioArray();
            this.ferraments = ferramentaDAO.retornaFerramentaArray();
            this.itens = new ArrayList<>();
            if(funcs != null){
                 for(funcionario e: funcs){
                this.selecionaFuncionario.addItem(e.getNome());
                
            }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Erro ao conectar com banco de Dados!!!\n  Func001");
                this.dispose();
        }
           
        
        this.digitadoNome.setEnabled(false);
        this.digitadoRegistro.setEnabled(false);
        this.addItem.setEnabled(false);
        this.confirmaSaida.setEnabled(false);
        this.selecionaFuncionario.setEnabled(true);
        
        
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        confirmaFunc = new javax.swing.JButton();
        selecionaFuncionario = new javax.swing.JComboBox();
        addItem = new javax.swing.JButton();
        confirmaSaida = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        digitadoRegistro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        digitadoNome = new javax.swing.JTextField();
        nome = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setResizable(true);
        setTitle("Caixa Ferramenta");

        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel2.setText("Por nome");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel3.setText("Funcion??rio");

        confirmaFunc.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        confirmaFunc.setText("Confirmar");
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

        addItem.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        addItem.setText("Adicionar");
        addItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemActionPerformed(evt);
            }
        });

        confirmaSaida.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        confirmaSaida.setText("Confirma Sa??da");
        confirmaSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmaSaidaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel5.setText("Por registro");

        digitadoRegistro.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        digitadoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitadoRegistroActionPerformed(evt);
            }
        });
        digitadoRegistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                digitadoRegistroKeyReleased(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Ferramenta", "Registro"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        digitadoNome.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        digitadoNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                digitadoNomeKeyReleased(evt);
            }
        });

        nome.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        nome.setText("    ");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 22)); // NOI18N
        jLabel4.setText("Nome Ferramenta: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(selecionaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirmaFunc)
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(digitadoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(digitadoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(confirmaSaida)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(addItem)))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(confirmaFunc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)))
                    .addComponent(selecionaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(digitadoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(digitadoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addItem)
                    .addComponent(nome)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(confirmaSaida)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selecionaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionaFuncionarioActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_selecionaFuncionarioActionPerformed

    private void confirmaSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmaSaidaActionPerformed
        // TODO add your handling code here:
            String senha;
            senha =  JOptionPane.showInputDialog("Digite a Senha do Respons??vel.");
        int resSenha;
        resSenha = responsavelDAO.checaSenhaInt(senha);
        if(0 < resSenha){
            int codFunc;
            if(criaPDF(itens)){
                 if(saidaFerramentaDAO.criaSaidaFerramentaCaixa(this.itens)){
               
                    JOptionPane.showMessageDialog(null, "Solicita????o efetuada com sucesso!");
                
                
            }else{
                JOptionPane.showMessageDialog(null, "Opera????o cancelada pelo usu??rio");
            }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Erro na cria????o do Arquivo de responsabilidade");
                return;
            }
           
        }
            DefaultTableModel defaultModel =  (DefaultTableModel) this.jTable1.getModel();
            defaultModel.setRowCount(0);
            this.itens.clear();
            this.digitadoNome.setText("");
            this.digitadoRegistro.setText("");
             this.digitadoNome.setEnabled(false);
             this.digitadoRegistro.setEnabled(false);
             this.addItem.setEnabled(false);
             this.confirmaSaida.setEnabled(false);
             this.selecionaFuncionario.setEnabled(true);
        
    }//GEN-LAST:event_confirmaSaidaActionPerformed

    private void confirmaFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmaFuncActionPerformed
        // TODO add your handling code here:
         this.digitadoNome.setEnabled(true);
        this.digitadoRegistro.setEnabled(true);
        this.addItem.setEnabled(true);
        this.selecionaFuncionario.setEnabled(false);
        this.confirmaFunc.setEnabled(true);
    }//GEN-LAST:event_confirmaFuncActionPerformed

    private void digitadoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitadoRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_digitadoRegistroActionPerformed

    private void digitadoNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_digitadoNomeKeyReleased
        // TODO add your handling code here:
        String value;
        value =  this.digitadoNome.getText().toLowerCase();
        for(ferramenta a: this.ferraments){
            if(a.getNome().toLowerCase().contains(value)){
                if(a.getStat()!=1){
                this.nome.setText(a.getNome());
                this.selected= a;
                return;
                }else{
                    this.nome.setText("Item emprestado");
                    this.selected = null;
                }
            }
        }
        this.nome.setText("N??o encontrado");
        this.selected = null;
    }//GEN-LAST:event_digitadoNomeKeyReleased

    private void digitadoRegistroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_digitadoRegistroKeyReleased
        // TODO add your handling code here:
         String value;
        value =  this.digitadoRegistro.getText().toLowerCase();
        for(ferramenta a: this.ferraments){
            if(a.getRegistro().toLowerCase().contains(value)){
              if(a.getStat()!=1){
                this.nome.setText(a.getNome());
                this.selected= a;
                return;
                }else{
                    this.nome.setText("Item emprestado");
                    this.selected = null;
                }
            }
        }
        this.nome.setText("N??o encontrado");
        this.selected = null;
    }//GEN-LAST:event_digitadoRegistroKeyReleased

    private void addItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemActionPerformed
        // TODO add your handling code here:
         if(this.selected != null){
        // TODO add your handling code here:
       int index;
       index = this.itens.size();
      // gera um itemRequisicaoCompleta e coloca no array list
      int itemIndex, itemCod,quantidadeInt;
      itemCod = this.selected.getCod();
      this.itens.add(new saidaFerramentas(itemCod, this.funcs.get(this.selecionaFuncionario.getSelectedIndex()).getCod(),this.selected.getNome()));
        System.out.println(this.itens.size());
      // adiciona esse item a tabela 
      DefaultTableModel defaultModel =  (DefaultTableModel) this.jTable1.getModel();
      //  ITEM QUANTIDADE
   
       Object item ,quant;
      item = this.selected.getNome();
      quant = this.selected.getRegistro();
      
      defaultModel.setRowCount(index + 1);
        this.jTable1.getModel().setValueAt(item, index, 0);
        this.jTable1.getModel().setValueAt(quant, index, 1);
        this.confirmaSaida.setEnabled(true);
      }else{
           JOptionPane.showMessageDialog(rootPane, "Digite um nome ou registro v??lido  v??lido");
       }
    }//GEN-LAST:event_addItemActionPerformed

    private static  boolean criaPDF(ArrayList<saidaFerramentas> m){
        Document acee = new Document();
        String arq;
        arq = "CaixaFerr.pdf";
        try{
            Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 22,
            Font.BOLD);
             Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.NORMAL);
             Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
            Font.BOLD);
             Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.BOLD);
            PdfWriter.getInstance(acee,new FileOutputStream(arq));
            acee.open();
            Paragraph p;
            p = new Paragraph("WRX - Termo de Aceita????o de Caixa de Ferramenta");
           float siz[] = new float[2];
            siz[0] = (float) 0.3;
            siz[1] = (float) 0.7;
           PdfPTable teb = new PdfPTable(siz);
           Paragraph zoo = new Paragraph("Termo de Aceita????o de Caixa de Ferramenta");
           zoo.setFont(catFont);
           Paragraph ca  = new Paragraph("WRX");
           ca.setFont(catFont);
           teb.addCell(new PdfPCell(ca));
           teb.addCell(new PdfPCell(zoo));
           teb.setWidthPercentage(100);
            acee.add(teb);
            Paragraph space = new Paragraph("  ");
            acee.add(space);
            
            float tab[] = {(float) 0.05,(float)0.355,(float)0.07,(float)0.05, (float)0.05, (float)0.355, (float)0.07};
            
            PdfPTable s = new PdfPTable(tab);
            PdfPCell cel1 = new PdfPCell(new Paragraph("Qnt"));
            PdfPCell cel2 = new PdfPCell(new Paragraph("Material"));
            PdfPCell cel3 = new PdfPCell(new Paragraph("Stat."));
            PdfPCell cel4 = new PdfPCell(new Paragraph(" "));
            cel4.setGrayFill((float) 0.6);
            PdfPCell cel5 = new PdfPCell(new Paragraph("Qnt"));
            PdfPCell cel6 = new PdfPCell(new Paragraph("Material"));
            PdfPCell cel7 = new PdfPCell(new Paragraph("Stat."));
            s.addCell(cel1);
            s.addCell(cel2);
            s.addCell(cel3);
            s.addCell(cel4);
            s.addCell(cel5);
            s.addCell(cel6);
            s.addCell(cel7);
            int i  = 1;
            for(saidaFerramentas a : m){
                if(i%2==1){
                    cel1 = new PdfPCell(new Paragraph("1"));
                    cel2 = new PdfPCell(new Paragraph(a.getNomeFerr()));
                    cel3 = new PdfPCell(new Paragraph("      "));
                    cel4 = new PdfPCell(new Paragraph("      "));
                    s.addCell(cel1);
                    s.addCell(cel2);
                    s.addCell(cel3);
                    s.addCell(cel4);
                    cel4.setGrayFill((float) 0.6);
                }else{
                    cel5 = new PdfPCell(new Paragraph("1"));
                    cel6 = new PdfPCell(new Paragraph(a.getNomeFerr()));
                    cel7 = new PdfPCell(new Paragraph("      "));
                    s.addCell(cel5);
                    s.addCell(cel6);
                    s.addCell(cel7);
                }
                i++;
            }
                    cel1 = new PdfPCell(new Paragraph(" "));
                    cel2 = new PdfPCell(new Paragraph(" "));
                    cel3 = new PdfPCell(new Paragraph(" "));
                    cel4 = new PdfPCell(new Paragraph(" "));
                    s.addCell(cel1);
                    s.addCell(cel2);
                    s.addCell(cel3);
                    s.addCell(cel4);
                    s.setWidthPercentage(100);
            acee.add(s);
            acee.add(space);
            Paragraph ter = new Paragraph("TERMO DE RESPONSABILIDADE: ");
            ter.setFont(catFont);
            acee.add(ter);
            acee.add(space);
            Paragraph mo = new Paragraph("Declaro ter recebido o ferramental acima discriminado e assumo inteira responsabilidade pela preserva????o do mesmo. Desde j?? autorizo o desconto ao valor de mercado, em caso de extravio ou dano por culpa ou dolo (ART - 426,& 1??CLT).");
            mo.setFont(subFont);
            mo.setAlignment(3);
            acee.add(mo);
            acee.add(space);
            PdfPTable sel = new PdfPTable(2);
             cel1 = new PdfPCell(new Paragraph("Nome: " + funcionarioDAO.nomeFuncionarioCod(m.get(0).getCodFuncionario())));
             cel2 = new PdfPCell(new Paragraph("Fun????o: "));
             sel.addCell(cel1);
             sel.addCell(cel2);
             cel1 = new PdfPCell(new Paragraph("DATA DO RECEBIMENTO: "));
             cel2 = new PdfPCell(new Paragraph("ASS:  "));
             sel.addCell(cel1);
             sel.addCell(cel2);
             cel1 = new PdfPCell(new Paragraph("DATA DA DEVOLU????O: "));
             cel2 = new PdfPCell(new Paragraph("ASS:  "));
             sel.addCell(cel1);
             sel.addCell(cel2);
             sel.setWidthPercentage((float) 100);
             acee.add(sel);
            acee.close();
            File file = new File("CaixaFerr.pdf");
            Desktop.getDesktop().print(file);
            return true;
        }catch(DocumentException | IOException | SQLException| ClassNotFoundException e){
            System.out.println(e);
            return false;
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItem;
    private javax.swing.JButton confirmaFunc;
    private javax.swing.JButton confirmaSaida;
    private javax.swing.JTextField digitadoNome;
    private javax.swing.JTextField digitadoRegistro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel nome;
    private javax.swing.JComboBox selecionaFuncionario;
    // End of variables declaration//GEN-END:variables
}

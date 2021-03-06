/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package code;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JDesktopPane;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import modelosBean.requisicao;
import static modelosDAO.funcionarioDAO.nomeFuncionarioporCodigo;
import static modelosDAO.requisicaoDAO.listaRequisicaoPendente;

/**
 *
 * @author guidi
 */
public class acompanhamentoRequisicoes extends javax.swing.JInternalFrame {
        private   DefaultTableModel tabela;
         private ArrayList<requisicao> a;
         private  JDesktopPane tela;
       
    /**
     * Creates new form acompanhamentoRequisicoes
     * @param tela
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public acompanhamentoRequisicoes(JDesktopPane tela) throws SQLException, ClassNotFoundException {
        initComponents();
        this.tela = tela;
          a = new ArrayList<>();
        atualizaTable();
         SwingWorker<Void, Void> worker;
            worker = new SwingWorker<Void, Void>() {
                @Override
                protected Void doInBackground() throws Exception {
                    try{
                        while(true) {
                        Thread.sleep(90000);
                             atualizaTable();
                    }
                    }catch(Exception e){
                        System.out.println(e);
                         while(true) {
                        Thread.sleep(1);
                             atualizaTable();
                    }
          }
                    
                }
            };

          try
          {
              worker.execute();
          }catch(Exception e){
              System.out.println(e);
              System.out.println(" lualana ");
              worker.execute();
          }
        
    }
    
    //Usando m??todo depreciado.
    
    public final void atualizaTable() throws SQLException, ClassNotFoundException{
        int s = a.size();
       a.clear();
       ResultSet requisicoes;
           requisicoes =  listaRequisicaoPendente();
           this.tabela = (DefaultTableModel) this.jTable1.getModel();
        int aux;
        aux = 0;    
        while(requisicoes.next()){
        tabela.setRowCount(aux+1);  
        this.jTable1.getModel().setValueAt(nomeFuncionarioporCodigo(requisicoes.getInt("codFuncionario")), aux, 0);
        this.jTable1.getModel().setValueAt( requisicoes.getTime("dataRequisicao"), aux, 1);     
        aux++;
        DefaultTableCellRenderer coluna = new DefaultTableCellRenderer(); 
        coluna.setBackground(Color.RED); 
        this.a.add(new requisicao(requisicoes.getInt("codFuncionario"), requisicoes.getInt("cod"), requisicoes.getInt("stat"),  requisicoes.getInt("codResponsavel"), requisicoes.getTimestamp("dataRequisicao")));
        }
        requisicoes.close();
        if(a.size() > s){
            this.requestFocus();
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
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setResizable(true);
        setTitle("Requisi????es de Sa??da EPI");
        setAlignmentX(0.0F);
        setAlignmentY(1.0F);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName(""); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Funcionario", "Data", "Analizar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables


}



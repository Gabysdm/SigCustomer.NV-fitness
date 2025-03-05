
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author aggr5
 */
public class Inicio extends javax.swing.JFrame {
    boolean funcionario = false;
    int idCliente = 0;
    ArrayList<Avaliacao> avaliacoes = new ArrayList<>();
    /**
     * Creates new form Incio
     */
    public Inicio() {
        initComponents();
        miListagem.setVisible(false);
        setExtendedState(MAXIMIZED_BOTH);
        
        try {
            avaliacoes = (ArrayList<Avaliacao>)Gravador.ler("avaliacoes.data");
        } catch (IOException ex) {
            Logger.getLogger(ListagemF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ListagemF.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            atualizarTabela();
        } catch (IOException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
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

        jMenu3 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listDia = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listHora = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbAval = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        tfAltura = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfIdade = new javax.swing.JTextField();
        tfPeso = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tfIMC = new javax.swing.JTextPane();
        btMarcar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mbControl = new javax.swing.JMenu();
        miCadastro = new javax.swing.JMenuItem();
        miLogout = new javax.swing.JMenuItem();
        miListagem = new javax.swing.JMenuItem();
        mbSair = new javax.swing.JMenu();
        miSair = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 0, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logotipo sobre academia moderno em laranja(1)(1).jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        listDia.setBackground(new java.awt.Color(204, 153, 255));
        listDia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        listDia.setForeground(new java.awt.Color(255, 255, 255));
        listDia.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listDia.setSelectionBackground(new java.awt.Color(102, 0, 204));
        jScrollPane1.setViewportView(listDia);

        listHora.setBackground(new java.awt.Color(204, 153, 255));
        listHora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        listHora.setForeground(new java.awt.Color(255, 255, 255));
        listHora.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "6:00", "10:00", "15:00", "17:00", "19:00" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listHora.setSelectionBackground(new java.awt.Color(102, 0, 204));
        jScrollPane2.setViewportView(listHora);

        tbAval.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Data", "Dia", "Horario"
            }
        ));
        tbAval.setSelectionBackground(new java.awt.Color(204, 153, 255));
        jScrollPane3.setViewportView(tbAval);

        jLabel2.setBackground(new java.awt.Color(255, 0, 153));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 102, 255));
        jLabel2.setText("Altura");

        tfAltura.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAlturaActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 0, 153));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 102, 255));
        jLabel3.setText("Idade");

        jLabel4.setBackground(new java.awt.Color(255, 0, 153));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 102, 255));
        jLabel4.setText("Peso");

        jLabel5.setBackground(new java.awt.Color(153, 102, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 102, 255));
        jLabel5.setText("Calculadora de IMC");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 102, 255));
        jLabel6.setText("Marque sua avaliação física abaixo");

        tfIdade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdadeActionPerformed(evt);
            }
        });

        tfPeso.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 102, 255));
        jLabel7.setText("IMC");

        tfIMC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jScrollPane4.setViewportView(tfIMC);

        btMarcar.setBackground(new java.awt.Color(204, 153, 255));
        btMarcar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btMarcar.setForeground(new java.awt.Color(255, 255, 255));
        btMarcar.setText("Marcar avaliação");
        btMarcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMarcarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(222, 222, 222)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(39, 39, 39)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel5))
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(tfAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(btMarcar, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel6)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addComponent(btMarcar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(444, 444, 444))
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 51, 255));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(153, 51, 255));

        mbControl.setText("Controles");

        miCadastro.setText("Cadastrar");
        miCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastroActionPerformed(evt);
            }
        });
        mbControl.add(miCadastro);

        miLogout.setText("Logout");
        miLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLogoutActionPerformed(evt);
            }
        });
        mbControl.add(miLogout);

        miListagem.setText("Listagem");
        miListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListagemActionPerformed(evt);
            }
        });
        mbControl.add(miListagem);

        jMenuBar1.add(mbControl);

        mbSair.setText("Sair");

        miSair.setText("Sair do sistema");
        mbSair.add(miSair);

        jMenuBar1.add(mbSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastroActionPerformed
        TelaCadastro telacadastro = new TelaCadastro();
        telacadastro.setVisible(true);
        dispose();
    }//GEN-LAST:event_miCadastroActionPerformed

    private void miLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLogoutActionPerformed
        this.dispose();
        Login login = new Login();
        login.setVisible(true);
        
    }//GEN-LAST:event_miLogoutActionPerformed

    private void miListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListagemActionPerformed
        dispose();
        Listagem listagem = new Listagem();
        listagem.setVisible(true);
    }//GEN-LAST:event_miListagemActionPerformed

    private void tfIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdadeActionPerformed

    private void tfAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAlturaActionPerformed

    private void tfPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPesoActionPerformed

    private void btMarcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMarcarActionPerformed
        if(listDia.isSelectionEmpty() || listHora.isSelectionEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos!");
            }else{ 
              Avaliacao aval = pegarAval();
              avaliacoes.add(aval);// Adciona na ArrayList
                  try {
                      Gravador.gravar("avaliacoes.data", avaliacoes);
                  } catch (IOException ex) {
                      Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                  }
                  JOptionPane.showMessageDialog(rootPane, "Usuário cadastrado");
                  //limparTela();
                  try {
            atualizarTabela();
        } catch (IOException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btMarcarActionPerformed
    }
    
    private Avaliacao pegarAval() {
        int diaSemana = listDia.getSelectedIndex() + 2;
        int horaI = listDia.getSelectedIndex();
        int horaCerta = 0;
        
        switch (horaI) {
            case 0:
                horaCerta = 6;
                break;
            case 1:
                horaCerta = 10;
                break;
            case 2:
                horaCerta = 15;
                break;
            case 3:
                horaCerta = 17;
                break;
            case 4:
                horaCerta = 19;
                break;
            default:
                break;
        }
        
            
        
        return new Avaliacao(diaSemana, horaCerta, idCliente);
    }
    
    public void acesso(){
        miListagem.setVisible(true);
    }
    public void atualizarTabela() throws IOException{
        //salva o arrayList de usuarios no arquivo
        Gravador.gravar("avaliacoes.data", avaliacoes);
        DefaultTableModel modelo = (DefaultTableModel) tbAval.getModel();
        modelo.setNumRows(0);// deixa a tabela sem conteúdo
        Object linha[] = new Object[3];// cria um modelo de linha da tabela com 3 linhas
        
        for(int i = 0; i < avaliacoes.size(); i++){ //Percorre a lista de usuarios
            linha[0] = avaliacoes.get(i).getDataMarcado();//Pega o nome do usuario da lista
            linha[1] = avaliacoes.get(i).getDiaSemana();
            linha[2] = avaliacoes.get(i).getHora();
            modelo.addRow(linha);//Adciona a linha na tabela
        }
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btMarcar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> listDia;
    private javax.swing.JList<String> listHora;
    private javax.swing.JMenu mbControl;
    private javax.swing.JMenu mbSair;
    private javax.swing.JMenuItem miCadastro;
    private javax.swing.JMenuItem miListagem;
    private javax.swing.JMenuItem miLogout;
    private javax.swing.JMenuItem miSair;
    private javax.swing.JTable tbAval;
    private javax.swing.JTextField tfAltura;
    private javax.swing.JTextPane tfIMC;
    private javax.swing.JTextField tfIdade;
    private javax.swing.JTextField tfPeso;
    // End of variables declaration//GEN-END:variables
}

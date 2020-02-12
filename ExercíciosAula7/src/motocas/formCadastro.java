
package motocas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class formCadastro extends javax.swing.JFrame {
   
    ArrayList<Motoca> motocas = new ArrayList();
    
    public formCadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jlCoddigo = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        jlPersonagem = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfPrecoBase = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfCor = new javax.swing.JTextField();
        btnRelatorio = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        cbxPersonagem = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        rbSimples = new javax.swing.JRadioButton();
        rbEletrica = new javax.swing.JRadioButton();
        rbComCobertura = new javax.swing.JRadioButton();
        cbxVoltagem = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Motoca");

        jlCoddigo.setText("Código:");

        jlPersonagem.setText("Personagem:");

        jLabel2.setText("Preço Base:");

        jLabel3.setText("Voltagem:");

        jLabel4.setText("Cor da Cobertura:");

        tfCor.setEnabled(false);

        btnRelatorio.setText("Relatorio");
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        cbxPersonagem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mônica", "Cebolinha", "Magali", "Cascão" }));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Motoca:"));

        buttonGroup1.add(rbSimples);
        rbSimples.setSelected(true);
        rbSimples.setText("Simples");
        rbSimples.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSimplesActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbEletrica);
        rbEletrica.setText("Elétrica");
        rbEletrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEletricaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbComCobertura);
        rbComCobertura.setText("Com Cobertura");
        rbComCobertura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbComCoberturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(rbEletrica)
                        .addComponent(rbSimples))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(rbComCobertura)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbSimples)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbEletrica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbComCobertura))
        );

        cbxVoltagem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "110", "220" }));
        cbxVoltagem.setEnabled(false);
        cbxVoltagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxVoltagemActionPerformed(evt);
            }
        });

        jButton1.setText("Alterar Preço");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlCoddigo)
                                    .addComponent(jlPersonagem)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfCodigo)
                                    .addComponent(cbxPersonagem, 0, 91, Short.MAX_VALUE)
                                    .addComponent(cbxVoltagem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfCor, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfPrecoBase, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btnCadastrar)
                        .addGap(35, 35, 35)
                        .addComponent(btnRelatorio)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlCoddigo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbxVoltagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrar)
                    .addComponent(btnRelatorio))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfPrecoBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        int codigo = Integer.parseInt(tfCodigo.getText());
        String personagem = cbxPersonagem.getSelectedItem().toString();

        if (rbSimples.isSelected()){
            motocas.add(new Motoca(codigo, personagem));           

//                *** outra forma de fazer
//               Motoca m = new Motoca();
//               m.setCodigo(codigo);
//               m.setPersonagem(personagem);
//               motocas.add(m);

        }
        else if (rbEletrica.isSelected()){
            int volt = Integer.parseInt(cbxVoltagem.getSelectedItem().toString());
            motocas.add(new MotocaEletrica(codigo, personagem, volt));
        }
        else{
            String cor = tfCor.getText();
            motocas.add(new MotocaComCobertura(codigo, personagem, cor));
        }
            limpar();
            System.out.println(motocas);      
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void rbSimplesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSimplesActionPerformed
           cbxVoltagem.setEnabled(false);
           tfCor.setEnabled(false);
    }//GEN-LAST:event_rbSimplesActionPerformed

    private void rbEletricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEletricaActionPerformed
           cbxVoltagem.setEnabled(true);
           tfCor.setEnabled(false);
    }//GEN-LAST:event_rbEletricaActionPerformed

    private void rbComCoberturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbComCoberturaActionPerformed
           cbxVoltagem.setEnabled(false);
           tfCor.setEnabled(true);
    }//GEN-LAST:event_rbComCoberturaActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        String tipo, saida="";
        double soma=0;
        for (int i=0; i<motocas.size(); i++){           
            if (motocas.get(i) instanceof MotocaEletrica){
                tipo = "Motoca Elétrica";
            }
            else if (motocas.get(i) instanceof MotocaComCobertura){
                tipo = "Motoca com Cobertura";
            }
            else{
                tipo = "Motoca Simples";
            }
            
            Motoca m = motocas.get(i);
            saida += "\nCódigo: " + m.getCodigo() + " Personagem: " + m.getPersonagem() +
                    " Tipo: " + tipo + " Preço: " + m.precoFinal();            
            
            soma += m.precoFinal();
        }
        saida += "\n\nSoma dos preços: " + soma;
        JOptionPane.showMessageDialog(null, saida);
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Motoca.setValorBase(Double.parseDouble(tfPrecoBase.getText()));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbxVoltagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxVoltagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxVoltagemActionPerformed

    public void limpar(){
        tfCodigo.setText("");
        cbxPersonagem.setSelectedIndex(0);
        cbxVoltagem.setSelectedIndex(0);
        tfCor.setText("");
        rbSimples.setSelected(true);
    }
    
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
            java.util.logging.Logger.getLogger(formCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxPersonagem;
    private javax.swing.JComboBox<String> cbxVoltagem;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlCoddigo;
    private javax.swing.JLabel jlPersonagem;
    private javax.swing.JRadioButton rbComCobertura;
    private javax.swing.JRadioButton rbEletrica;
    private javax.swing.JRadioButton rbSimples;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfCor;
    private javax.swing.JTextField tfPrecoBase;
    // End of variables declaration//GEN-END:variables
}

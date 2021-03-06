
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mathe
 */
public class FuncionariosSwing extends javax.swing.JFrame {
    
    ArrayList<Funcionario> funcionario = new ArrayList();

    /**
     * Creates new form FuncionariosSwing
     */
    public FuncionariosSwing() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfSalarioB = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfSetor = new javax.swing.JTextField();
        rbAdm = new javax.swing.JRadioButton();
        rbProf = new javax.swing.JRadioButton();
        tbCadastro = new javax.swing.JToggleButton();
        tbExcluir = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        tbImprimirSetor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taImpressao = new javax.swing.JTextArea();
        tbImprimirSalarios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome:");

        jLabel2.setText("GERENCIAMENTO DE FUCIONARIOS");

        jLabel3.setText("Salario Bruto:");

        tfSalarioB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSalarioBActionPerformed(evt);
            }
        });

        jLabel4.setText("Setor:");

        tfSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSetorActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbAdm);
        rbAdm.setText("Administrativo");
        rbAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAdmActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbProf);
        rbProf.setText("Professor");
        rbProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbProfActionPerformed(evt);
            }
        });

        tbCadastro.setText("Cadastrar");
        tbCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbCadastroActionPerformed(evt);
            }
        });

        tbExcluir.setText("Excluir");
        tbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbExcluirActionPerformed(evt);
            }
        });

        jLabel5.setText("Tipo do funcionario:");

        tbImprimirSetor.setText("Imprimir setor");
        tbImprimirSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbImprimirSetorActionPerformed(evt);
            }
        });

        taImpressao.setColumns(20);
        taImpressao.setRows(5);
        jScrollPane1.setViewportView(taImpressao);

        tbImprimirSalarios.setText("Imprimir Salarios");
        tbImprimirSalarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbImprimirSalariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfSalarioB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbAdm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbProf))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tbCadastro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbImprimirSetor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbImprimirSalarios)))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tfSalarioB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tfSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rbAdm)
                    .addComponent(rbProf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbCadastro)
                    .addComponent(tbExcluir)
                    .addComponent(tbImprimirSetor)
                    .addComponent(tbImprimirSalarios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfSalarioBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSalarioBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSalarioBActionPerformed

    private void tfSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSetorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSetorActionPerformed

    private void tbCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbCadastroActionPerformed
        String nome = tfNome.getText();
        Double salario = Double.parseDouble(tfSalarioB.getText());
        String setor = tfSetor.getText();
        int cod = 0;
        
        if (rbAdm.isSelected()){
            cod=cod+1;
            funcionario.add((new FuncionarioAdministrativo(cod,nome,salario,setor)));
            tfNome.setText("");
            tfSalarioB.setText("");
            tfSetor.setText("");
        }
        else if (rbProf.isSelected()){
            cod=cod+1;
            funcionario.add(new FuncionarioProfessor(cod,nome,salario));
            tfNome.setText("");
            tfSalarioB.setText("");
        }
        
    }//GEN-LAST:event_tbCadastroActionPerformed

    private void rbAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAdmActionPerformed
        tfSetor.setEnabled(true);
    }//GEN-LAST:event_rbAdmActionPerformed

    private void rbProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbProfActionPerformed
        tfSetor.setEnabled(false);
    }//GEN-LAST:event_rbProfActionPerformed

    private void tbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbExcluirActionPerformed

    private void tbImprimirSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbImprimirSetorActionPerformed
        String setor=tfSetor.getText();
        for (int i=0;i<funcionario.size();i++){
            if (funcionario.get(i) instanceof FuncionarioAdministrativo){
                if (setor == Funcionario(setor)){
                    funcionario.toString();
                }
            }
            
        }
    }//GEN-LAST:event_tbImprimirSetorActionPerformed

    private void tbImprimirSalariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbImprimirSalariosActionPerformed
        Double soma1=0.0;
        Double soma2=0.0;
        for (int i=0;i<funcionario.size();i++){
            if (funcionario.get(i) instanceof FuncionarioAdministrativo){
                soma1=Funcionario.class.calcIR+1000;
                taImpressao.setText(FuncionarioAdministrativo.class.toString());
            }
            else if (funcionario.get(i) instanceof FuncionarioProfessor){
                taImpressao.setText(FuncionarioProfessor.class.toString());
            }
        }
    }//GEN-LAST:event_tbImprimirSalariosActionPerformed

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
            java.util.logging.Logger.getLogger(FuncionariosSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionariosSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionariosSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionariosSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionariosSwing().setVisible(true);
            }
        });
    }
    public void taNaLista(){
        String nom = tfNome.getText();
        for (int i=0; i<funcionario.size(); i++)
            if (funcionario.get(i) instanceof Funcionario){
                if (nom==funcionario(nome)){
                    
                }
        }
            }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbAdm;
    private javax.swing.JRadioButton rbProf;
    private javax.swing.JTextArea taImpressao;
    private javax.swing.JToggleButton tbCadastro;
    private javax.swing.JToggleButton tbExcluir;
    private javax.swing.JButton tbImprimirSalarios;
    private javax.swing.JButton tbImprimirSetor;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfSalarioB;
    private javax.swing.JTextField tfSetor;
    // End of variables declaration//GEN-END:variables
}

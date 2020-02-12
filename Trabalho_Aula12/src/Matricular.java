
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
public final class Matricular extends javax.swing.JFrame {

    /**
     * Creates new form Matricular
     */
    public Matricular() {
        initComponents();
        diretoNoCodigo();
        preencheComboAlunos();
        preencheComboTurmas();
    }
    
    ArrayList<AreaDoConhecimento> areaC = new ArrayList();
    ArrayList<Curso> curso = new ArrayList();
    ArrayList<Disciplina> disci = new ArrayList();
    ArrayList<Professor> prof = new ArrayList();
    ArrayList<Aluno> aluno = new ArrayList();
    ArrayList<Matricula> matri = new ArrayList();
    ArrayList<Turma> turmas = new ArrayList();
    
    public void diretoNoCodigo(){
        /* Area Do Conhecimento*/
        areaC.add(new AreaDoConhecimento(1, "Ciências Agrárias"));
        areaC.add(new AreaDoConhecimento(2, "Ciências Biológicas e da Saúde"));
        areaC.add(new AreaDoConhecimento(3, "Ciências Exatas e Tecnológicas"));
        areaC.add(new AreaDoConhecimento(4, "Ciências Humanas e Sociais"));
        
        /*Curso*/
        
        curso.add(new Curso(1, "Engenharia de Software", 24.56, areaC.get(2)));
        curso.add(new Curso(2, "Psicologia", 35.5, areaC.get(3)));
        curso.add(new Curso(3, "Agronomia", 45.23, areaC.get(0)));
        curso.add(new Curso(4, "Biomedicina", 56.45, areaC.get(1)));
        
        /*Disciplina*/
        
        disci.add(new Disciplina(1, "Anatomia", 6));
        disci.add(new Disciplina(2, "Calculo I", 4));
        disci.add(new Disciplina(3, "LPOO", 4));
        disci.add(new Disciplina(4, "Calculo III", 2));
        
        /*Aluno*/
        
        aluno.add(new Aluno(113840010, "Fulano Fulanisson", curso.get(0), "Vestibular", 2016));
        aluno.add(new Aluno(196740010, "Anna Banana", curso.get(3), "Vestibular", 2015));
        aluno.add(new Aluno(114567910, "Triste Tristonho", curso.get(0), "Bolsa", 2017));
        aluno.add(new Aluno(131848753, "Person Pessoa", curso.get(2), "Vestibular", 2016));
        
        /*Professores e Coordenadores*/
        
        prof.add(new Professor(1248654348, "Nome Nomin", curso.get(0), 25.5));
        prof.add(new Professor(1248654348, "Semcriati Vidade", curso.get(3), 38));
        prof.add(new Professor(1248654348, "Jaqueline Rosa", curso.get(2), 45));
        prof.add(new Coordenador(1248654348, "Paresse Memes", curso.get(1), 45, 2500));
        
        /*Turmas*/
        
        turmas.add(new TurmaTeorica(2405, "2019/1", "19h", 45, 0, disci.get(2), prof.get(0), 705));
        turmas.add(new TurmaTeorica(2405, "2019/1", "19h", 20, 0, disci.get(1), prof.get(3), 705));
        turmas.add(new TurmaTeorica(2405, "2019/1", "19h", 30, 0, disci.get(3), prof.get(2), 705));
        turmas.add(new TurmaPratica(2405, "2019/1", "19h", 15, 0, disci.get(0), prof.get(1), "Laboratorio VIII"));
        
        /*Matriculas*/
        
        matri.add(new Matricula(aluno.get(0), turmas.get(2), "22/05/2019"));
        matri.add(new Matricula(aluno.get(1), turmas.get(1), "22/05/2019"));
        matri.add(new Matricula(aluno.get(2), turmas.get(0), "22/05/2019"));
        matri.add(new Matricula(aluno.get(3), turmas.get(3), "22/05/2019"));
    }
    
    public void preencheComboAlunos(){
        cbxAluno.removeAllItems();
        aluno.forEach((a) -> {
            cbxAluno.addItem(a.getNome());
        });
    }
    
    public void preencheComboTurmas(){
        cbxTurma.removeAllItems();
        turmas.forEach((t) -> {
            cbxTurma.addItem(t.getDisciplina().getNome());
        });
    }
    
    public int verificaVagas(){
        Turma pegaTurma = (Turma) cbxTurma.getSelectedItem();
        if (pegaTurma.getQtAlunosMat() < pegaTurma.getQtTotalVagas()){
            return 0;
        }
        else{
            return 1;
        } 
            }
    
    public void adicionaMatricula(){
        Turma pegaTurma = (Turma) cbxTurma.getSelectedItem();
        Aluno pegaAluno = (Aluno) cbxAluno.getSelectedItem();
        matri.forEach((m) -> {
            int aux = m.getTurma().getQtAlunosMat();
            if (m.getAluno().equals(pegaAluno) && m.getTurma().equals(pegaTurma) || m.getAluno().equals(pegaAluno) && m.getTurma().equals(pegaTurma) && verificaVagas() == 1 ){
                JOptionPane.showMessageDialog(rootPane, "Aluno Ja matriculado na Turma ou turma esta cheia");
            }
            else if (verificaVagas() == 1){
                JOptionPane.showMessageDialog(rootPane, "Turma esta Cheia");
            }
            else{
                matri.add(new Matricula(pegaAluno, pegaTurma, tfData.getText()));
                m.getTurma().setQtAlunosMat(aux+1);
                JOptionPane.showMessageDialog(rootPane, "Aluno Matriculado");
            }
        });
    }
    
    public void imprimirMatriculas(){
        taSaida.setText("");
        Aluno pegaAluno = (Aluno) cbxAluno.getSelectedItem();
        
        for (Matricula m : matri){
            if (m.getAluno().equals(pegaAluno)){
                taSaida.setText("Nome do Aluno: ".concat(m.getAluno().getNome()).concat(" Curso do Aluno: ").concat(m.getAluno().getCurso().getNome()).concat("\n"));
                for (Matricula ma : matri){
                    taSaida.setText("Numero da turma: ".concat(Integer.toString((ma.getTurma().getNum()))).concat(" Nome da Disciplina: ").concat(ma.getTurma().getDisciplina().getNome()).concat(" Numero de creditos: ").concat(Integer.toString(ma.getTurma().getDisciplina().getQtCred())).concat("\n"));
                }
            }
        }
    }
    
    public void imprimirAlunosTurma(){
        taSaida.setText("");
        Turma pegaTurma = (Turma) cbxTurma.getSelectedItem();
        
        for (Turma t : turmas){
            if (t.equals(pegaTurma)){
                taSaida.setText("Numero da Turma: ".concat(Integer.toString(t.getNum())).concat(" Disciplina: ").concat(t.getDisciplina().getNome()).concat(t.getHorario()).concat("\n"));
                for (Aluno a : aluno){
                    taSaida.setText("Nome do aluno: " + a.getNome());
                }
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

        jLabel1 = new javax.swing.JLabel();
        cbxAluno = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbxTurma = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        tfData = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jbMatricular = new javax.swing.JToggleButton();
        jbAluno = new javax.swing.JToggleButton();
        jbTurma = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSaida = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Aluno:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Turma:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Data:");

        jbMatricular.setText("Matricular");
        jbMatricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMatricularActionPerformed(evt);
            }
        });

        jbAluno.setText("Imprimir Matriculas de Aluno Selecionado");
        jbAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlunoActionPerformed(evt);
            }
        });

        jbTurma.setText("Imprimir Alunos da Turma Selecionada");
        jbTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTurmaActionPerformed(evt);
            }
        });

        taSaida.setColumns(20);
        taSaida.setRows(5);
        taSaida.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Saida", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jScrollPane1.setViewportView(taSaida);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfData))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbAluno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbTurma))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addComponent(jbMatricular)))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbxTurma)
                        .addComponent(jLabel3)
                        .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(cbxAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbMatricular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAluno)
                    .addComponent(jbTurma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbMatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMatricularActionPerformed
        adicionaMatricula();
    }//GEN-LAST:event_jbMatricularActionPerformed

    private void jbAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlunoActionPerformed
        imprimirMatriculas();
    }//GEN-LAST:event_jbAlunoActionPerformed

    private void jbTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTurmaActionPerformed
        imprimirAlunosTurma();
    }//GEN-LAST:event_jbTurmaActionPerformed

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
            java.util.logging.Logger.getLogger(Matricular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matricular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matricular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matricular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matricular().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxAluno;
    private javax.swing.JComboBox<String> cbxTurma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jbAluno;
    private javax.swing.JToggleButton jbMatricular;
    private javax.swing.JToggleButton jbTurma;
    private javax.swing.JTextArea taSaida;
    private javax.swing.JTextField tfData;
    // End of variables declaration//GEN-END:variables
}
